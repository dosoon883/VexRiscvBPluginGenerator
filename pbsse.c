#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdint.h>

typedef uint32_t MpegEncContext; /* don't care */
typedef ssize_t ptrdiff_t;

#ifdef __riscv

#include "new_instructions_support_p.h"

static inline long long cpucycles_riscv(void) {
  long long result;
#if defined(__riscv_xlen)
#if __riscv_xlen == 64
  asm volatile("rdcycle %0" : "=r" (result));
#elif __riscv_xlen == 32
  unsigned int l, h, h2;
  asm volatile(	"start:\n"
		"rdcycleh %0\n"
		"rdcycle %1\n"  
		"rdcycleh %2\n"
		"bne %0, %2, start\n"
		: "=r" (h), "=r" (l), "=r" (h2));

  result = (((unsigned long long)h)<<32) | ((unsigned long long)l);
#else
#error "unknown __riscv_xlen"
#endif
#else // __riscv_xlen
#error "__riscv_xlen required for RISC-V support"
#endif // __riscv_xlen
  return result;
}
typedef uint32_t uint2x32_t[2];
static inline int sse8_r5vp(MpegEncContext *v, uint8_t *pix1, uint8_t *pix2,
                             ptrdiff_t stride, int h)
{
    int s = 0, i;

    for (i = 0; i < h; i++) {
        uint32_t p1 = ((uint32_t*)pix1)[0];
	uint32_t p2 = ((uint32_t*)pix2)[0];
	uint32_t pmin = __rv__umin8(p1, p2);
	uint32_t pmax = __rv__umax8(p1, p2);
	uint32_t pd = __rv__sub8(pmax, pmin);
#if 0
	uint64_t qs = __rv__umul8(pd, pd);
	/* uint32_t psl = (uint32_t)qs; */
	/* uint32_t psh = (uint32_t)(qs >> 32); */
	/* uint32_t ds = __rv__add16(psl, psh); */
	/* s += (ds & 0xFFFF); */
	/* s += (ds >> 16); */
	
	s += ((qs >>  0) & 0x000000000000FFFFull);
	s += ((qs >> 16) & 0x000000000000FFFFull);
	s += ((qs >> 32) & 0x000000000000FFFFull);
	s += ((qs >> 48) & 0x000000000000FFFFull);
#else
	s = __rv__umaqa(pd, pd, s);
#endif
	
	p1 = ((uint32_t*)pix1)[1];
	p2 = ((uint32_t*)pix2)[1];
	pmin = __rv__umin8(p1, p2);
	pmax = __rv__umax8(p1, p2);
	pd = __rv__sub8(pmax, pmin);
#if 0
	qs = __rv__umul8(pd, pd);
	/* psl = (uint32_t)qs; */
	/* psh = (uint32_t)(qs >> 32); */
	/* ds = __rv__add16(psl, psh); */
	/* s += (ds & 0xFFFF); */
	/* s += (ds >> 16); */
	
	s += ((qs >>  0) & 0x000000000000FFFFull);
	s += ((qs >> 16) & 0x000000000000FFFFull);
	s += ((qs >> 32) & 0x000000000000FFFFull);
	s += ((qs >> 48) & 0x000000000000FFFFull);
#else
	s = __rv__umaqa(pd, pd, s);
#endif
	
        pix1 += stride;
        pix2 += stride;
    }
    return s;
}
#endif // __riscv



/* lifted from FFmpeg */
const uint32_t ff_square_tab[512] = {
    65536, 65025, 64516, 64009, 63504, 63001, 62500, 62001, 61504, 61009, 60516, 60025, 59536, 59049, 58564, 58081,
    57600, 57121, 56644, 56169, 55696, 55225, 54756, 54289, 53824, 53361, 52900, 52441, 51984, 51529, 51076, 50625,
    50176, 49729, 49284, 48841, 48400, 47961, 47524, 47089, 46656, 46225, 45796, 45369, 44944, 44521, 44100, 43681,
    43264, 42849, 42436, 42025, 41616, 41209, 40804, 40401, 40000, 39601, 39204, 38809, 38416, 38025, 37636, 37249,
    36864, 36481, 36100, 35721, 35344, 34969, 34596, 34225, 33856, 33489, 33124, 32761, 32400, 32041, 31684, 31329,
    30976, 30625, 30276, 29929, 29584, 29241, 28900, 28561, 28224, 27889, 27556, 27225, 26896, 26569, 26244, 25921,
    25600, 25281, 24964, 24649, 24336, 24025, 23716, 23409, 23104, 22801, 22500, 22201, 21904, 21609, 21316, 21025,
    20736, 20449, 20164, 19881, 19600, 19321, 19044, 18769, 18496, 18225, 17956, 17689, 17424, 17161, 16900, 16641,
    16384, 16129, 15876, 15625, 15376, 15129, 14884, 14641, 14400, 14161, 13924, 13689, 13456, 13225, 12996, 12769,
    12544, 12321, 12100, 11881, 11664, 11449, 11236, 11025, 10816, 10609, 10404, 10201, 10000,  9801,  9604,  9409,
     9216,  9025,  8836,  8649,  8464,  8281,  8100,  7921,  7744,  7569,  7396,  7225,  7056,  6889,  6724,  6561,
     6400,  6241,  6084,  5929,  5776,  5625,  5476,  5329,  5184,  5041,  4900,  4761,  4624,  4489,  4356,  4225,
     4096,  3969,  3844,  3721,  3600,  3481,  3364,  3249,  3136,  3025,  2916,  2809,  2704,  2601,  2500,  2401,
     2304,  2209,  2116,  2025,  1936,  1849,  1764,  1681,  1600,  1521,  1444,  1369,  1296,  1225,  1156,  1089,
     1024,   961,   900,   841,   784,   729,   676,   625,   576,   529,   484,   441,   400,   361,   324,   289,
      256,   225,   196,   169,   144,   121,   100,    81,    64,    49,    36,    25,    16,     9,     4,     1,
        0,     1,     4,     9,    16,    25,    36,    49,    64,    81,   100,   121,   144,   169,   196,   225,
      256,   289,   324,   361,   400,   441,   484,   529,   576,   625,   676,   729,   784,   841,   900,   961,
     1024,  1089,  1156,  1225,  1296,  1369,  1444,  1521,  1600,  1681,  1764,  1849,  1936,  2025,  2116,  2209,
     2304,  2401,  2500,  2601,  2704,  2809,  2916,  3025,  3136,  3249,  3364,  3481,  3600,  3721,  3844,  3969,
     4096,  4225,  4356,  4489,  4624,  4761,  4900,  5041,  5184,  5329,  5476,  5625,  5776,  5929,  6084,  6241,
     6400,  6561,  6724,  6889,  7056,  7225,  7396,  7569,  7744,  7921,  8100,  8281,  8464,  8649,  8836,  9025,
     9216,  9409,  9604,  9801, 10000, 10201, 10404, 10609, 10816, 11025, 11236, 11449, 11664, 11881, 12100, 12321,
    12544, 12769, 12996, 13225, 13456, 13689, 13924, 14161, 14400, 14641, 14884, 15129, 15376, 15625, 15876, 16129,
    16384, 16641, 16900, 17161, 17424, 17689, 17956, 18225, 18496, 18769, 19044, 19321, 19600, 19881, 20164, 20449,
    20736, 21025, 21316, 21609, 21904, 22201, 22500, 22801, 23104, 23409, 23716, 24025, 24336, 24649, 24964, 25281,
    25600, 25921, 26244, 26569, 26896, 27225, 27556, 27889, 28224, 28561, 28900, 29241, 29584, 29929, 30276, 30625,
    30976, 31329, 31684, 32041, 32400, 32761, 33124, 33489, 33856, 34225, 34596, 34969, 35344, 35721, 36100, 36481,
    36864, 37249, 37636, 38025, 38416, 38809, 39204, 39601, 40000, 40401, 40804, 41209, 41616, 42025, 42436, 42849,
    43264, 43681, 44100, 44521, 44944, 45369, 45796, 46225, 46656, 47089, 47524, 47961, 48400, 48841, 49284, 49729,
    50176, 50625, 51076, 51529, 51984, 52441, 52900, 53361, 53824, 54289, 54756, 55225, 55696, 56169, 56644, 57121,
    57600, 58081, 58564, 59049, 59536, 60025, 60516, 61009, 61504, 62001, 62500, 63001, 63504, 64009, 64516, 65025,
};
static int sse8_c(MpegEncContext *v, uint8_t *pix1, uint8_t *pix2,
                  ptrdiff_t stride, int h)
{
    int s = 0, i;
    const uint32_t *sq = ff_square_tab + 256;

    for (i = 0; i < h; i++) {
        s    += sq[pix1[0] - pix2[0]];
        s    += sq[pix1[1] - pix2[1]];
        s    += sq[pix1[2] - pix2[2]];
        s    += sq[pix1[3] - pix2[3]];
        s    += sq[pix1[4] - pix2[4]];
        s    += sq[pix1[5] - pix2[5]];
        s    += sq[pix1[6] - pix2[6]];
        s    += sq[pix1[7] - pix2[7]];
        pix1 += stride;
        pix2 += stride;
    }
    return s;
}

int main(int argc, char **argv) {
  unsigned int seed = 0;
  uint8_t *pix1, *pix2;
  uint32_t i, j;
  
  if (argc > 1)
    seed = atol(argv[1]);

  srandom(seed);

  pix1 = malloc(8 * 4 * 8 * 4 * sizeof(uint8_t));
  pix2 = malloc(8 * 4 * 8 * 4 * sizeof(uint8_t));
  for (i = 0 ; i < 8 * 8 * 4 * 4 ; i ++) {
    pix1[i] = random() & 0xFF;
    pix2[i] = random() & 0xFF;
  }

  for (i = 0 ; i < 4 ; i++) {
    for (j = 0 ; j < 4 ; j++) {
      size_t offset = i*8+j*(8*4*8);
      long long t0 = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0;
#ifdef __riscv
      t0 = cpucycles_riscv();
#endif
      int res =  sse8_c(&i, pix1 + offset, pix2 + offset, 8 * 4, 8);
#ifdef __riscv
      t1 = cpucycles_riscv();
      int res2 =  sse8_r5vp(&i, pix1 + offset, pix2 + offset, 8 * 4, 8);
      t2 = cpucycles_riscv();
      int res3 =  sse8_c(&i, pix1 + offset, pix2 + offset, 8 * 4, 8);
      t3 = cpucycles_riscv();
      int res4 =  sse8_r5vp(&i, pix1 + offset, pix2 + offset, 8 * 4, 8);
      t4 = cpucycles_riscv();
#else
      int res2 = 0, res3 = 0, res4 = 0;
#endif
      printf("%u, %u: %d, %d / %d, %d (%llu, %llu / %llu, %llu)\n", i, j, res, res2, res3, res4, t1-t0, t2-t1, t3-t2, t4-t3);
    }
  }

  return 0;
}
