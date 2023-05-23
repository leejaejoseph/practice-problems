class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i] * nums[i];
        }
        Arrays.sort(sorted);
        return sorted;
    }
}
