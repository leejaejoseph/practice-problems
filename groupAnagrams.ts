// T: O(n * m*log(m)) S: O(n)

function groupAnagrams(strs: string[]): string[][] {
  let returnArray: string[][] = [];
  const words: Record<string, number> = {};
  let increment = 0;
  for (let word of strs) {
    let sortedWord: string = word.split('').sort().join('');
    if (!words.hasOwnProperty(sortedWord)) {
      words[sortedWord] = increment;
      increment++;
      returnArray.push([word])
    } else {
      returnArray[words[sortedWord]].push(word)
    }
  }
  return returnArray;
};
