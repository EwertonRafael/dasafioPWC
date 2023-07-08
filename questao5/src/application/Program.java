package application;

public class Program {
	public static void main(String[] args) {
		/* verifique se a string é anagrama de um palindromo:
		 	a) innput "racecar"
		 	b) output: true */
		String str = "recacer";
		System.out.println(Palindrome(str));
	}

	static boolean Palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
