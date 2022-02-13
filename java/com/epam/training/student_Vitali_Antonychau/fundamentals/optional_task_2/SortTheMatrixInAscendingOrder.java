package com.epam.training.student_Vitali_Antonychau.fundamentals.optional_task_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortTheMatrixInAscendingOrder {

    public static void main(String[] args) {

        Scanner scannerOfMatrixValues = new Scanner(System.in);

        System.out.println("Enter the required number of lines and columns");
        int numberOfLinesAndRaw = scannerOfMatrixValues.nextInt();
        int buffer;


        System.out.println("Matrix with " + numberOfLinesAndRaw + " Strings and " + numberOfLinesAndRaw + " Raw was created" + "\n");
        int[][] multiArr = new int[numberOfLinesAndRaw][numberOfLinesAndRaw];
        for (int i = 0; i < numberOfLinesAndRaw; i++) {
            for (int j = 0; j < numberOfLinesAndRaw; j++) {
                multiArr[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);
            }
        }
        System.out.println("Source Matrix");
        for (int i = 0; i < numberOfLinesAndRaw; i++) {
            for (int j = 0; j < numberOfLinesAndRaw; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
        // bubble sort
        for (int i = 0; i < numberOfLinesAndRaw * numberOfLinesAndRaw - 1; i++) {
            for (int j = i; j < numberOfLinesAndRaw * numberOfLinesAndRaw; j++) {
                if (multiArr[i / numberOfLinesAndRaw][i % numberOfLinesAndRaw] > multiArr[j / numberOfLinesAndRaw][j % numberOfLinesAndRaw]) {
                    buffer = multiArr[i / numberOfLinesAndRaw][i % numberOfLinesAndRaw];
                    multiArr[i / numberOfLinesAndRaw][i % numberOfLinesAndRaw] = multiArr[j / numberOfLinesAndRaw][j % numberOfLinesAndRaw];
                    multiArr[j / numberOfLinesAndRaw][j % numberOfLinesAndRaw] = buffer;
                }
            }
        }
        System.out.println("\n" + "Sorted Matrix");
        for (int i = 0; i < numberOfLinesAndRaw; i++) {
            for (int j = 0; j < numberOfLinesAndRaw; j++) {
                System.out.print(multiArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
