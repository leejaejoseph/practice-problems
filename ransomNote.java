class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        HashMap<Character, Integer> letters = new HashMap<>();
        for (char letter : magazine.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else{
                letters.put(letter, 1);
            }
        }
        for (char letter : ransomNote.toCharArray()) {
            if (letters.containsKey(letter) && letters.get(letter) > 0) {
                letters.put(letter, letters.get(letter) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
