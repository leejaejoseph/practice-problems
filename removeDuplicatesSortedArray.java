class Solution {
    public int removeDuplicates(int[] nums) {
        int previous = nums[0];
        int down = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous){
                down++;
            }
            else {
                previous = nums[i];
                nums[i - down] = nums[i];
                count++;
            }
        }
        return count;
    }
}
