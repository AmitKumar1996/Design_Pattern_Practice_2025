package Deloitte;

import java.util.*;



/*
 Question 3: Grid Game (Minimum Moves to Win)
Problem Statement
Given an m x n grid of 0s and 1s, determine if the player can win (turn all cells to 1) and find the minimum moves required. Each move converts adjacent 0s to 1s.

Approach

Multi-source BFS:

Start BFS from all initial 1s.

Track maximum distance (steps) needed to cover farthest 0.

Win Condition:

Player can win if there’s at least one 1 initially.

Complexity

Time: O(m*n) for BFS traversal.

Space: O(m*n) for distance matrix and queue.
 * */

public class GridGame {
    public static boolean canWin(int[][] grid) {
        for (int[] row : grid)
            for (int cell : row)
                if (cell == 1) return true;
        return false;
    }
    
    public static int minMoves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dist = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], -1);
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dist[i][j] = 0;
                    queue.add(new int[]{i, j});
                }
            }
        }
        if (queue.isEmpty()) return -1;
        
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int maxDist = 0;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    maxDist = Math.max(maxDist, dist[nr][nc]);
                    queue.add(new int[]{nr, nc});
                }
            }
        }
        return maxDist;
    }
}