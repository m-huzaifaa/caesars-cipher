package caesars_cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {

	private CaesarsCipher caesarCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf15() {
		assertEquals("vn cpbt xh lpthpg", caesarCipher.cipher("My name is Caesar", 15));
	}
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 15));
	}
}
