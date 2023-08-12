package caesars_cipher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "My name is Caesar";
		int offset = 15;
				
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		String encrypted = caesarsCipher.cipher(message, offset);
		
		System.out.println("Original: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Encrypted: " + encrypted);
	}

}
