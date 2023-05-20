class Solution {
  public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
    if (first.length() == 0) {
      return "";
    }
    for (int i = 1; i < strs.length; i++) {
      if (strs[i] == "") {
        return "";
      }
      if (strs[i].length() == 1 && strs[i].charAt(0) == first.charAt(0)) {
        first = String.valueOf(first.charAt(0));
      } else if (strs[i].length() == 1 && strs[i].charAt(0) != first.charAt(0)) {
        return "";
      } else {
        for (int j = 0; j < strs[i].length(); j++) {
          if (j >= first.length() || strs[i].charAt(j) != first.charAt(j)) {
            first = first.substring(0, j);
            break;
          }
        }
      }
    }
    return first;
  }
}
