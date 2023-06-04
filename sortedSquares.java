class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (left <= right) {
            int leftNum = nums[left] * nums[left];
            int rightNum = nums[right] * nums[right];

            if (leftNum > rightNum) {
                sorted[index] = leftNum;
                left++;
            } else {
                sorted[index] = rightNum;
                right--;
            }
            index--;
        }
        return sorted;
    }
}

/*solution n log n
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
 */
