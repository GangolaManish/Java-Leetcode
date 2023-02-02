/**
Source : https://leetcode.com/problems/valid-perfect-square/
*/

package BinarySearchProblems;

import java.util.Scanner;

public class ValidPerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if (isPerfectSquare(num)) {
			System.out.println(num + " is a Perfect Square");
		} else {
			System.out.println(num + " is not a Perfect Square");
		}
	}

	public static boolean isPerfectSquare(int num) {
		if (num == 1) {
			return true;
		}

		int start = 0;
		int end = num;

		while (start <= end) {
			int mid = start + (end - start) / 2;
//			System.out.println(mid);
			int sqrt = num / mid;
			if (sqrt == mid && sqrt * mid == num) {
				return true;
			} else if (sqrt < mid) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return false;
	}
}
