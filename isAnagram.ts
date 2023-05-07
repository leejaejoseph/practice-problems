// T: O(n) S: O(c)
// using Map

function isAnagram(s: string, t: string): boolean {
  const letters: Record<string, number> = {};
  if (s.length !== t.length) {
    return false;
  }

  for (let letter of s) {
    if (!letters[letter]) {
      letters[letter] = 0;
    }
    letters[letter]++
  }

  for (let letter of t) {
    if (letters[letter] > 0) {
      letters[letter]--;
    } else {
      return false;
    }
  }
  return true;
};

// T: O(n*log(n)) S: O(n)
// using Sort

function isAnagram(s: string, t: string): boolean {
  return (s.split('').sort().join() === t.split('').sort().join());
};
