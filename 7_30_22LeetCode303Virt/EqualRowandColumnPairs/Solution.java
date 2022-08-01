package EqualRowandColumnPairs;

import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int[][] cols = new int[grid.length][grid.length];
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                cols[j][i] = grid[i][j];
            }
        }
        for(int[] row : grid){
            for(int[] col : cols){
                if(Arrays.equals(row, col)) ans++;
            }
        }
        return ans;
    }
}