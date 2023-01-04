/**
Source : https://leetcode.com/problems/is-subsequence/
 */
package StringProblem;

import java.util.Scanner;

public class IsSubSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		System.out.print(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		String remain = t;
		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			if (remain.indexOf(sc) == -1) {
				return false;
			} else {
				remain = remain.substring(remain.indexOf(sc) + 1, remain.length());
			}
		}
		return true;

	}

}
