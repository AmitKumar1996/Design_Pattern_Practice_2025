package Deloitte;

import java.util.*;

/*
 Question 2: Closest Warehouse to Customers

 Problem Statement:
 Given warehouse and customer coordinates, map each customer to their closest warehouse.

 Approach:
 - Brute Force: For each customer, compute distance to all warehouses.
 - Track the closest warehouse.

 Time Complexity: O(M * N) for M customers and N warehouses
 Space Complexity: O(M) for storing the result
*/

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override equals and hashCode for correct usage in HashMap keys
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class WarehouseFinder {

    public static Map<Point, Point> findClosestWarehouses(List<Point> warehouses, List<Point> customers) {
        Map<Point, Point> result = new HashMap<>();

        for (Point customer : customers) {
            double minDist = Double.MAX_VALUE;
            Point closest = null;

            for (Point warehouse : warehouses) {
                double dist = calculateDistance(customer, warehouse);
                if (dist < minDist) {
                    minDist = dist;
                    closest = warehouse;
                }
            }

            result.put(customer, closest);
        }

        return result;
    }

    private static double calculateDistance(Point a, Point b) {
        int dx = b.x - a.x, dy = b.y - a.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Example usage
    public static void main(String[] args) {
        List<Point> warehouses = Arrays.asList(
            new Point(0, 0),
            new Point(5, 5),
            new Point(10, 10)
        );

        List<Point> customers = Arrays.asList(
            new Point(1, 1),
            new Point(6, 6),
            new Point(9, 9)
        );

        Map<Point, Point> closest = findClosestWarehouses(warehouses, customers);

        for (Map.Entry<Point, Point> entry : closest.entrySet()) {
            System.out.println("Customer " + entry.getKey() + " -> Closest Warehouse " + entry.getValue());
        }
    }
}
