package LeetCode;

import java.util.HashMap;

public class IndexesOfTarget {
    public static void main(String[] args) {
//      int[] nums = {2, 7, 11, 15};
        int[] nums = {2, 7, 3, 4, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null; // No two-sum solution found
    }
}