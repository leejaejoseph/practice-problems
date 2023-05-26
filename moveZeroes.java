class Solution {
    public void moveZeroes(int[] nums) {
        int down = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                down++;
            } else {
                nums[i - down] = nums[i];
            }
        }
        for (int j = nums.length - down; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
