// T: O(n) S: O(n)

function twoSum(nums: number[], target: number): number[] {
  const numbersObject: Record<number, number> = {};
  for (let i:number = 0; i < nums.length; i++) {
    if (numbersObject.hasOwnProperty(target - nums[i])) {
      return [numbersObject[target - nums[i]], i];
    } else {
      numbersObject[nums[i]]=i;
    }
  }
};
