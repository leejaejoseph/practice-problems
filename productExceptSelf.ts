function productExceptSelf(nums: number[]): number[] {
  let total: number = 1;
  let returnArray: number[] = [];
  let zeroCount: number = 0;

  for (let num of nums) {
    if (num === 0) {
      zeroCount++;
      continue;
    }
    total *= num;
  }
  for (let i = 0; i < nums.length; i++) {
    if (zeroCount > 1) {
      returnArray.push(0)
    } else if (nums[i] === 0) {
      returnArray.push(total);
    } else {
      if (zeroCount === 1) {
        returnArray.push(0)
      } else {
        returnArray.push(total / nums[i])
      }
    }
  }
  return returnArray;
};
