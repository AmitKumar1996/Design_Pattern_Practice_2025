package Deloitte;
import java.util.Arrays;

public class MinPlatform {

    public static void main(String[] args) {
        int[][] trains = {
            {900, 915},
            {910, 930},
            {925, 1130},
            {1000, 1030}
        };

        int n = trains.length;
        int[] arrival = new int[n];
        int[] departure = new int[n];

        for (int i = 0; i < n; i++) {
            arrival[i] = trains[i][0];
            departure[i] = trains[i][1];
        }

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformsNeeded = 1;  // at least one train is there
        int maxPlatforms = 1;

        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platformsNeeded++; // need a new platform
                i++;
            } else {
                platformsNeeded--; // one train left
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }

        System.out.println("Minimum number of platforms needed: " + maxPlatforms);
    }
}
