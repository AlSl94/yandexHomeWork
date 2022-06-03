package LeetCode;

public class TwoSums {
    public static void main(String[] args) {
        int[] test = new int[]{1, 3};
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        while (true) {
            if (nums[i] + nums[j] != target) {
                if (j-1 < nums.length) {
                    j++;
                } else {
                    i++;
                    j = i + 1;
                }
            } else if (nums[i] + nums[j] == target) {
                break;
            }
        }
        return new int[] {i, j};
    }
}
