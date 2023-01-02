/**
Source : https://leetcode.com/problems/find-pivot-index/
 */
package ArrayProblem;

import java.util.Scanner;

public class PivotIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.print(pivotIndex(nums));

	}

	public static int pivotIndex(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		int leftSum = 0;
		int rightSum = sum;
		for (int i = 0; i < nums.length; i++) {
			rightSum = rightSum - nums[i];
			if (i > 0) {
				leftSum += nums[i - 1];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

}
