#ifndef crypto_core_aes256encrypt_H
#define crypto_core_aes256encrypt_H

#define crypto_core_aes256encrypt_dolbeau_std_4ft_OUTPUTBYTES 16
#define crypto_core_aes256encrypt_dolbeau_std_4ft_INPUTBYTES 16
#define crypto_core_aes256encrypt_dolbeau_std_4ft_KEYBYTES 32
#define crypto_core_aes256encrypt_dolbeau_std_4ft_CONSTBYTES 0
 
#ifdef __cplusplus
extern "C" {
#endif
extern int crypto_core_aes256encrypt_dolbeau_std_4ft(unsigned char *,const unsigned char *,const unsigned char *,const unsigned char *);
#ifdef __cplusplus
}
#endif

#define crypto_core_aes256encrypt crypto_core_aes256encrypt_dolbeau_std_4ft
#define crypto_core_aes256encrypt_OUTPUTBYTES crypto_core_aes256encrypt_dolbeau_std_4ft_OUTPUTBYTES
#define crypto_core_aes256encrypt_INPUTBYTES crypto_core_aes256encrypt_dolbeau_std_4ft_INPUTBYTES
#define crypto_core_aes256encrypt_KEYBYTES crypto_core_aes256encrypt_dolbeau_std_4ft_KEYBYTES
#define crypto_core_aes256encrypt_CONSTBYTES crypto_core_aes256encrypt_dolbeau_std_4ft_CONSTBYTES
#define crypto_core_aes256encrypt_IMPLEMENTATION "crypto_core/aes256encrypt/dolbeau/std-4ft"
#ifndef crypto_core_aes256encrypt_dolbeau_std_4ft_VERSION
#define crypto_core_aes256encrypt_dolbeau_std_4ft_VERSION "-"
#endif
#define crypto_core_aes256encrypt_VERSION crypto_core_aes256encrypt_dolbeau_std_4ft_VERSION

#endif
