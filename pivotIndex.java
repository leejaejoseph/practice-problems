class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        int total = 0;
        int left = 0;
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i];
            if (left == total) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
