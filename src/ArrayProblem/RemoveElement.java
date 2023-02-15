/**
Source : https://leetcode.com/problems/remove-element/
*/
package ArrayProblem;

import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] nums = new int[size];

		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}

		int val = sc.nextInt();

		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
	}
}
