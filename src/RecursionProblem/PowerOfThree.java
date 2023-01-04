/**
Source : https://leetcode.com/problems/power-of-three/
 */
package RecursionProblem;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.print(isPowerOfThree(n));
	}

	public static boolean isPowerOfThree(int n) {
		return isPowerOfThree(1, n);
	}

	public static boolean isPowerOfThree(double i, int n) {
		if (n < i) {
			return false;
		}

		if (i == n) {
			return true;
		} else {
			return isPowerOfThree(i * 3, n);
		}
	}

}
