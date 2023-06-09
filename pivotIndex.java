class Solution {
  public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int lowest = -1;
    for (int i = 0; i < nums.length; i++) {
      left += nums[i];
    }
    for (int i = nums.length - 1; i > -1; i--) {
      left -= nums[i];
      if (left == right) {
        lowest = i;
      }
      right += nums[i];
    }
    return lowest;
  }
}
