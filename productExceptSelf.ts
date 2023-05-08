function productExceptSelf(nums: number[]): number[] {
  const returnArray: number[] = [1]
  let prefix: number = 1;
  for (let i = 0; i < nums.length - 1; i++) {
    returnArray.push(prefix * nums[i]);
    prefix *= nums[i];
  }

  let suffix = 1;
  for (let j = nums.length - 1; j > -1; j--) {
    returnArray[j] *= suffix;
    suffix *= nums[j];
  }
  return returnArray;
};
