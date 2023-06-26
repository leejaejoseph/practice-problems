class Solution {
    public int removeDuplicates(int[] nums) {
        boolean repeat = false;
        int curr = nums[0];
        int down = 0;
        int i = 1;
        while (i < nums.length){
            nums[i - down] = nums[i];
            if (curr != nums[i]) {
                repeat = false;
                curr = nums[i];
            } else if (curr == nums[i]) {
                if (repeat) {
                    down++;
                } else {
                    repeat = true;
                }
            }
            i++;
        }
        return nums.length - down;
    }
}
