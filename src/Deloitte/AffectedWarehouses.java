package Deloitte;

import java.util.*;



/*
 Solution for Finding Affected Warehouses After a Fire Accident
Approach
Problem Analysis:

The warehouses form a rooted tree structure where each warehouse (except the root) has exactly one parent but can have multiple children.

When a warehouse is shut down due to a fire, all downstream warehouses (its children and their descendants) lose supply and are considered affected.

The goal is to find all affected warehouses (excluding the closed warehouse itself).

Intuition:

Represent the warehouse hierarchy as a directed graph (tree) using adjacency lists where each parent points to its children.

Traverse the subtree rooted at the closed warehouse (excluding itself) to collect all affected warehouses (children and descendants).

Algorithm Selection:

Graph Construction: Build a graph where each key is a parent warehouse, and the value is a list of its children.

Breadth-First Search (BFS): Starting from the closed warehouse, traverse its children and their descendants level by level to collect all affected warehouses. BFS is chosen for its efficiency in traversing trees level-wise and avoiding recursion depth issues.

Complexity Analysis:

Time Complexity: O(N), where N is the number of edges (entries in whParentId/whChildId). Each edge is processed once during graph construction and once during BFS traversal.

Space Complexity: O(N), for storing the graph and the BFS queue.
 
 
 
 * */

public class AffectedWarehouses {
    public static List<Integer> findAffectedWarehouses(int[] whParentId, int[] whChildId, int closedWID) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = whParentId.length;
        for (int i = 0; i < n; i++) {
            int parent = whParentId[i];
            int child = whChildId[i];
            graph.computeIfAbsent(parent, k -> new ArrayList<>()).add(child);
        }
        
        List<Integer> affected = new ArrayList<>();
        if (!graph.containsKey(closedWID)) {
            return affected;
        }
        
        Queue<Integer> queue = new LinkedList<>(graph.get(closedWID));
        while (!queue.isEmpty()) {
            int current = queue.poll();
            affected.add(current);
            if (graph.containsKey(current)) {
                queue.addAll(graph.get(current));
            }
        }
        return affected;
    }

    public static void main(String[] args) {
        int[] whParentId = {0, 3, 3, 1, 1, 5, 7};
        int[] whChildId = {1, 4, 5, 2, 3, 7, 8};
        int closedWID = 3;
        System.out.println(findAffectedWarehouses(whParentId, whChildId, closedWID)); // Output: [4, 5, 7, 8]
    }
}





/**
 
 Explanation
Graph Construction:

Iterate through each pair of whParentId and whChildId to build an adjacency list (graph). Each parent maps to a list of its children.

Check for Children:

If the closed warehouse (closedWID) has no children (i.e., not in graph), return an empty list immediately.

BFS Traversal:

Initialize a queue with the children of closedWID.

For each warehouse dequeued:

Add it to the affected list.

Enqueue its children (if any) from the graph.

Continue until the queue is empty, ensuring all descendants are processed.

Output:

The affected list contains all warehouses in the subtree of closedWID (excluding itself), collected in BFS order.

Example Output:

For closedWID = 3, the output is [4, 5, 7, 8] as these are all descendants of warehouse 3.
 * /
 */