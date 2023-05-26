class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r) {
            int temp = nums[l];
            if (nums[l] % 2 == 0) {
                l++;
            } else if (nums[r] % 2 == 0) {
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            } else {
                r--;
            }
        }
        return nums;
    }
}
