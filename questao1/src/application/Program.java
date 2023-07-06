package application;

public class Program {

	public static void main(String[] args) {
		/* Reverta a ordem das palavras na frases, mantendo a ordem das palavras
		a) input: "Hello, World! OpenAI is amazing"
		b) output: "amazing. is OpenAI World! Hello,"*/
		
		 String phrase = "Hello, World! OpenAI is amazing.";
		 System.out.println(reverse(phrase));
	}
	private static String reverse(String phrase) {
		String[] words = phrase.split(" ");
		StringBuilder sb = new StringBuilder();
		 
		 for(int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
		 }
		 return sb.toString();
	}
}
