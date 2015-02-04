package anttoshka;

import anttoshka.group.*;
import anttoshka.multithread.*;

import java.io.*;
import java.util.List;
import java.util.Random;


public class MyClass {

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[200000];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000);
        }

        SortArrayMultiThread sortArray = new SortArrayMultiThread(array);

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(sortArray);
        }

        for (Thread thread : threads) {
            thread.start();
        }

    }
}
