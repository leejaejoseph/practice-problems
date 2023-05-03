/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  let prev = s[0];
  let broke = true;

  for (let i = 1; i < s.length; i++) {
    if (!broke) {
      return false;
    }
    if (i % 2 === 0) {
      prev = s[i];
    }
    switch (prev) {
      case '(':
        if (s[i] !== ')') {
          return false;
        }
      case '{':
        if (s[i] !== '}') {
          return false;
        }
      case '[':
        if (s[i] !== ']') {
          return false;
        }
    }
  }
  return broke;
};
