package com.sridhar.code.library.hard.graphs;

public class UniquePathsIII {

    //count obstacles in the grid
    public int uniquePathsIII(int[][] grid) {
        int obstacles = 0;
        int[] src = new int[2];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == -1) {
                    obstacles+=1;
                }
                if(grid[i][j] == 1) {
                    src[0] = i;
                    src[1] = j;
                }
            }
        }
        int totalCount = grid.length * grid[0].length;
        int reachableCount = totalCount - obstacles;
        return backtracking(grid, src[0], src[1], 1, reachableCount);
    }


    public int backtracking(int[][] grid, int i, int j, int visitedNodeCount, int reachableCount) {
        if(i >= grid.length || i < 0 || j >= grid[0].length || j < 0) {
            return 0;
        }
        if(grid[i][j] == 2) {
            if(visitedNodeCount == reachableCount)
                return 1;
            else
                return 0;
        }
        if(grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1;
        int val1 = backtracking(grid, i+1, j, visitedNodeCount+1, reachableCount);
        int val2 = backtracking(grid, i, j+1, visitedNodeCount+1, reachableCount);
        int val3 = backtracking(grid, i-1, j, visitedNodeCount+1, reachableCount);
        int val4 = backtracking(grid, i, j-1, visitedNodeCount+1, reachableCount);
        grid[i][j] = 0;
        return val1 + val2 + val3 + val4;
    }
}
