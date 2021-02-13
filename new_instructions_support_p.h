#ifndef __NEW_INSTRUCTION_SUPPORT_P_H__
#define __NEW_INSTRUCTION_SUPPORT_P_H__

#include "new_instructions_support.h" // for support macros

ASM2MACRO(ADD8,0x48000077)
FUN2(__rv__add8,ADD8)
ASM2MACRO(RADD8,0x08000077)
FUN2(__rv__radd8,RADD8)
ASM2MACRO(RSUB8,0x0a000077)
FUN2(__rv__rsub8,RSUB8)
ASM2MACRO(CMPEQ8,0x4e000077)
FUN2(__rv__cmpeq8,CMPEQ8)
ASM1MACRO(CLZ8,0xae100077)
FUN1(__rv__clz8,CLZ8)
ASM1MACRO(CLO8,0xae300077)
FUN1(__rv__clo8,CLO8)
ASM1MACRO(CLRS8,0xae000077)
FUN1(__rv__clrs8,CLRS8)
ASM1MACRO(SWAP8,0xad800077)
FUN1(__rv__swap8,swap8)
ASM2MACRO(SCMPLE8,0x1e000077)
FUN2(__rv__scmple8,SCMPLE8)
ASM2MACRO(SCMPLT8,0x0e000077)
FUN2(__rv__scmplt8,SCMPLt8)
ASM2MACRO(SLL8,0x5c000077)
FUN2(__rv__sll8,SLL8)
ASM2MACRO(SRL8,0x5a000077)
FUN2(__rv__srl8,SRL8)
ASM2MACRO(SRA8,0x58000077)
FUN2(__rv__sra8,SRA8)
ASM2MACRO(SMAX8,0x8a000077)
FUN2(__rv__smax8,SMAX8)
ASM2MACRO(SMIN8,0x88000077)
FUN2(__rv__smin8,SMIN8)
ASM2MACRO(SUB8,0x4a000077)
FUN2(__rv__sub8,SUB8)
ASM2MACRO(UCMPLE8,0x3e000077)
FUN2(__rv__ucmple8,UCMPLE8)
ASM2MACRO(UCMPLT8,0x2e000077)
FUN2(__rv__ucmplt8,UCMPLt8)
ASM2MACRO(UMAX8,0x9a000077)
FUN2(__rv__umax8,UMAX8)
ASM2MACRO(UMIN8,0x98000077)
FUN2(__rv__umin8,UMIN8)
ASM2MACRO(URADD8,0x28000077)
FUN2(__rv__uradd8,URADD8)
ASM2MACRO(URSUB8,0x2a000077)
FUN2(__rv__ursub8,URSUB8)
  
ASM2MACRO(ADD16,0x40000077)
FUN2(__rv__add16,ADD16)
ASM2MACRO(RADD16,0x00000077)
FUN2(__rv__radd16,RADD16)
ASM2MACRO(RSUB16,0x02000077)
FUN2(__rv__rsub16,RSUB16)
ASM2MACRO(CMPEQ16,0x4c000077)
FUN2(__rv__cmpeq16,CMPEQ16)
ASM1MACRO(CLZ16,0xae900077)
FUN1(__rv__clz16,CLZ16)
ASM1MACRO(CLO16,0xaeb00077)
FUN1(__rv__clo16,CLO16)
ASM1MACRO(CLRS16,0xae800077)
FUN1(__rv__clrs16,CLRS16)
ASM1MACRO(SWAP16,0xad900077)
FUN1(__rv__swap16,swap16)
ASM2MACRO(SCMPLE16,0x1c000077)
FUN2(__rv__scmple16,SCMPLE16)
ASM2MACRO(SCMPLT16,0x0c000077)
FUN2(__rv__scmplt16,SCMPLT16)
ASM2MACRO(SLL16,0x54000077)
FUN2(__rv__sll16,SLL16)
ASM2MACRO(SRL16,0x52000077)
FUN2(__rv__srl16,SRL16)
ASM2MACRO(SRA16,0x50000077)
FUN2(__rv__sra16,SRA16)
ASM2MACRO(SMAX16,0x82000077)
FUN2(__rv__smax16,SMAX16)
ASM2MACRO(SMIN16,0x80000077)
FUN2(__rv__smin16,SMIN16)
ASM2MACRO(SUB16,0x42000077)
FUN2(__rv__sub16,SUB16)
ASM2MACRO(UCMPLE16,0x3c000077)
FUN2(__rv__ucmple16,UCMPLE16)
ASM2MACRO(UCMPLT16,0x2c000077)
FUN2(__rv__ucmplt16,UCMPLT16)
ASM2MACRO(UMAX16,0x92000077)
FUN2(__rv__umax16,UMAX16)
ASM2MACRO(UMIN16,0x90000077)
FUN2(__rv__umin16,UMIN16)

ASM2MACRO(PKBB16,0x0e001077)
FUN2(__rv__pkbb16,PKBB16)
ASM2MACRO(PKBT16,0x1e001077)
FUN2(__rv__pkbt16,PKBT16)
ASM2MACRO(PKTB16,0x2e001077)
FUN2(__rv__pktb16,PKTB16)
ASM2MACRO(PKTT16,0x3e001077)
FUN2(__rv__pktt16,PKTT16)
ASM2MACRO(URADD16,0x20000077)
FUN2(__rv__uradd16,URADD16)
ASM2MACRO(URSUB16,0x22000077)
FUN2(__rv__ursub16,URSUB16)


ASM2MACRO(RADDW,0x20001077)
FUN2(__rv__raddw,RADDW)
ASM2MACRO(RSUBW,0x22001077)
FUN2(__rv__rsubw,RSUBW)
ASM2MACRO(URADDW,0x30001077)
FUN2(__rv__uraddw,URADDW)
ASM2MACRO(URSUBW,0x32001077)
FUN2(__rv__ursubw,URSUBW)
ASM2MACRO(AVE,0xe0000077)
FUN2(__rv__ave,AVE)

ASM2MACRO(PBSAD, 0xfc000077)
FUN2(__rv__pbsad, PBSAD)
ASM3RMACRO(PBSADA, 0xfe000077)
FUN3R(__rv__pbsada, PBSADA)

ASM2MACRO(BITREV,0xe6000077)
FUN2(__rv__bitrev,BITREV)

ASM3RIMACRO(INSB, 0xac000077)
FUN3RI(__rv__insb, INSB, 0)
FUN3RI(__rv__insb, INSB, 1)
FUN3RI(__rv__insb, INSB, 2)
FUN3RI(__rv__insb, INSB, 3)
  
ASM2MACRO(SMUL8,0xa8000077)
FUN2W(__rv__smul8,SMUL8)
ASM2MACRO(UMUL8,0xb8000077)
FUN2W(__rv__umul8,UMUL8)
ASM2MACRO(SMUL16,0xa0000077)
FUN2W(__rv__smul16,SMUL16)
ASM2MACRO(UMUL16,0xb0000077)
FUN2W(__rv__umul16,UMUL16)
  
ASM2MACRO(SMULx8,0xaa000077)
FUN2W(__rv__smulx8,SMULx8)
ASM2MACRO(UMULx8,0xba000077)
FUN2W(__rv__umulx8,UMULx8)
ASM2MACRO(SMULx16,0xa2000077)
FUN2W(__rv__smulx16,SMULx16)
ASM2MACRO(UMULx16,0xb2000077)
FUN2W(__rv__umulx16,UMULx16)

#endif // __NEW_INSTRUCTION_SUPPORT_P_H__