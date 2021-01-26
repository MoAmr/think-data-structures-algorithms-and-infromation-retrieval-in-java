package analysisOfAlgorithms;

/**
 * @author Mohammed Amr
 * @created 26/01/2021 - 02:26
 * @project think-data-structures
 */
public class SelectionSort {

    /**
     * Swaps the elemments at index i and j.
     * author Mohammed Amr
     * @param array
     * @param i
     * @param j
     * {@link SelectionSort}
     */
    public static void swapElements(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    /** Finds the index of the lowest value
     * starting from the index at start (inclusive)
     * and going to the end of the array.
     * author Mohammed Amr
     * @param array
     * @param start
     * {@link SelectionSort}
     */
    public static int indexLowest(int[] array, int start) {

        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /** Sorts the elements (in place) using selection sort.
     * author Mohammed Amr
     * {@link SelectionSort}
     */
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }
    
}
