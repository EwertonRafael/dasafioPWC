package application;

public class Program {

	public static void main(String[] args) {
		/* coloque em maiúscula a primeira letra de cada frase da string 
		 a) input: "hello, how are you? i'm fine, thank you." 
		 b) output: "Hello, how are you? I'm fine, thank you." */
		String phrase = "hello, how are you? i'm fine, thank you.";
		System.out.println(capitalize(phrase));
	}

	private static String capitalize(String phrase) {
		StringBuilder sb = new StringBuilder();
		boolean uppercaseLetter = true;

		for (char c : phrase.toCharArray()) {
			if (uppercaseLetter && Character.isLetter(c)) {
				sb.append(Character.toUpperCase(c));
				uppercaseLetter = false;
			} else {
				sb.append(c);
			}
			if (c == '.' || c == '?' || c == '!') {
				uppercaseLetter = true;
			}
		}
		return sb.toString();
	}
}
