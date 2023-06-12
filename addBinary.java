class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >=0) {
            int curr = carry;
            if (i>=0) {
                curr += a.charAt(i) - '0';
                i--;
            }
            if (j>=0) {
                curr += b.charAt(j) - '0';
                j--;
            }
            carry = curr > 1 ? 1 : 0;
            str.append(curr % 2);

        }
        if (carry > 0) {
            str.append(carry);
        }
        String returnString = str.reverse().toString();
        return returnString;
    }
}
