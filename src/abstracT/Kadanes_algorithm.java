package abstracT;

public class Kadanes_algorithm  {

    public static void main(String[] args) {

        int[] A = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int[] A = {1, 2, 3, -2};

        int maxSum = A[0]; // -2
        int currSum = A[0]; // -2

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < A.length; i++) {

            if (currSum + A[i] < A[i]) {
                currSum = A[i];
                tempStart = i;   // new subarray starts
            } else {
                currSum += A[i];
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Max Sum = " + maxSum);
        System.out.println("Start Index = " + start);
        System.out.println("End Index = " + end);
    }
}
