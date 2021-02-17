// WARNING: this is auto-generated code!
// See https://github.com/rdolbeau/VexRiscvBPluginGenerator/
package vexriscv.plugin
import spinal.core._
import vexriscv.{Stageable, DecoderService, VexRiscv}
object CryptoZkndPlugin {
	object CryptoZkndCtrlaes0Enum extends SpinalEnum(binarySequential) {
		 val CTRL_aes32dsmi0, CTRL_aes32dsmi1, CTRL_aes32dsmi2, CTRL_aes32dsmi3 = newElement()
	}
	object CryptoZkndCtrlEnum extends SpinalEnum(binarySequential) {
		 val CTRL_aes0, CTRL_aes32dsi = newElement()
	}
	object CryptoZkndCtrlaes0 extends Stageable(CryptoZkndCtrlaes0Enum())
	object CryptoZkndCtrl extends Stageable(CryptoZkndCtrlEnum())
// Prologue

        // massive MUX implementing FT0
	def fun_aesft0_raw(in:Bits) : Bits = {
	    val x = in(7 downto 0)
	    val r = (x).mux(
				B"8'x00" -> B"24'xa563c6",
				B"8'x01" -> B"24'x847cf8",
				B"8'x02" -> B"24'x9977ee",
				B"8'x03" -> B"24'x8d7bf6",
				B"8'x04" -> B"24'x0df2ff",
				B"8'x05" -> B"24'xbd6bd6",
				B"8'x06" -> B"24'xb16fde",
				B"8'x07" -> B"24'x54c591",
				B"8'x08" -> B"24'x503060",
				B"8'x09" -> B"24'x030102",
				B"8'x0a" -> B"24'xa967ce",
				B"8'x0b" -> B"24'x7d2b56",
				B"8'x0c" -> B"24'x19fee7",
				B"8'x0d" -> B"24'x62d7b5",
				B"8'x0e" -> B"24'xe6ab4d",
				B"8'x0f" -> B"24'x9a76ec",
				B"8'x10" -> B"24'x45ca8f",
				B"8'x11" -> B"24'x9d821f",
				B"8'x12" -> B"24'x40c989",
				B"8'x13" -> B"24'x877dfa",
				B"8'x14" -> B"24'x15faef",
				B"8'x15" -> B"24'xeb59b2",
				B"8'x16" -> B"24'xc9478e",
				B"8'x17" -> B"24'x0bf0fb",
				B"8'x18" -> B"24'xecad41",
				B"8'x19" -> B"24'x67d4b3",
				B"8'x1a" -> B"24'xfda25f",
				B"8'x1b" -> B"24'xeaaf45",
				B"8'x1c" -> B"24'xbf9c23",
				B"8'x1d" -> B"24'xf7a453",
				B"8'x1e" -> B"24'x9672e4",
				B"8'x1f" -> B"24'x5bc09b",
				B"8'x20" -> B"24'xc2b775",
				B"8'x21" -> B"24'x1cfde1",
				B"8'x22" -> B"24'xae933d",
				B"8'x23" -> B"24'x6a264c",
				B"8'x24" -> B"24'x5a366c",
				B"8'x25" -> B"24'x413f7e",
				B"8'x26" -> B"24'x02f7f5",
				B"8'x27" -> B"24'x4fcc83",
				B"8'x28" -> B"24'x5c3468",
				B"8'x29" -> B"24'xf4a551",
				B"8'x2a" -> B"24'x34e5d1",
				B"8'x2b" -> B"24'x08f1f9",
				B"8'x2c" -> B"24'x9371e2",
				B"8'x2d" -> B"24'x73d8ab",
				B"8'x2e" -> B"24'x533162",
				B"8'x2f" -> B"24'x3f152a",
				B"8'x30" -> B"24'x0c0408",
				B"8'x31" -> B"24'x52c795",
				B"8'x32" -> B"24'x652346",
				B"8'x33" -> B"24'x5ec39d",
				B"8'x34" -> B"24'x281830",
				B"8'x35" -> B"24'xa19637",
				B"8'x36" -> B"24'x0f050a",
				B"8'x37" -> B"24'xb59a2f",
				B"8'x38" -> B"24'x09070e",
				B"8'x39" -> B"24'x361224",
				B"8'x3a" -> B"24'x9b801b",
				B"8'x3b" -> B"24'x3de2df",
				B"8'x3c" -> B"24'x26ebcd",
				B"8'x3d" -> B"24'x69274e",
				B"8'x3e" -> B"24'xcdb27f",
				B"8'x3f" -> B"24'x9f75ea",
				B"8'x40" -> B"24'x1b0912",
				B"8'x41" -> B"24'x9e831d",
				B"8'x42" -> B"24'x742c58",
				B"8'x43" -> B"24'x2e1a34",
				B"8'x44" -> B"24'x2d1b36",
				B"8'x45" -> B"24'xb26edc",
				B"8'x46" -> B"24'xee5ab4",
				B"8'x47" -> B"24'xfba05b",
				B"8'x48" -> B"24'xf652a4",
				B"8'x49" -> B"24'x4d3b76",
				B"8'x4a" -> B"24'x61d6b7",
				B"8'x4b" -> B"24'xceb37d",
				B"8'x4c" -> B"24'x7b2952",
				B"8'x4d" -> B"24'x3ee3dd",
				B"8'x4e" -> B"24'x712f5e",
				B"8'x4f" -> B"24'x978413",
				B"8'x50" -> B"24'xf553a6",
				B"8'x51" -> B"24'x68d1b9",
				B"8'x52" -> B"24'x000000",
				B"8'x53" -> B"24'x2cedc1",
				B"8'x54" -> B"24'x602040",
				B"8'x55" -> B"24'x1ffce3",
				B"8'x56" -> B"24'xc8b179",
				B"8'x57" -> B"24'xed5bb6",
				B"8'x58" -> B"24'xbe6ad4",
				B"8'x59" -> B"24'x46cb8d",
				B"8'x5a" -> B"24'xd9be67",
				B"8'x5b" -> B"24'x4b3972",
				B"8'x5c" -> B"24'xde4a94",
				B"8'x5d" -> B"24'xd44c98",
				B"8'x5e" -> B"24'xe858b0",
				B"8'x5f" -> B"24'x4acf85",
				B"8'x60" -> B"24'x6bd0bb",
				B"8'x61" -> B"24'x2aefc5",
				B"8'x62" -> B"24'xe5aa4f",
				B"8'x63" -> B"24'x16fbed",
				B"8'x64" -> B"24'xc54386",
				B"8'x65" -> B"24'xd74d9a",
				B"8'x66" -> B"24'x553366",
				B"8'x67" -> B"24'x948511",
				B"8'x68" -> B"24'xcf458a",
				B"8'x69" -> B"24'x10f9e9",
				B"8'x6a" -> B"24'x060204",
				B"8'x6b" -> B"24'x817ffe",
				B"8'x6c" -> B"24'xf050a0",
				B"8'x6d" -> B"24'x443c78",
				B"8'x6e" -> B"24'xba9f25",
				B"8'x6f" -> B"24'xe3a84b",
				B"8'x70" -> B"24'xf351a2",
				B"8'x71" -> B"24'xfea35d",
				B"8'x72" -> B"24'xc04080",
				B"8'x73" -> B"24'x8a8f05",
				B"8'x74" -> B"24'xad923f",
				B"8'x75" -> B"24'xbc9d21",
				B"8'x76" -> B"24'x483870",
				B"8'x77" -> B"24'x04f5f1",
				B"8'x78" -> B"24'xdfbc63",
				B"8'x79" -> B"24'xc1b677",
				B"8'x7a" -> B"24'x75daaf",
				B"8'x7b" -> B"24'x632142",
				B"8'x7c" -> B"24'x301020",
				B"8'x7d" -> B"24'x1affe5",
				B"8'x7e" -> B"24'x0ef3fd",
				B"8'x7f" -> B"24'x6dd2bf",
				B"8'x80" -> B"24'x4ccd81",
				B"8'x81" -> B"24'x140c18",
				B"8'x82" -> B"24'x351326",
				B"8'x83" -> B"24'x2fecc3",
				B"8'x84" -> B"24'xe15fbe",
				B"8'x85" -> B"24'xa29735",
				B"8'x86" -> B"24'xcc4488",
				B"8'x87" -> B"24'x39172e",
				B"8'x88" -> B"24'x57c493",
				B"8'x89" -> B"24'xf2a755",
				B"8'x8a" -> B"24'x827efc",
				B"8'x8b" -> B"24'x473d7a",
				B"8'x8c" -> B"24'xac64c8",
				B"8'x8d" -> B"24'xe75dba",
				B"8'x8e" -> B"24'x2b1932",
				B"8'x8f" -> B"24'x9573e6",
				B"8'x90" -> B"24'xa060c0",
				B"8'x91" -> B"24'x988119",
				B"8'x92" -> B"24'xd14f9e",
				B"8'x93" -> B"24'x7fdca3",
				B"8'x94" -> B"24'x662244",
				B"8'x95" -> B"24'x7e2a54",
				B"8'x96" -> B"24'xab903b",
				B"8'x97" -> B"24'x83880b",
				B"8'x98" -> B"24'xca468c",
				B"8'x99" -> B"24'x29eec7",
				B"8'x9a" -> B"24'xd3b86b",
				B"8'x9b" -> B"24'x3c1428",
				B"8'x9c" -> B"24'x79dea7",
				B"8'x9d" -> B"24'xe25ebc",
				B"8'x9e" -> B"24'x1d0b16",
				B"8'x9f" -> B"24'x76dbad",
				B"8'xa0" -> B"24'x3be0db",
				B"8'xa1" -> B"24'x563264",
				B"8'xa2" -> B"24'x4e3a74",
				B"8'xa3" -> B"24'x1e0a14",
				B"8'xa4" -> B"24'xdb4992",
				B"8'xa5" -> B"24'x0a060c",
				B"8'xa6" -> B"24'x6c2448",
				B"8'xa7" -> B"24'xe45cb8",
				B"8'xa8" -> B"24'x5dc29f",
				B"8'xa9" -> B"24'x6ed3bd",
				B"8'xaa" -> B"24'xefac43",
				B"8'xab" -> B"24'xa662c4",
				B"8'xac" -> B"24'xa89139",
				B"8'xad" -> B"24'xa49531",
				B"8'xae" -> B"24'x37e4d3",
				B"8'xaf" -> B"24'x8b79f2",
				B"8'xb0" -> B"24'x32e7d5",
				B"8'xb1" -> B"24'x43c88b",
				B"8'xb2" -> B"24'x59376e",
				B"8'xb3" -> B"24'xb76dda",
				B"8'xb4" -> B"24'x8c8d01",
				B"8'xb5" -> B"24'x64d5b1",
				B"8'xb6" -> B"24'xd24e9c",
				B"8'xb7" -> B"24'xe0a949",
				B"8'xb8" -> B"24'xb46cd8",
				B"8'xb9" -> B"24'xfa56ac",
				B"8'xba" -> B"24'x07f4f3",
				B"8'xbb" -> B"24'x25eacf",
				B"8'xbc" -> B"24'xaf65ca",
				B"8'xbd" -> B"24'x8e7af4",
				B"8'xbe" -> B"24'xe9ae47",
				B"8'xbf" -> B"24'x180810",
				B"8'xc0" -> B"24'xd5ba6f",
				B"8'xc1" -> B"24'x8878f0",
				B"8'xc2" -> B"24'x6f254a",
				B"8'xc3" -> B"24'x722e5c",
				B"8'xc4" -> B"24'x241c38",
				B"8'xc5" -> B"24'xf1a657",
				B"8'xc6" -> B"24'xc7b473",
				B"8'xc7" -> B"24'x51c697",
				B"8'xc8" -> B"24'x23e8cb",
				B"8'xc9" -> B"24'x7cdda1",
				B"8'xca" -> B"24'x9c74e8",
				B"8'xcb" -> B"24'x211f3e",
				B"8'xcc" -> B"24'xdd4b96",
				B"8'xcd" -> B"24'xdcbd61",
				B"8'xce" -> B"24'x868b0d",
				B"8'xcf" -> B"24'x858a0f",
				B"8'xd0" -> B"24'x9070e0",
				B"8'xd1" -> B"24'x423e7c",
				B"8'xd2" -> B"24'xc4b571",
				B"8'xd3" -> B"24'xaa66cc",
				B"8'xd4" -> B"24'xd84890",
				B"8'xd5" -> B"24'x050306",
				B"8'xd6" -> B"24'x01f6f7",
				B"8'xd7" -> B"24'x120e1c",
				B"8'xd8" -> B"24'xa361c2",
				B"8'xd9" -> B"24'x5f356a",
				B"8'xda" -> B"24'xf957ae",
				B"8'xdb" -> B"24'xd0b969",
				B"8'xdc" -> B"24'x918617",
				B"8'xdd" -> B"24'x58c199",
				B"8'xde" -> B"24'x271d3a",
				B"8'xdf" -> B"24'xb99e27",
				B"8'xe0" -> B"24'x38e1d9",
				B"8'xe1" -> B"24'x13f8eb",
				B"8'xe2" -> B"24'xb3982b",
				B"8'xe3" -> B"24'x331122",
				B"8'xe4" -> B"24'xbb69d2",
				B"8'xe5" -> B"24'x70d9a9",
				B"8'xe6" -> B"24'x898e07",
				B"8'xe7" -> B"24'xa79433",
				B"8'xe8" -> B"24'xb69b2d",
				B"8'xe9" -> B"24'x221e3c",
				B"8'xea" -> B"24'x928715",
				B"8'xeb" -> B"24'x20e9c9",
				B"8'xec" -> B"24'x49ce87",
				B"8'xed" -> B"24'xff55aa",
				B"8'xee" -> B"24'x782850",
				B"8'xef" -> B"24'x7adfa5",
				B"8'xf0" -> B"24'x8f8c03",
				B"8'xf1" -> B"24'xf8a159",
				B"8'xf2" -> B"24'x808909",
				B"8'xf3" -> B"24'x170d1a",
				B"8'xf4" -> B"24'xdabf65",
				B"8'xf5" -> B"24'x31e6d7",
				B"8'xf6" -> B"24'xc64284",
				B"8'xf7" -> B"24'xb868d0",
				B"8'xf8" -> B"24'xc34182",
				B"8'xf9" -> B"24'xb09929",
				B"8'xfa" -> B"24'x772d5a",
				B"8'xfb" -> B"24'x110f1e",
				B"8'xfc" -> B"24'xcbb07b",
				B"8'xfd" -> B"24'xfc54a8",
				B"8'xfe" -> B"24'xd6bb6d",
				B"8'xff" -> B"24'x3a162c")
		r // return value;
	}

	def fun_aes32esmi0(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(7 downto 0)
	    val r = fun_aesft0_raw(idx)
	    (r(23 downto 8) ## r(15 downto 0)) ^ rs2 // return value
	}
	def fun_aes32esmi1(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(15 downto 8)
	    val r = fun_aesft0_raw(idx)
	    (r(15 downto 8) ## r(15 downto 0) ## r(23 downto 16)) ^ rs2 // return value
	}
	def fun_aes32esmi2(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(23 downto 16)
	    val r = fun_aesft0_raw(idx)
	    (r(15 downto 0) ## r(23 downto 8)) ^ rs2 // return value
	}
	def fun_aes32esmi3(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(31 downto 24)
	    val r = fun_aesft0_raw(idx)
	    (r(7 downto 0) ## r(23 downto 8) ## r(15 downto 8)) ^ rs2 // return value
	}

	// reuse the middle column of FT0 as FSb
	def fun_aes32esi0(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(7 downto 0)
	    val r = fun_aesft0_raw(idx)
	    (r(15 downto 8).resize(32)       ) ^ rs2 // return value
	}
	def fun_aes32esi1(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(15 downto 8)
	    val r = fun_aesft0_raw(idx)
	    (r(15 downto 8).resize(32) |<<  8) ^ rs2 // return value
	}
	def fun_aes32esi2(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(23 downto 16)
	    val r = fun_aesft0_raw(idx)
	    (r(15 downto 8).resize(32) |<< 16) ^ rs2 // return value
	}
	def fun_aes32esi3(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(31 downto 24)
	    val r = fun_aesft0_raw(idx)
	    (r(15 downto 8).resize(32) |<< 24) ^ rs2 // return value
	}

        // even more massive MUX implementing RT0
	def fun_aesrt0_raw(in:Bits) : Bits = {
	    val x = in(7 downto 0)
	    val r = (x).mux(
				B"8'x00" -> B"32'x50a7f451",
				B"8'x01" -> B"32'x5365417e",
				B"8'x02" -> B"32'xc3a4171a",
				B"8'x03" -> B"32'x965e273a",
				B"8'x04" -> B"32'xcb6bab3b",
				B"8'x05" -> B"32'xf1459d1f",
				B"8'x06" -> B"32'xab58faac",
				B"8'x07" -> B"32'x9303e34b",
				B"8'x08" -> B"32'x55fa3020",
				B"8'x09" -> B"32'xf66d76ad",
				B"8'x0a" -> B"32'x9176cc88",
				B"8'x0b" -> B"32'x254c02f5",
				B"8'x0c" -> B"32'xfcd7e54f",
				B"8'x0d" -> B"32'xd7cb2ac5",
				B"8'x0e" -> B"32'x80443526",
				B"8'x0f" -> B"32'x8fa362b5",
				B"8'x10" -> B"32'x495ab1de",
				B"8'x11" -> B"32'x671bba25",
				B"8'x12" -> B"32'x980eea45",
				B"8'x13" -> B"32'xe1c0fe5d",
				B"8'x14" -> B"32'x02752fc3",
				B"8'x15" -> B"32'x12f04c81",
				B"8'x16" -> B"32'xa397468d",
				B"8'x17" -> B"32'xc6f9d36b",
				B"8'x18" -> B"32'xe75f8f03",
				B"8'x19" -> B"32'x959c9215",
				B"8'x1a" -> B"32'xeb7a6dbf",
				B"8'x1b" -> B"32'xda595295",
				B"8'x1c" -> B"32'x2d83bed4",
				B"8'x1d" -> B"32'xd3217458",
				B"8'x1e" -> B"32'x2969e049",
				B"8'x1f" -> B"32'x44c8c98e",
				B"8'x20" -> B"32'x6a89c275",
				B"8'x21" -> B"32'x78798ef4",
				B"8'x22" -> B"32'x6b3e5899",
				B"8'x23" -> B"32'xdd71b927",
				B"8'x24" -> B"32'xb64fe1be",
				B"8'x25" -> B"32'x17ad88f0",
				B"8'x26" -> B"32'x66ac20c9",
				B"8'x27" -> B"32'xb43ace7d",
				B"8'x28" -> B"32'x184adf63",
				B"8'x29" -> B"32'x82311ae5",
				B"8'x2a" -> B"32'x60335197",
				B"8'x2b" -> B"32'x457f5362",
				B"8'x2c" -> B"32'xe07764b1",
				B"8'x2d" -> B"32'x84ae6bbb",
				B"8'x2e" -> B"32'x1ca081fe",
				B"8'x2f" -> B"32'x942b08f9",
				B"8'x30" -> B"32'x58684870",
				B"8'x31" -> B"32'x19fd458f",
				B"8'x32" -> B"32'x876cde94",
				B"8'x33" -> B"32'xb7f87b52",
				B"8'x34" -> B"32'x23d373ab",
				B"8'x35" -> B"32'xe2024b72",
				B"8'x36" -> B"32'x578f1fe3",
				B"8'x37" -> B"32'x2aab5566",
				B"8'x38" -> B"32'x0728ebb2",
				B"8'x39" -> B"32'x03c2b52f",
				B"8'x3a" -> B"32'x9a7bc586",
				B"8'x3b" -> B"32'xa50837d3",
				B"8'x3c" -> B"32'xf2872830",
				B"8'x3d" -> B"32'xb2a5bf23",
				B"8'x3e" -> B"32'xba6a0302",
				B"8'x3f" -> B"32'x5c8216ed",
				B"8'x40" -> B"32'x2b1ccf8a",
				B"8'x41" -> B"32'x92b479a7",
				B"8'x42" -> B"32'xf0f207f3",
				B"8'x43" -> B"32'xa1e2694e",
				B"8'x44" -> B"32'xcdf4da65",
				B"8'x45" -> B"32'xd5be0506",
				B"8'x46" -> B"32'x1f6234d1",
				B"8'x47" -> B"32'x8afea6c4",
				B"8'x48" -> B"32'x9d532e34",
				B"8'x49" -> B"32'xa055f3a2",
				B"8'x4a" -> B"32'x32e18a05",
				B"8'x4b" -> B"32'x75ebf6a4",
				B"8'x4c" -> B"32'x39ec830b",
				B"8'x4d" -> B"32'xaaef6040",
				B"8'x4e" -> B"32'x069f715e",
				B"8'x4f" -> B"32'x51106ebd",
				B"8'x50" -> B"32'xf98a213e",
				B"8'x51" -> B"32'x3d06dd96",
				B"8'x52" -> B"32'xae053edd",
				B"8'x53" -> B"32'x46bde64d",
				B"8'x54" -> B"32'xb58d5491",
				B"8'x55" -> B"32'x055dc471",
				B"8'x56" -> B"32'x6fd40604",
				B"8'x57" -> B"32'xff155060",
				B"8'x58" -> B"32'x24fb9819",
				B"8'x59" -> B"32'x97e9bdd6",
				B"8'x5a" -> B"32'xcc434089",
				B"8'x5b" -> B"32'x779ed967",
				B"8'x5c" -> B"32'xbd42e8b0",
				B"8'x5d" -> B"32'x888b8907",
				B"8'x5e" -> B"32'x385b19e7",
				B"8'x5f" -> B"32'xdbeec879",
				B"8'x60" -> B"32'x470a7ca1",
				B"8'x61" -> B"32'xe90f427c",
				B"8'x62" -> B"32'xc91e84f8",
				B"8'x63" -> B"32'x00000000",
				B"8'x64" -> B"32'x83868009",
				B"8'x65" -> B"32'x48ed2b32",
				B"8'x66" -> B"32'xac70111e",
				B"8'x67" -> B"32'x4e725a6c",
				B"8'x68" -> B"32'xfbff0efd",
				B"8'x69" -> B"32'x5638850f",
				B"8'x6a" -> B"32'x1ed5ae3d",
				B"8'x6b" -> B"32'x27392d36",
				B"8'x6c" -> B"32'x64d90f0a",
				B"8'x6d" -> B"32'x21a65c68",
				B"8'x6e" -> B"32'xd1545b9b",
				B"8'x6f" -> B"32'x3a2e3624",
				B"8'x70" -> B"32'xb1670a0c",
				B"8'x71" -> B"32'x0fe75793",
				B"8'x72" -> B"32'xd296eeb4",
				B"8'x73" -> B"32'x9e919b1b",
				B"8'x74" -> B"32'x4fc5c080",
				B"8'x75" -> B"32'xa220dc61",
				B"8'x76" -> B"32'x694b775a",
				B"8'x77" -> B"32'x161a121c",
				B"8'x78" -> B"32'x0aba93e2",
				B"8'x79" -> B"32'xe52aa0c0",
				B"8'x7a" -> B"32'x43e0223c",
				B"8'x7b" -> B"32'x1d171b12",
				B"8'x7c" -> B"32'x0b0d090e",
				B"8'x7d" -> B"32'xadc78bf2",
				B"8'x7e" -> B"32'xb9a8b62d",
				B"8'x7f" -> B"32'xc8a91e14",
				B"8'x80" -> B"32'x8519f157",
				B"8'x81" -> B"32'x4c0775af",
				B"8'x82" -> B"32'xbbdd99ee",
				B"8'x83" -> B"32'xfd607fa3",
				B"8'x84" -> B"32'x9f2601f7",
				B"8'x85" -> B"32'xbcf5725c",
				B"8'x86" -> B"32'xc53b6644",
				B"8'x87" -> B"32'x347efb5b",
				B"8'x88" -> B"32'x7629438b",
				B"8'x89" -> B"32'xdcc623cb",
				B"8'x8a" -> B"32'x68fcedb6",
				B"8'x8b" -> B"32'x63f1e4b8",
				B"8'x8c" -> B"32'xcadc31d7",
				B"8'x8d" -> B"32'x10856342",
				B"8'x8e" -> B"32'x40229713",
				B"8'x8f" -> B"32'x2011c684",
				B"8'x90" -> B"32'x7d244a85",
				B"8'x91" -> B"32'xf83dbbd2",
				B"8'x92" -> B"32'x1132f9ae",
				B"8'x93" -> B"32'x6da129c7",
				B"8'x94" -> B"32'x4b2f9e1d",
				B"8'x95" -> B"32'xf330b2dc",
				B"8'x96" -> B"32'xec52860d",
				B"8'x97" -> B"32'xd0e3c177",
				B"8'x98" -> B"32'x6c16b32b",
				B"8'x99" -> B"32'x99b970a9",
				B"8'x9a" -> B"32'xfa489411",
				B"8'x9b" -> B"32'x2264e947",
				B"8'x9c" -> B"32'xc48cfca8",
				B"8'x9d" -> B"32'x1a3ff0a0",
				B"8'x9e" -> B"32'xd82c7d56",
				B"8'x9f" -> B"32'xef903322",
				B"8'xa0" -> B"32'xc74e4987",
				B"8'xa1" -> B"32'xc1d138d9",
				B"8'xa2" -> B"32'xfea2ca8c",
				B"8'xa3" -> B"32'x360bd498",
				B"8'xa4" -> B"32'xcf81f5a6",
				B"8'xa5" -> B"32'x28de7aa5",
				B"8'xa6" -> B"32'x268eb7da",
				B"8'xa7" -> B"32'xa4bfad3f",
				B"8'xa8" -> B"32'xe49d3a2c",
				B"8'xa9" -> B"32'x0d927850",
				B"8'xaa" -> B"32'x9bcc5f6a",
				B"8'xab" -> B"32'x62467e54",
				B"8'xac" -> B"32'xc2138df6",
				B"8'xad" -> B"32'xe8b8d890",
				B"8'xae" -> B"32'x5ef7392e",
				B"8'xaf" -> B"32'xf5afc382",
				B"8'xb0" -> B"32'xbe805d9f",
				B"8'xb1" -> B"32'x7c93d069",
				B"8'xb2" -> B"32'xa92dd56f",
				B"8'xb3" -> B"32'xb31225cf",
				B"8'xb4" -> B"32'x3b99acc8",
				B"8'xb5" -> B"32'xa77d1810",
				B"8'xb6" -> B"32'x6e639ce8",
				B"8'xb7" -> B"32'x7bbb3bdb",
				B"8'xb8" -> B"32'x097826cd",
				B"8'xb9" -> B"32'xf418596e",
				B"8'xba" -> B"32'x01b79aec",
				B"8'xbb" -> B"32'xa89a4f83",
				B"8'xbc" -> B"32'x656e95e6",
				B"8'xbd" -> B"32'x7ee6ffaa",
				B"8'xbe" -> B"32'x08cfbc21",
				B"8'xbf" -> B"32'xe6e815ef",
				B"8'xc0" -> B"32'xd99be7ba",
				B"8'xc1" -> B"32'xce366f4a",
				B"8'xc2" -> B"32'xd4099fea",
				B"8'xc3" -> B"32'xd67cb029",
				B"8'xc4" -> B"32'xafb2a431",
				B"8'xc5" -> B"32'x31233f2a",
				B"8'xc6" -> B"32'x3094a5c6",
				B"8'xc7" -> B"32'xc066a235",
				B"8'xc8" -> B"32'x37bc4e74",
				B"8'xc9" -> B"32'xa6ca82fc",
				B"8'xca" -> B"32'xb0d090e0",
				B"8'xcb" -> B"32'x15d8a733",
				B"8'xcc" -> B"32'x4a9804f1",
				B"8'xcd" -> B"32'xf7daec41",
				B"8'xce" -> B"32'x0e50cd7f",
				B"8'xcf" -> B"32'x2ff69117",
				B"8'xd0" -> B"32'x8dd64d76",
				B"8'xd1" -> B"32'x4db0ef43",
				B"8'xd2" -> B"32'x544daacc",
				B"8'xd3" -> B"32'xdf0496e4",
				B"8'xd4" -> B"32'xe3b5d19e",
				B"8'xd5" -> B"32'x1b886a4c",
				B"8'xd6" -> B"32'xb81f2cc1",
				B"8'xd7" -> B"32'x7f516546",
				B"8'xd8" -> B"32'x04ea5e9d",
				B"8'xd9" -> B"32'x5d358c01",
				B"8'xda" -> B"32'x737487fa",
				B"8'xdb" -> B"32'x2e410bfb",
				B"8'xdc" -> B"32'x5a1d67b3",
				B"8'xdd" -> B"32'x52d2db92",
				B"8'xde" -> B"32'x335610e9",
				B"8'xdf" -> B"32'x1347d66d",
				B"8'xe0" -> B"32'x8c61d79a",
				B"8'xe1" -> B"32'x7a0ca137",
				B"8'xe2" -> B"32'x8e14f859",
				B"8'xe3" -> B"32'x893c13eb",
				B"8'xe4" -> B"32'xee27a9ce",
				B"8'xe5" -> B"32'x35c961b7",
				B"8'xe6" -> B"32'xede51ce1",
				B"8'xe7" -> B"32'x3cb1477a",
				B"8'xe8" -> B"32'x59dfd29c",
				B"8'xe9" -> B"32'x3f73f255",
				B"8'xea" -> B"32'x79ce1418",
				B"8'xeb" -> B"32'xbf37c773",
				B"8'xec" -> B"32'xeacdf753",
				B"8'xed" -> B"32'x5baafd5f",
				B"8'xee" -> B"32'x146f3ddf",
				B"8'xef" -> B"32'x86db4478",
				B"8'xf0" -> B"32'x81f3afca",
				B"8'xf1" -> B"32'x3ec468b9",
				B"8'xf2" -> B"32'x2c342438",
				B"8'xf3" -> B"32'x5f40a3c2",
				B"8'xf4" -> B"32'x72c31d16",
				B"8'xf5" -> B"32'x0c25e2bc",
				B"8'xf6" -> B"32'x8b493c28",
				B"8'xf7" -> B"32'x41950dff",
				B"8'xf8" -> B"32'x7101a839",
				B"8'xf9" -> B"32'xdeb30c08",
				B"8'xfa" -> B"32'x9ce4b4d8",
				B"8'xfb" -> B"32'x90c15664",
				B"8'xfc" -> B"32'x6184cb7b",
				B"8'xfd" -> B"32'x70b632d5",
				B"8'xfe" -> B"32'x745c6c48",
				B"8'xff" -> B"32'x4257b8d0"
		)
		r // return value;
	}

	def fun_aes32dsmi0(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(7 downto 0)
	    val r = fun_aesrt0_raw(idx)
	    r(31 downto 0) ^ rs2 // return value
	}
	def fun_aes32dsmi1(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(15 downto 8)
	    val r = fun_aesrt0_raw(idx)
	    (r(23 downto 0) ## r(31 downto 24)) ^ rs2 // return value
	}
	def fun_aes32dsmi2(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(23 downto 16)
	    val r = fun_aesrt0_raw(idx)
	    (r(15 downto 0) ## r(31 downto 16)) ^ rs2 // return value
	}
	def fun_aes32dsmi3(rs1: Bits, rs2: Bits) : Bits = {
	    val idx = rs1(31 downto 24)
	    val r = fun_aesrt0_raw(idx)
	    (r(7 downto 0) ## r(31 downto 8)) ^ rs2 // return value
	}

	def fun_aesrsb_raw(in:Bits) : Bits = {
	    val x = in(7 downto 0)
	    val r = (x).mux(
				B"8'x00" -> B"8'x52",
				B"8'x01" -> B"8'x09",
				B"8'x02" -> B"8'x6a",
				B"8'x03" -> B"8'xd5",
				B"8'x04" -> B"8'x30",
				B"8'x05" -> B"8'x36",
				B"8'x06" -> B"8'xa5",
				B"8'x07" -> B"8'x38",
				B"8'x08" -> B"8'xbf",
				B"8'x09" -> B"8'x40",
				B"8'x0a" -> B"8'xa3",
				B"8'x0b" -> B"8'x9e",
				B"8'x0c" -> B"8'x81",
				B"8'x0d" -> B"8'xf3",
				B"8'x0e" -> B"8'xd7",
				B"8'x0f" -> B"8'xfb",
				B"8'x10" -> B"8'x7c",
				B"8'x11" -> B"8'xe3",
				B"8'x12" -> B"8'x39",
				B"8'x13" -> B"8'x82",
				B"8'x14" -> B"8'x9b",
				B"8'x15" -> B"8'x2f",
				B"8'x16" -> B"8'xff",
				B"8'x17" -> B"8'x87",
				B"8'x18" -> B"8'x34",
				B"8'x19" -> B"8'x8e",
				B"8'x1a" -> B"8'x43",
				B"8'x1b" -> B"8'x44",
				B"8'x1c" -> B"8'xc4",
				B"8'x1d" -> B"8'xde",
				B"8'x1e" -> B"8'xe9",
				B"8'x1f" -> B"8'xcb",
				B"8'x20" -> B"8'x54",
				B"8'x21" -> B"8'x7b",
				B"8'x22" -> B"8'x94",
				B"8'x23" -> B"8'x32",
				B"8'x24" -> B"8'xa6",
				B"8'x25" -> B"8'xc2",
				B"8'x26" -> B"8'x23",
				B"8'x27" -> B"8'x3d",
				B"8'x28" -> B"8'xee",
				B"8'x29" -> B"8'x4c",
				B"8'x2a" -> B"8'x95",
				B"8'x2b" -> B"8'x0b",
				B"8'x2c" -> B"8'x42",
				B"8'x2d" -> B"8'xfa",
				B"8'x2e" -> B"8'xc3",
				B"8'x2f" -> B"8'x4e",
				B"8'x30" -> B"8'x08",
				B"8'x31" -> B"8'x2e",
				B"8'x32" -> B"8'xa1",
				B"8'x33" -> B"8'x66",
				B"8'x34" -> B"8'x28",
				B"8'x35" -> B"8'xd9",
				B"8'x36" -> B"8'x24",
				B"8'x37" -> B"8'xb2",
				B"8'x38" -> B"8'x76",
				B"8'x39" -> B"8'x5b",
				B"8'x3a" -> B"8'xa2",
				B"8'x3b" -> B"8'x49",
				B"8'x3c" -> B"8'x6d",
				B"8'x3d" -> B"8'x8b",
				B"8'x3e" -> B"8'xd1",
				B"8'x3f" -> B"8'x25",
				B"8'x40" -> B"8'x72",
				B"8'x41" -> B"8'xf8",
				B"8'x42" -> B"8'xf6",
				B"8'x43" -> B"8'x64",
				B"8'x44" -> B"8'x86",
				B"8'x45" -> B"8'x68",
				B"8'x46" -> B"8'x98",
				B"8'x47" -> B"8'x16",
				B"8'x48" -> B"8'xd4",
				B"8'x49" -> B"8'xa4",
				B"8'x4a" -> B"8'x5c",
				B"8'x4b" -> B"8'xcc",
				B"8'x4c" -> B"8'x5d",
				B"8'x4d" -> B"8'x65",
				B"8'x4e" -> B"8'xb6",
				B"8'x4f" -> B"8'x92",
				B"8'x50" -> B"8'x6c",
				B"8'x51" -> B"8'x70",
				B"8'x52" -> B"8'x48",
				B"8'x53" -> B"8'x50",
				B"8'x54" -> B"8'xfd",
				B"8'x55" -> B"8'xed",
				B"8'x56" -> B"8'xb9",
				B"8'x57" -> B"8'xda",
				B"8'x58" -> B"8'x5e",
				B"8'x59" -> B"8'x15",
				B"8'x5a" -> B"8'x46",
				B"8'x5b" -> B"8'x57",
				B"8'x5c" -> B"8'xa7",
				B"8'x5d" -> B"8'x8d",
				B"8'x5e" -> B"8'x9d",
				B"8'x5f" -> B"8'x84",
				B"8'x60" -> B"8'x90",
				B"8'x61" -> B"8'xd8",
				B"8'x62" -> B"8'xab",
				B"8'x63" -> B"8'x00",
				B"8'x64" -> B"8'x8c",
				B"8'x65" -> B"8'xbc",
				B"8'x66" -> B"8'xd3",
				B"8'x67" -> B"8'x0a",
				B"8'x68" -> B"8'xf7",
				B"8'x69" -> B"8'xe4",
				B"8'x6a" -> B"8'x58",
				B"8'x6b" -> B"8'x05",
				B"8'x6c" -> B"8'xb8",
				B"8'x6d" -> B"8'xb3",
				B"8'x6e" -> B"8'x45",
				B"8'x6f" -> B"8'x06",
				B"8'x70" -> B"8'xd0",
				B"8'x71" -> B"8'x2c",
				B"8'x72" -> B"8'x1e",
				B"8'x73" -> B"8'x8f",
				B"8'x74" -> B"8'xca",
				B"8'x75" -> B"8'x3f",
				B"8'x76" -> B"8'x0f",
				B"8'x77" -> B"8'x02",
				B"8'x78" -> B"8'xc1",
				B"8'x79" -> B"8'xaf",
				B"8'x7a" -> B"8'xbd",
				B"8'x7b" -> B"8'x03",
				B"8'x7c" -> B"8'x01",
				B"8'x7d" -> B"8'x13",
				B"8'x7e" -> B"8'x8a",
				B"8'x7f" -> B"8'x6b",
				B"8'x80" -> B"8'x3a",
				B"8'x81" -> B"8'x91",
				B"8'x82" -> B"8'x11",
				B"8'x83" -> B"8'x41",
				B"8'x84" -> B"8'x4f",
				B"8'x85" -> B"8'x67",
				B"8'x86" -> B"8'xdc",
				B"8'x87" -> B"8'xea",
				B"8'x88" -> B"8'x97",
				B"8'x89" -> B"8'xf2",
				B"8'x8a" -> B"8'xcf",
				B"8'x8b" -> B"8'xce",
				B"8'x8c" -> B"8'xf0",
				B"8'x8d" -> B"8'xb4",
				B"8'x8e" -> B"8'xe6",
				B"8'x8f" -> B"8'x73",
				B"8'x90" -> B"8'x96",
				B"8'x91" -> B"8'xac",
				B"8'x92" -> B"8'x74",
				B"8'x93" -> B"8'x22",
				B"8'x94" -> B"8'xe7",
				B"8'x95" -> B"8'xad",
				B"8'x96" -> B"8'x35",
				B"8'x97" -> B"8'x85",
				B"8'x98" -> B"8'xe2",
				B"8'x99" -> B"8'xf9",
				B"8'x9a" -> B"8'x37",
				B"8'x9b" -> B"8'xe8",
				B"8'x9c" -> B"8'x1c",
				B"8'x9d" -> B"8'x75",
				B"8'x9e" -> B"8'xdf",
				B"8'x9f" -> B"8'x6e",
				B"8'xa0" -> B"8'x47",
				B"8'xa1" -> B"8'xf1",
				B"8'xa2" -> B"8'x1a",
				B"8'xa3" -> B"8'x71",
				B"8'xa4" -> B"8'x1d",
				B"8'xa5" -> B"8'x29",
				B"8'xa6" -> B"8'xc5",
				B"8'xa7" -> B"8'x89",
				B"8'xa8" -> B"8'x6f",
				B"8'xa9" -> B"8'xb7",
				B"8'xaa" -> B"8'x62",
				B"8'xab" -> B"8'x0e",
				B"8'xac" -> B"8'xaa",
				B"8'xad" -> B"8'x18",
				B"8'xae" -> B"8'xbe",
				B"8'xaf" -> B"8'x1b",
				B"8'xb0" -> B"8'xfc",
				B"8'xb1" -> B"8'x56",
				B"8'xb2" -> B"8'x3e",
				B"8'xb3" -> B"8'x4b",
				B"8'xb4" -> B"8'xc6",
				B"8'xb5" -> B"8'xd2",
				B"8'xb6" -> B"8'x79",
				B"8'xb7" -> B"8'x20",
				B"8'xb8" -> B"8'x9a",
				B"8'xb9" -> B"8'xdb",
				B"8'xba" -> B"8'xc0",
				B"8'xbb" -> B"8'xfe",
				B"8'xbc" -> B"8'x78",
				B"8'xbd" -> B"8'xcd",
				B"8'xbe" -> B"8'x5a",
				B"8'xbf" -> B"8'xf4",
				B"8'xc0" -> B"8'x1f",
				B"8'xc1" -> B"8'xdd",
				B"8'xc2" -> B"8'xa8",
				B"8'xc3" -> B"8'x33",
				B"8'xc4" -> B"8'x88",
				B"8'xc5" -> B"8'x07",
				B"8'xc6" -> B"8'xc7",
				B"8'xc7" -> B"8'x31",
				B"8'xc8" -> B"8'xb1",
				B"8'xc9" -> B"8'x12",
				B"8'xca" -> B"8'x10",
				B"8'xcb" -> B"8'x59",
				B"8'xcc" -> B"8'x27",
				B"8'xcd" -> B"8'x80",
				B"8'xce" -> B"8'xec",
				B"8'xcf" -> B"8'x5f",
				B"8'xd0" -> B"8'x60",
				B"8'xd1" -> B"8'x51",
				B"8'xd2" -> B"8'x7f",
				B"8'xd3" -> B"8'xa9",
				B"8'xd4" -> B"8'x19",
				B"8'xd5" -> B"8'xb5",
				B"8'xd6" -> B"8'x4a",
				B"8'xd7" -> B"8'x0d",
				B"8'xd8" -> B"8'x2d",
				B"8'xd9" -> B"8'xe5",
				B"8'xda" -> B"8'x7a",
				B"8'xdb" -> B"8'x9f",
				B"8'xdc" -> B"8'x93",
				B"8'xdd" -> B"8'xc9",
				B"8'xde" -> B"8'x9c",
				B"8'xdf" -> B"8'xef",
				B"8'xe0" -> B"8'xa0",
				B"8'xe1" -> B"8'xe0",
				B"8'xe2" -> B"8'x3b",
				B"8'xe3" -> B"8'x4d",
				B"8'xe4" -> B"8'xae",
				B"8'xe5" -> B"8'x2a",
				B"8'xe6" -> B"8'xf5",
				B"8'xe7" -> B"8'xb0",
				B"8'xe8" -> B"8'xc8",
				B"8'xe9" -> B"8'xeb",
				B"8'xea" -> B"8'xbb",
				B"8'xeb" -> B"8'x3c",
				B"8'xec" -> B"8'x83",
				B"8'xed" -> B"8'x53",
				B"8'xee" -> B"8'x99",
				B"8'xef" -> B"8'x61",
				B"8'xf0" -> B"8'x17",
				B"8'xf1" -> B"8'x2b",
				B"8'xf2" -> B"8'x04",
				B"8'xf3" -> B"8'x7e",
				B"8'xf4" -> B"8'xba",
				B"8'xf5" -> B"8'x77",
				B"8'xf6" -> B"8'xd6",
				B"8'xf7" -> B"8'x26",
				B"8'xf8" -> B"8'xe1",
				B"8'xf9" -> B"8'x69",
				B"8'xfa" -> B"8'x14",
				B"8'xfb" -> B"8'x63",
				B"8'xfc" -> B"8'x55",
				B"8'xfd" -> B"8'x21",
				B"8'xfe" -> B"8'x0c",
				B"8'xff" -> B"8'x7d"
		)

		r // return value
	}

	def fun_aes32dsi(rs1: Bits, rs2: Bits, sel: Bits) : Bits = {
	    val idx = (sel).mux(
			B"2'b00" -> rs1( 7 downto  0),
			B"2'b01" -> rs1(15 downto  8),
			B"2'b10" -> rs1(23 downto 16),
			B"2'b11" -> rs1(31 downto 24)
			)
	    val x = fun_aesrsb_raw(idx)
		val r = (sel).mux(
			B"2'b00" -> x.resize(32),
			B"2'b01" -> (x <<  8).resize(32),
			B"2'b10" -> (x << 16).resize(32),
			B"2'b11" -> (x << 24).resize(32)
			)
	
	    r ^ rs2 // return value
	}

// End prologue
} // object Plugin
class CryptoZkndPlugin(earlyInjection : Boolean = true) extends Plugin[VexRiscv] {
	import CryptoZkndPlugin._
	object IS_CryptoZknd extends Stageable(Bool)
	object CryptoZknd_FINAL_OUTPUT extends Stageable(Bits(32 bits))
	override def setup(pipeline: VexRiscv): Unit = {
		import pipeline.config._
		val immediateActions = List[(Stageable[_ <: BaseType],Any)](
			SRC1_CTRL                -> Src1CtrlEnum.RS,
			SRC2_CTRL                -> Src2CtrlEnum.IMI,
			REGFILE_WRITE_VALID      -> True,
			BYPASSABLE_EXECUTE_STAGE -> Bool(earlyInjection),
			BYPASSABLE_MEMORY_STAGE  -> True,
			RS1_USE -> True,
			IS_CryptoZknd -> True
			)
		val binaryActions = List[(Stageable[_ <: BaseType],Any)](
			SRC1_CTRL                -> Src1CtrlEnum.RS,
			SRC2_CTRL                -> Src2CtrlEnum.RS,
			REGFILE_WRITE_VALID      -> True,
			BYPASSABLE_EXECUTE_STAGE -> Bool(earlyInjection),
			BYPASSABLE_MEMORY_STAGE  -> True,
			RS1_USE -> True,
			RS2_USE -> True,
			IS_CryptoZknd -> True
			)
		val unaryActions = List[(Stageable[_ <: BaseType],Any)](
			SRC1_CTRL                -> Src1CtrlEnum.RS,
			REGFILE_WRITE_VALID      -> True,
			BYPASSABLE_EXECUTE_STAGE -> Bool(earlyInjection),
			BYPASSABLE_MEMORY_STAGE  -> True,
			RS1_USE -> True,
			IS_CryptoZknd -> True
			)
		val ternaryActions = List[(Stageable[_ <: BaseType],Any)](
			SRC1_CTRL                -> Src1CtrlEnum.RS,
			SRC2_CTRL                -> Src2CtrlEnum.RS,
			SRC3_CTRL                -> Src3CtrlEnum.RS,
			REGFILE_WRITE_VALID      -> True,
			BYPASSABLE_EXECUTE_STAGE -> Bool(earlyInjection),
			BYPASSABLE_MEMORY_STAGE  -> True,
			RS1_USE -> True,
			RS2_USE -> True,
			RS3_USE -> True,
			IS_CryptoZknd -> True
			)
		val immTernaryActions = List[(Stageable[_ <: BaseType],Any)](
			SRC1_CTRL                -> Src1CtrlEnum.RS,
			SRC2_CTRL                -> Src2CtrlEnum.IMI,
			SRC3_CTRL                -> Src3CtrlEnum.RS,
			REGFILE_WRITE_VALID      -> True,
			BYPASSABLE_EXECUTE_STAGE -> Bool(earlyInjection),
			BYPASSABLE_MEMORY_STAGE  -> True,
			RS1_USE -> True,
			RS3_USE -> True,
			IS_CryptoZknd -> True
			)
		def aes32dsmi0_KEY = M"0011111----------000000000110011"
		def aes32dsmi1_KEY = M"0111111----------000000000110011"
		def aes32dsmi2_KEY = M"1011111----------000000000110011"
		def aes32dsmi3_KEY = M"1111111----------000000000110011"
		def aes32dsi_KEY = M"--11101----------000000000110011"
		val decoderService = pipeline.service(classOf[DecoderService])
		decoderService.addDefault(IS_CryptoZknd, False)
		decoderService.add(List(
			aes32dsmi0_KEY	-> (binaryActions ++ List(CryptoZkndCtrl -> CryptoZkndCtrlEnum.CTRL_aes0, CryptoZkndCtrlaes0 -> CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi0)),
			aes32dsmi1_KEY	-> (binaryActions ++ List(CryptoZkndCtrl -> CryptoZkndCtrlEnum.CTRL_aes0, CryptoZkndCtrlaes0 -> CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi1)),
			aes32dsmi2_KEY	-> (binaryActions ++ List(CryptoZkndCtrl -> CryptoZkndCtrlEnum.CTRL_aes0, CryptoZkndCtrlaes0 -> CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi2)),
			aes32dsmi3_KEY	-> (binaryActions ++ List(CryptoZkndCtrl -> CryptoZkndCtrlEnum.CTRL_aes0, CryptoZkndCtrlaes0 -> CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi3)),
			aes32dsi_KEY	-> (binaryActions ++ List(CryptoZkndCtrl -> CryptoZkndCtrlEnum.CTRL_aes32dsi))
		))
	} // override def setup
	override def build(pipeline: VexRiscv): Unit = {
		import pipeline._
		import pipeline.config._
		execute plug new Area{
			import execute._
			val val_aes0 = input(CryptoZkndCtrlaes0).mux(
				CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi0 -> fun_aes32dsmi0(input(SRC2), input(SRC1)).asBits,
				CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi1 -> fun_aes32dsmi1(input(SRC2), input(SRC1)).asBits,
				CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi2 -> fun_aes32dsmi2(input(SRC2), input(SRC1)).asBits,
				CryptoZkndCtrlaes0Enum.CTRL_aes32dsmi3 -> fun_aes32dsmi3(input(SRC2), input(SRC1)).asBits
			) // mux aes0
			insert(CryptoZknd_FINAL_OUTPUT) := input(CryptoZkndCtrl).mux(
				CryptoZkndCtrlEnum.CTRL_aes0 -> val_aes0.asBits,
				CryptoZkndCtrlEnum.CTRL_aes32dsi -> fun_aes32dsi(input(SRC2), input(SRC1), input(INSTRUCTION)(31 downto 30)).asBits
			) // primary mux
		} // execute plug newArea
		val injectionStage = if(earlyInjection) execute else memory
		injectionStage plug new Area {
			import injectionStage._
			when (arbitration.isValid && input(IS_CryptoZknd)) {
				output(REGFILE_WRITE_DATA) := input(CryptoZknd_FINAL_OUTPUT)
			} // when input is
		} // injectionStage plug newArea
	} // override def build
} // class Plugin
