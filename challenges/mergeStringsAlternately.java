class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;
        int o = word1.length(), t = word2.length();
        while (i < o || j < t) {
          if (i < o) {
            str.append(word1.charAt(i++));
          }
          if (j < t) {
            str.append(word2.charAt(j++));
          }
        }
        return str.toString();
    }
}
