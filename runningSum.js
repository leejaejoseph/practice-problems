/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function (nums) {
  let left = 0;
  let right = 0;

  for (let i = 0; i < nums.length; i++) {
    right += nums[i];
  }

  for (let j = 0; j < nums.length - 1; j++) {
    right -= nums[j];
    if (left === right) {
      return j;
    }
    left += nums[j];
  }
  return -1;
};
