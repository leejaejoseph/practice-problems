/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  if (x < 0) {
    return false
  }
  const toString = x.toString().split('');
  if (toString.join() !== toString.reverse().join()) {
    return false;
  }
  return true;
};
