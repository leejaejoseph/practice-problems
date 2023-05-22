class Solution {
    public int[] runningSum(int[] nums) {
        int[] ret = new int[nums.length];
        int accum = 0;
        for (int i = 0; i < nums.length; i++) {
            accum += nums[i];
            ret[i] = accum;
        }
        return ret;
    }
}
