class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        String update = "";
        if (result.length() == 0) {
            return "";
        }
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (result.length() < j + 1) {
                    break;
                }
                if (strs[i].charAt(j) == result.charAt(j)) {
                    update+=strs[i].charAt(j);
                } else {
                    break;
                }
            }
            result = update;
            update = "";
        }
        return result;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}
