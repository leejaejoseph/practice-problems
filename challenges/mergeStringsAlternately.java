class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int l = word1.length() > word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < l; i++) {
          try {
            str.append(word1.charAt(i));
          } catch (IndexOutOfBoundsException e) {
          }
          try {
            str.append(word2.charAt(i));
          } catch (IndexOutOfBoundsException e) {
          }
        }
        word1 = str.toString();
        return word1;
    }
}
