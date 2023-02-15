/**
Source : https://leetcode.com/problems/maximum-subarray/
*/
package ArrayProblem;

import java.util.Scanner;

public class MaximumSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] nums = new int[size];

		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
