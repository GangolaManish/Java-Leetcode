/**
Source : https://leetcode.com/problems/isomorphic-strings/
 */
package StringProblem;

import java.util.Scanner;

public class IsomorphicStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		System.out.print(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);
			if (s.indexOf(sc) != t.indexOf(tc)) {
				return false;
			}
		}
		return true;
	}

}
