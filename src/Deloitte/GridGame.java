package Deloitte;

import java.util.*;

/*
 Question 3: Grid Game (Minimum Moves to Win)

 Problem Statement:
 Given an m x n grid of 0s and 1s, determine if the player can win 
 (i.e., convert all cells to 1) and find the minimum moves required.
 Each move converts adjacent 0s to 1s.

 Approach:
 - Multi-source BFS: Start BFS from all initial 1s.
 - Track the maximum distance (steps) needed to reach all 0s.

 Win Condition:
 - Player can win if there's at least one 1 in the grid.

 Time Complexity: O(m * n)
 Space Complexity: O(m * n)
*/

public class GridGame {

    // Checks if it's possible to win (at least one 1 in the grid)
    public static boolean canWin(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1) return true;
            }
        }
        return false;
    }

    // Returns the minimum number of moves required to convert all 0s to 1s
    public static int minMoves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dist = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize distance matrix and enqueue all 1s
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], -1);
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dist[i][j] = 0;
                    queue.add(new int[]{i, j});
                }
            }
        }

        if (queue.isEmpty()) return -1; // no starting point

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int maxDist = 0;

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            for (int[] d : directions) {
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

    // Example usage
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0},
            {0, 0, 0},
            {1, 0, 0}
        };

        if (canWin(grid)) {
            System.out.println("Minimum moves to win: " + minMoves(grid));
        } else {
            System.out.println("Cannot win (no 1s to start spreading).");
        }
    }
}
