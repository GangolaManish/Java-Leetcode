/**
Source : https://leetcode.com/problems/detect-capital/
 */
package StringProblem;

import java.util.Scanner;

public class DetectCapitalUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		System.out.print(detectCapitalUse(word));
	}

	public static boolean detectCapitalUse(String word) {
		if(word == word.toLowerCase() || word == word.toUpperCase()) {
			return true;
		} else {
			char ch = word.charAt(0);
			String remain = word.substring(1, word.length());
			if (ch >= 'A' && ch <= 'Z' && remain == remain.toLowerCase()) {
				return true;
			}
		}
		return false;
	}
	
	

}
