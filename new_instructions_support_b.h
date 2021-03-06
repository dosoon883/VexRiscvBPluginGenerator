#ifndef __NEW_INSTRUCTION_SUPPORT_B_H__
#define __NEW_INSTRUCTION_SUPPORT_B_H__

#include <rvintrin.h> // assume we're using the B toolchain

#include "new_instructions_support.h" // for support macros

// for instructions currently missing in the toolchain
ASM2MACRO(XPERM_N,0x28002033)
ASM2MACRO(XPERM_B,0x28004033)
ASM2MACRO(XPERM_H,0x28006033)
ASM2MACRO(_SH1ADD,0x20002033)
ASM2MACRO(_SH2ADD,0x20004033)
ASM2MACRO(_SH3ADD,0x20006033)
FUN2(xperm_n,XPERM_N)
FUN2(xperm_b,XPERM_B)
FUN2(xperm_h,XPERM_H)
FUN2(_sh1add,_SH1ADD)
FUN2(_sh2add,_SH2ADD)
FUN2(_sh3add,_SH3ADD)

#endif // __NEW_INSTRUCTION_SUPPORT_B_H__
