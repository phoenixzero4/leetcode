/**
 *   phoenix
 *   Mar 28, 2025
 */
package interview150;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {

		ArrayList<Integer> list = new ArrayList<>();
		int k = 0;
		int length = nums.length;

		boolean dupFound = false;

		for (int i = 0; i < length; i++) {
			int element = nums[i];
			for (int j = i + 1; j < length; j++) {
				if (element == nums[j]) {
					dupFound = true;
				}
			}
			if (!dupFound) {
				list.add(element);
				k++;
			}
			dupFound = false;
		}

		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
		return k;
	}
}