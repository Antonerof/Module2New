package anttoshka;

import java.util.Arrays;

/**
 * Created by Anton on 04.02.2015.
 */
public class SortArrayMultiThread implements Runnable {
    private int[] arrayToSort;

    public SortArrayMultiThread(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public synchronized void run() {
        Arrays.sort(arrayToSort);
        printArray();
    }

    public synchronized void printArray(){
        for (int i : arrayToSort) {
            System.out.println(i);
        }
    }
}
