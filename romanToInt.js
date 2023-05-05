/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  let total = 0;
  for (let i = 0; i < s.length; i++) {
    switch (s[i]) {
      case ('M'):
        total += 1000;
        break;
      case ('D'):
        total += 500;
        break;
      case ('C'):
        if (s[i + 1] === 'D' || s[i + 1] === 'M') {
          total -= 100;
        } else {
          total += 100;
        }
        break;
      case ('L'):
        total += 50;
        break;
      case ('X'):
        if (s[i + 1] === 'L' || s[i + 1] === 'C') {
          total -= 10;
        } else {
          total += 10;
        }
        break;
      case ('V'):
        total += 5;
        break;
      case ('I'):
        if (s[i + 1] === 'V' || s[i + 1] === 'X') {
          total -= 1;
        } else {
          total += 1;
        }
        break;
    }
  }
  return total;
};
