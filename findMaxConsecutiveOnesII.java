public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int l = 0;
        int r = 0;
        for (int num : nums) {
            if (num == 0) {
                if (l + r > max) {
                    max = l + r + 1;
                }
                l = r;
                r = 0;
            } else {
                r++;
            }
        }
        if (l + r > max) {
            max = l + r + 1;
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int expected1 = 6;
        int result1 = solution.findMaxConsecutiveOnes(nums1);
        System.out.println("Test case 1: Expected=" + expected1 + ", Result=" + result1);

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int expected2 = 4;
        int result2 = solution.findMaxConsecutiveOnes(nums2);
        System.out.println("Test case 2: Expected=" + expected2 + ", Result=" + result2);
    }
}
