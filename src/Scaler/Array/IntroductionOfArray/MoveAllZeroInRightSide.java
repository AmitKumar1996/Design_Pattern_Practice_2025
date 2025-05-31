package Scaler.Array.IntroductionOfArray;

public class MoveAllZeroInRightSide {
    
    public static int[] moveZero(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }
        while (index < array.length) {
            array[index++] = 0;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 0, 0, 0, 9};
        int[] ans = null;  // ✅ Declare outside try so it's accessible after

        try {
            ans = moveZero(array);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ✅ Now safely print outside the try block
        if (ans != null) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Error occurred, no output to print.");
        }
    }
}
