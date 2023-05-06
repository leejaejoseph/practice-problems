// Using Set
function containsDuplicate(nums: number[]): boolean {
  const numbersSet: Set<number> = new Set();
  for (let i: number = 0; i < nums.length; i++) {
    if (numbersSet.has(nums[i])){
      return true;
    }
    numbersSet.add(nums[i]);
  }
  return false;
};

// Using Object
function containsDuplicate(nums: number[]): boolean {
  const numbersTable: Record<number, boolean> = {};
  for (let i: number = 0; i < nums.length; i++) {
    if (numbersTable[nums[i]]) {
      return true;
    }
    numbersTable[nums[i]] = true;
  }
  return false;
};
