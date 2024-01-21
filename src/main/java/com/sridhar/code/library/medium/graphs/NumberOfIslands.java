package com.sridhar.code.library.medium.graphs;


import java.util.*;

/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.



Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.

 */


class Pair<T, P> {
    T left;
    P right;

    public T getLeft() {
        return left;
    }

    public P getRight() {
        return right;
    }

    public Pair(T left, P right) {
        this.left = left;
        this.right = right;
    }
}

public class NumberOfIslands {

    int m;
    int n;
    boolean[][] visited;



    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j]) {
                    if(grid[i][j] == '1') {
                        breadthFirstSearch(grid, i, j);
                        count++;
                    } else {
                        visited[i][j] = true;
                    }
                }
            }
        }
        return count;
    }

    private void breadthFirstSearch(char[][] grid, int i, int j) {
        Queue<Pair<Integer, Integer>> indices = new LinkedList<>();
        indices.add(new Pair<>(i, j));
        visited[i][j] = true;
        while(indices.size() > 0) {
            Pair<Integer, Integer> index = indices.poll();
            int p = index.getLeft();
            int q = index.getRight();
            if(p+1 < m && q < n) {
                if(grid[p+1][q] == '1' && !visited[p + 1][q])
                    indices.add(new Pair<>(p+1,q));
                visited[p + 1][q] = true;
            }
            if(p-1 >= 0 && q < n) {
                if(grid[p-1][q] == '1' && !visited[p - 1][q])
                    indices.add(new Pair<>(p-1,q));
                visited[p - 1][q] = true;
            }
            if(p < m && q+1 < n) {
                if(grid[p][q+1] == '1' && !visited[p][q+1])
                    indices.add(new Pair<>(p,q+1));
                visited[p][q+1] = true;
            }
            if(p < m && q-1 >= 0) {
                if(grid[p][q-1] == '1' && !visited[p][q-1])
                    indices.add(new Pair<>(p,q-1));
                visited[p][q-1] = true;
            }
        }
    }



}
