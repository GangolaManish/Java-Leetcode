/**
Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/
package ArrayProblem;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
		int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
	}

}
