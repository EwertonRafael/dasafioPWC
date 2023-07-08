package application;

public class Program {

	public static void main(String[] args) {
		/* encontre a substring palindroma mais longa na string abaixo:
		 a) input: "babad"
		 b) output: "bab" */
		String str = "babad";
		System.out.println(palindrome(str));
	}
	public static String palindrome(String str) {
		String longest = str.substring(0, 1);
		for (int i = 0; i < str.length() - 1; i++) {
			String palindrome = findPalindrome(str, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			palindrome = findPalindrome(str, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
	static public String findPalindrome(String str, int first, int last) {
		if (first > last) {
			return null;
		}
		while (first >= 0 && last < str.length() && str.charAt(first) == str.charAt(last)) {
			first--;
			last++;
		}
		return str.substring(first + 1, last);
	}
}
