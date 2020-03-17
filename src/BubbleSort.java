import java.util.Arrays;

public class BubbleSort {
    // MAKE CLASS AND ARRAY
    void bubbleSort(int array[]) {
        int n = array.length;

        // POSITION A IN ARRAY?
        for (int i = 0; i < n - 1; i++)
            // PREVIOUS POSITION FOR A?
            for (int j = 0; j < n - i - 1; j++)
                // SWAPPING
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String args[]) {
        BubbleSort action = new BubbleSort();
        // ARRAYS TO BE SORTED
        int arrayA[] = {70, 61, 72, 83, 38};
        int arrayB[] = {7,2,76,4,99};
        int arrayC[] = {28,9,13,78,19};
        int arrayD[] = {68,84,41,62,18};
        // APPLY SORTING METHOD TO THE ARRAYS AND THEN PRINT
        action.bubbleSort(arrayA);
        action.bubbleSort(arrayB);
        action.bubbleSort(arrayC);
        action.bubbleSort(arrayD);
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
        System.out.println(Arrays.toString(arrayD));

    }
}

