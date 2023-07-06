package application;

import java.util.LinkedHashSet;

public class Program {

	public static void main(String[] args) {
		/* Remova todos os caracteres duplicados da string abaixo:
		a) input: "Hello, World!"
		b) output: "Helo, Wrd!" */

		String phrase = "Hello, World!";
		String output = duplicates(phrase);
		System.out.println(output);
	}
	private static String duplicates(String phrase) {
		char[] letters = phrase.toCharArray();
		LinkedHashSet<Character> uniqueletter = new LinkedHashSet<>();
		for(char c : letters) {
			uniqueletter.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(char c : uniqueletter) {
			sb.append(c);
		}
		return sb.toString();
	}

}
