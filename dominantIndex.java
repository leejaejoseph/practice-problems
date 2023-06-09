class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length < 2) return -1;
        int ind = 0;
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max2 = max;
                max = nums[i];
                ind = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if (max >= max2 * 2){
            return ind;
        }
        return -1;
    }
}
