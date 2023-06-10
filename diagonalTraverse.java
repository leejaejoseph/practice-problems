class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        ArrayList<Integer> returning = new ArrayList<>();
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        ArrayList<Integer> diagonal = new ArrayList<>();
        int row = 0;
        int x = 0;
        int y = 0;
        int decreasing = 0;
        boolean reverse = false;

        for (int i = 0; i < mat.length * 2 - 1; i++){
            diagonal.add(mat[x][y]);
            if (x == decreasing) {
                row++;
                x = row;
                y = 0;
                nums.add(diagonal);
                if (row == mat.length - 1) {
                    decreasing++;
                }
            } else {
                x--;
                y++;
            }
        }
        for (int j = 0; j < nums.size(); j++){
            if (reverse) {
                returning.addAll(Collections.reverse(nums[j]));
                reverse = false;
            } else {
                returning.addAll(nums[j]);
                reverse = true;
            }
        }
        return returning;
    }
}
