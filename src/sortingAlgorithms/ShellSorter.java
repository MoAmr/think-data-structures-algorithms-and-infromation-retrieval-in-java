package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Mohammed Amr
 * @created 27/03/2021 - 01:26
 * @project think-data-structures
 */
public class ShellSorter {

    /**
     * In the main method, I have also compared the times between shell sort and insertion sort algorithm.
     * On my system, Shell Sort took about 95 millis to sort 100,000 records,
     * while insertion sort takes about over 18 seconds to do the same.
     * You may want to play with it yourself and see how fast Shell Sort really is.
     */
    public static void main(String[] args) {
        int lengthOfArray = 10000;
        Integer[] data1 = new Integer[lengthOfArray];
        // populate the array with some random numbers
        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < lengthOfArray; i++) {
            data1[i] = rand.nextInt(100001);
        }

        // make another copy of the array, so that we can use the regular InsertionSort Algorithm over it
        Integer[] data2 = new Integer[lengthOfArray];
        System.arraycopy(data1, 0, data2, 0, lengthOfArray);

        long start = System.currentTimeMillis();
        new ShellSorter().sort(data1);
        long end = System.currentTimeMillis();
        System.out.println("Takes " + (end - start) + " millis for Shell Sort");

        System.out.println(Arrays.equals(data1, data2));
    }

    public void sort(Integer[] data) {
        if (data == null || data.length == 0)
            return;

        int knuthNum = maxKnuthSeqNumber(data.length);
        while (knuthNum >= 1) {
            for (int i = 0; i < knuthNum; i++) {
                // internally we use insertion sort for each pass
                insertionSortWithGap(data, i, knuthNum);
            }
            knuthNum = (knuthNum - 1) / 3; // decrease the gap
        }
    }

    private void insertionSortWithGap(Integer[] data, int startIndex, int gap) {
        int i = startIndex;
        while(i < data.length) {
            int current = data[i];
            int j = i - gap;
            while (j >= 0 && data[j] >= current) {
                data[j + gap] = data[j];
                j = j - gap;
            }
            data[j + gap] = current;
            i = i + gap;
        }
    }

    private int maxKnuthSeqNumber(int size) {
        int h = 1;
        while (h < size / 3) {
            h = 3 * h + 1;
        }
        return h;
    }
}
