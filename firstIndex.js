//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/944187503/

var strStr = function (haystack, needle) {
  let ind = [];
  for (let i = 0; i < haystack.length; i++) {
    if (haystack[i] === needle[0]) {
      ind.push(i);
    }
  }
  for (let j = 0; j < ind.length; j++) {
    if (haystack.slice(ind[j], ind[j] + needle.length) === needle) {
      return ind[j];
    }
  }
  return -1;
}
