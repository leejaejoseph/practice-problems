class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null) return 0;
        int length = grid.length;
        int width = grid[0].length;
        int islandCount = 0;

        for (int l = 0; l < length; l++) {
            for (int w = 0; w < width; w++) {
                if (grid[l][w] == '1'){
                    islandCount++;
                    bfs(grid, l, w);
                }
            }
        }

        return islandCount;
    }

    private void bfs(char[][] grid, int l, int w) {
        if (l < 0 || w < 0 || l >= grid.length || w >= grid[l].length || grid[l][w] == '0') return;
        grid[l][w] = '0';
        bfs(grid, l - 1, w);
        bfs(grid, l + 1, w);
        bfs(grid, l, w - 1);
        bfs(grid, l, w + 1);
    }
}
