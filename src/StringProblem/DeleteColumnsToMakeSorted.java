/**
Source : https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
package StringProblem;

import java.util.Scanner;

public class DeleteColumnsToMakeSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		String[] strs = new String[size];
		for (int i = 0; i < size; i++) {
			strs[i] = sc.next();
		}
		
		System.out.print(minDeletionSize(strs));
	}
	
	public static int minDeletionSize(String[] strs) {
        // String length.
        int K = strs[0].length();

        // Variable to store the count of columns to be deleted.
        int answer = 0;
        // Iterate over each index in the string.
        for (int col = 0; col < K; col++) {
            // Iterate over the strings.
            for (int row = 1; row < strs.length; row++) {
                // Characters should be in increasing order, 
                // If not, increment the counter.
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

}
