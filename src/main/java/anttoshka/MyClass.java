package anttoshka;

import anttoshka.group.*;
import anttoshka.multithread.*;

import java.io.*;
import java.util.List;
import java.util.Random;


public class MyClass {

    public static void main(String[] args) throws InterruptedException {
//		Group studentGroup = new StudentGroup();
//		studentGroup.initializeListOfStudent();
//		studentGroup.actionsWithGroupStudent();

//        int[][] array = new int[10][20];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(90) + 10;
//            }
//        }
//
//
//        ArraysFile.arraySaveToFile(array, "aa.txt");
//
//        ArraysFile.arrayFromFile("aa.txt");
//
//        int[][] array1 = ArraysFile.arrayFromFile("aa.txt");
//
//        for (int[] ints : array1) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

//        GeomProgression[] threads = new GeomProgression[100];
//
//        for (int i = 1; i < threads.length; i++) {
//            threads[i] = new GeomProgression(i);
//        }
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new FirstLayer(), "Thread_" + i);
        }

        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }


    }

}
