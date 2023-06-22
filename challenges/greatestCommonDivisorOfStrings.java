class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() <= str2.length() || str1 == null || str2 == null) {
          return "";
        }
        int i = 0;
        int k = str1.length();
        int j = str2.length();
        while (j < k) {
          if (str2.equals(str1.substring(i, j)){
            i = j;
            j += j;
          }
        }

        return "";
    }
}
