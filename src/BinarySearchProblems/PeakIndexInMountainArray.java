/**
Source : https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
package BinarySearchProblems;

import java.util.Scanner;

public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}

		int ans = peakIndexInMountainArray(nums);
		System.out.println(ans);
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
//			System.out.println(mid + " " + arr[mid]);
			if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
				start = mid;
			} else {
				end = mid;
			}
		}

		return -1;
	}
}
