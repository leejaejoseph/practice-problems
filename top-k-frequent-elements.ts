function topKFrequent(nums: number[], k: number): number[] {
  const list: Record<number, number> = {};
  const bucketArray: number[][] = [];
  const returnArray: number[] = [];

  for (let i = 0; i < nums.length + 1; i++) {
    bucketArray.push([]);
  }

  for (let num of nums) {
    if (!list[num]) {
      list[num] = 0;
    }
    list[num]++;
  }

  for (let key in list) {
    bucketArray[list[key]].push(Number(key));
  }

  for (let i = bucketArray.length - 1; i >= 0; i--) {
    if (returnArray.length === k) {
      return returnArray;
    }
    if (bucketArray[i].length === 0) {
      continue;
    } else if (bucketArray[i].length > 1) {
      for (let j = 0; j < bucketArray[i].length; j++) {
        returnArray.push(Number(bucketArray[i][j]))
      }
    } else {
      returnArray.push(Number(bucketArray[i]))
    }
  }
  return returnArray;
}
