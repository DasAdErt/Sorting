import java.util.Arrays;
import java.util.Random;

import static java.util.Collections.swap;

public class SortingMethods {
    Random random = new Random();

    void bubble() { //пузырьковый
        System.out.println("Bubble sorting");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int[] sortArray = new int[array.length];

        System.arraycopy(array, 0, sortArray, 0, array.length);

        for (int i = 0; i < sortArray.length - 1; i++) {
            for (int k = 0; k < sortArray.length - i - 1; k++) {
                if (sortArray[k + 1] < sortArray[k]) {
                    int swap = sortArray[k];
                    sortArray[k] = sortArray[k + 1];
                    sortArray[k + 1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(sortArray));
    }

    void combSort(){
        System.out.println("\n\nComb sorting");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int gap_length = array.length;
        float shrinkFactor = 1.3f;
        boolean swapped = false;

        while (gap_length > 1 || swapped) {
            if (gap_length > 1) {
                gap_length = (int)(gap_length / shrinkFactor);
            }

            swapped = false;

            for (int i = 0; gap_length + i < array.length; i++) {
                if (array[i] > array[i + gap_length]) {
                    swap(array, i, i + gap_length);
                    swapped = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
    private static void swap(int nums[], int x, int y) {
        Integer temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
