class Solution {
    public int removeElement(int[] nums, int val) {
        int down = 0;
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                down++;
                length--;
            } else {
                nums[i - down] = nums[i];
            }
        }
        return length;
    }
}
