import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, int> alphabets = new Hashtable<Character, int>();
        for (int i = 0; i < s.length(); i++) {
            if (alphabets.contains(s.charAt(i))){
                if (s.get(charAt(i)) > s.get(charAt(i) - i)) {
                    continue;
                } else {
                    alphabet.put(s.charAt(i), s.get(charAt(i) - i))
                }
            } else {
                alphabets.put(s.charAt(i), i);
            }
        }
        int highest = 0;
        for (String key:s.keySet()) {

        }
    }
}
