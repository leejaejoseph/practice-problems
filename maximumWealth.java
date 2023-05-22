class Solution {
    public int maximumWealth(int[][] accounts) {
        int highest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int curr = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curr+=accounts[i][j];
            }
            if (curr > highest) {
                highest = curr;
            }
        }
        return highest;
    }
}
