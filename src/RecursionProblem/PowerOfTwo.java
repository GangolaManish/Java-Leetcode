/**
Source : https://leetcode.com/problems/power-of-two/
*/
package RecursionProblem;

import java.util.*;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.print(isPowerOfTwo(num));
	}

	public static boolean isPowerOfTwo(int n) {
		double i = 1;
		return isPowerOfTwo(i, n);
	}

	public static boolean isPowerOfTwo(double i, int n) {
		if(i > n) {
			return false;
		}
		
		if (i == n) {
			return true;
		} else {
			return isPowerOfTwo(i * 2, n);
		}
	}
}