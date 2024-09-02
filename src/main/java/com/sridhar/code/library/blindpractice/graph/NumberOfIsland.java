package com.sridhar.code.library.blindpractice.graph;

public class NumberOfIsland {


    public int numIslands(char[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    iterate(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private void iterate(int i, int j, char[][] grid, boolean[][] visited) {
        if(i >= grid.length || i< 0 || j< 0 || j >= grid[0].length) {
            return;
        }
        visited[i][j] = true;
        if(grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        iterate(i+1, j, grid, visited);
        iterate(i, j+1, grid, visited);
        iterate(i-1, j, grid, visited);
        iterate(i, j-1, grid, visited);
    }



}

