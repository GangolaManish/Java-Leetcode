/**
Source : https://leetcode.com/problems/search-insert-position/
 */
package BinarySearchProblems;

import java.util.Scanner;

public class SearchInsertPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		int ans = searchInsert(nums, target);
		System.out.println(ans);
	}

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length -1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return start;
	}
}
