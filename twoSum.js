const twoSum = function (nums, target) {
  const numbers = {}
  for (let i = 0; i < nums.length; i++) {
    if (numbers.hasOwnProperty(target - nums[i])) {
      return [numbers[target - nums[i]], i];
    } else {
      numbers[nums[i]] = i;
    }
  }
};
