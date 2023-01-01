/**
Source : https://leetcode.com/problems/running-sum-of-1d-array/ 
 */
package ArrayProblem;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(Arrays.toString(runningSum(arr)));
	}

	public static int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		for (int i = nums.length-1; i >= 0; i--) {
			int temp = nums[i];
			nums[i] = sum;
			sum = sum -temp;
		}
		return nums;
	}

}
