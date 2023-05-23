class Solution {
    public int thirdMax(int[] nums) {
        int[] unsorted = nums.clone();
        Arrays.sort(nums);
        int count = 1;
        int largest = nums[nums.length - 1];
        int prev = nums[nums.length - 1];
        for (int i = nums.length - 2; i > -1; i--) {
          if (nums[i] > largest) {
            largest = nums[i];
          }
          if (nums[i] != prev) {
            prev = nums[i];
            count++;
            if (count == 3) return nums[i];
          }
        }
        return largest;
    }
}
