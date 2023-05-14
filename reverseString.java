class reverseString {
    public void inPlace(char[] s) { //Time complexity is O(n) as it goes through every variable but is 0(1) as it does not use extra data structures.
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    public void lastIndex(char[] s) { //Time complexity is O(n + n) as it goes through every variable but is 0(n) as it recreates every reverse indexed char in new char[].
      char[] returnArray = new char[s.length];
      for (int i = 0, j = s.length - 1; j > -1; i++, j--) {
          returnArray[i] = s[j];
      }
      for (int i = 0; i < returnArray.length; i++) {
          s[i] = returnArray[i];
      }
    }

    public void usingArrayList(char[] s) {
        ArrayList<Character> returnArray = new ArrayList<Character>();
        for (int i = 0, j = s.length - 1; j > -1; i++, j--) {
            returnArray.add(s[j]);
        }
        for (int i = 0; i < returnArray.size(); i++) {
            s[i] = returnArray.get(i);
        }
    }
}
