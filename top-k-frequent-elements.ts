function topKFrequent(nums: number[], k: number): number[] {
  const list: Record<number, number> = {}// 0 - k
  const bucketList: Record<number, number[]> = {}// 0 - k
  const returnArray: number[] = [];
  for (let num of nums) {
    if (!list[num]) {
      list[num] = 0;
    }
    list[num]++;
  }

  for (let key in list) {
    if (!bucketList[list[key]]) {
      bucketList[list[key]] = [];
    }
    bucketList[list[key]].push(Number(key));
  }

  for (let i: number = nums.length; i > 0; i--) {
    try {
      for (let j = 0; j < bucketList[i].length; j++) {
        if (returnArray.length === k) {
          return returnArray;
        }
        returnArray.push(bucketList[i][j])
    } catch (e) {
      continue;
    }
  }
  return returnArray;
};

// 2

  function topKFrequent(nums: number[], k: number): number[] {
    const list: Record<number, number> = {};
    const bucketArray = [];
    const returnArray: number[] = [];

    for (let i = 0; i !== nums.length; i++) {
      bucketArray.push([]);
    }

    for (let num of nums) {
      if (!list[num]) {
        list[num] = 0;
      }
      list[num]++;
    }

    for (let key in list) {
      console.log(key, list[key], bucketArray)
      bucketArray[list[key]].push(Number(key));
      console.log(key, list[key], bucketArray)
    }

    for (let i = bucketArray.length - 1; i >= 0; i--) {
      if (returnArray)
        if (bucketArray[i].length === 0) {
          continue;
        }
      console.log(bucketArray[i], bucketArray, Number(bucketArray[i]))
    }
    return returnArray;

  }
