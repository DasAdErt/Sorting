import java.util.Arrays;
import java.util.Random;

public class SortingMethods {
    Random random = new Random();

    void bubble() { //пузырьковый
        System.out.println("Bubble sorting");

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //System.out.println(Arrays.toString(array));

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

        //System.out.println(Arrays.toString(sortArray));
    }

    void combSort(){
        System.out.println("\n\nComb sorting");

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //System.out.println(Arrays.toString(array));

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

        //System.out.println(Arrays.toString(array));
    }
    private static void swap(int nums[], int x, int y) {
        Integer temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    void cocktailSort()
    {
        System.out.println("\n\nShaker sorting");

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //System.out.println(Arrays.toString(array));

        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped == true)
        {
            swapped = false;

            for (int i = start; i < end - 1; ++i)
            {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--)
            {
                if (array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }

       // System.out.println(Arrays.toString(array));
    }

    void insertionSort(){
        System.out.println("\n\nInsertion sorting");

        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {
            int value = array[left];

            int i = left - 1;

            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        //System.out.println(Arrays.toString(array));
    }
}
