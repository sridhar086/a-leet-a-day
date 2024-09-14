package com.sridhar.code.library.blindpractice.matrix;

import java.util.*;

// leet 2850

//todo needs a fix
public class MovesForStones {

    int steps = 0;
    int[][] grid;
    boolean[][] visited;
    public int minimumMoves(int[][] grid) {
        List<int[]> available = new ArrayList<>();
        this.grid = grid;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] > 1) {
                    available.add(new int[]{i, j});
                }
            }
        }


        Queue<int[]> array = new LinkedList<>();
        for (int[] avail: available) {
            array.add(new int[]{avail[0], avail[1]});
            visited = new boolean[grid.length][grid[0].length];
            while(!array.isEmpty()) {
                int[] arr = array.poll();
                func(arr[0], arr[1], avail[0], avail[1], array);
            }
        }
        return steps;
    }

    public void func(int i, int j, int p, int q, Queue<int[]> array) {
        if(grid[p][q] == 1 || i < 0 || i >= grid.length || j < 0 || j >= grid.length) {
            return;
        } else {
            if(!visited[i][j]) {
                if(grid[i][j] > 0) {
                    visited[i][j] = true;
                } else if(grid[i][j] == 0) {
                    visited[i][j] = true;
                    steps += Math.abs(p-i) + Math.abs(q-j);
                    grid[p][q] = grid[p][q]-1;
                    grid[i][j] = 1;
                }
                array.add(new int[]{i, j-1});
                array.add(new int[]{i, j+1});
                array.add(new int[]{i+1, j});
                array.add(new int[]{i-1, j});
            }
        }
    }
}
