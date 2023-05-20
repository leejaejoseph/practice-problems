
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int starting = 0;
        Set<Character> characters = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            while (characters.contains(s.charAt(i))){
                characters.remove(s.charAt(starting));
                starting++;
            }
            characters.add(s.charAt(i));
            longest = Math.max(longest, i - starting + 1);
        }
        return longest;
    }
}
