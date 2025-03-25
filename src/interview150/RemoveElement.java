package interview150;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int count = 0;

		for (Integer i : nums) {
			if (i != val) {
				count++;
			}
		}

		int[] x = new int[count];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				x[j] = nums[i];
				j++;
			}
		}

		for (int i = 0; i < count; i++) {
			nums[i] = x[i];
		}
		return count;
	}
}
