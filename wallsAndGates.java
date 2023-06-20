public class Solution {
  public int[][] wallsAndGates(int grid[][]) {
    int length = grid.length;
    int width = grid[0].length;
    for (int l = 0; l < length; l++) {
      for (int w = 0; w < width; w++) {
        grid[l][w] = bfs(grid, l, w, 0);
      }
    }
    return grid;
  }
  private int bfs(int grid[][], int l, int w, int count){
    if (l < 0 || w < 0 || l >= grid.length ||  w >= grid.length || grid[l][w] == -1) return;
    if (grid[l][w] == 0) return count;
    bfs(grid, l - 1, w, count++);
    bfs(grid, l + 1, w, count++);
    bfs(grid, l, w - 1, count++);
    bfs(grid, l, w + 1, count++);
  }
}
