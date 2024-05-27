//package com.sridhar.code.library.hard.graphs;
//
//import java.util.List;
//
//public class SolveNQueens {
//
//    public List<List<String>> solveNQueens(int n) {
//
//        int[][] grid = new int[n][n];
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<n; j++) {
//                grid[i][j] = 0;
//            }
//        }
//
//        for(int i=0; i<n; i++) {
//            grid[0][i] = 1;
//            backtracking(grid, 0, i);
//            grid[0][i] = 0;
//        }
//    }
//
//
//    public void backtracking(int[][] grid, int i, int j) {
//        if(grid[i][j] == 1) {
//
//        }
//    }
//
//}
