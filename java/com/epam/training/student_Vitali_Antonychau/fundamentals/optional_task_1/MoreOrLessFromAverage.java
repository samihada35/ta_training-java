package com.epam.training.student_Vitali_Antonychau.fundamentals.optional_task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MoreOrLessFromAverage {
    public static void main(String[] args) {
        Scanner scannerOfValues = new Scanner(System.in);
        ArrayList<Integer> arrayOfStartValues = new ArrayList<>();
        ArrayList<String> arrayWithLowestValues = new ArrayList<>();
        ArrayList<String> arrayWithHighestValues = new ArrayList<>();
        double generalSumOfValuesLength = 0d;

        System.out.println("What number of values your want to enter? (int data)");
        int lengthOfArray = scannerOfValues.nextInt();

        System.out.println("pls, enter " + lengthOfArray + " values (int data)");

        for (int val = 0; val < lengthOfArray; val++) {
            int value = scannerOfValues.nextInt();
            value = value < 0 ? -value : value; //чтобы не включать минус в расчёт кол-ва символов
            arrayOfStartValues.add(value);
            generalSumOfValuesLength += String.valueOf(arrayOfStartValues.get(val)).length();
        }

        double avgLength = generalSumOfValuesLength / lengthOfArray;

        for (int val = 0; val < lengthOfArray; val++) {
            String elementToString = String.valueOf(arrayOfStartValues.get(val));
            if (elementToString.length() < avgLength) {
                arrayWithLowestValues.add(elementToString);
            } else if (elementToString.length() > avgLength) {
                arrayWithHighestValues.add(elementToString);
            } else {
                System.out.println(elementToString + " = AVG value");
            }
        }

        System.out.println("\n" + "AVG value is " + avgLength);
        System.out.println("\n" + "Values, that are more then avg: ");
        for (int val = 0; val < arrayWithHighestValues.toArray().length; val++) {
            System.out.println(arrayWithHighestValues.get(val) + " with length " + arrayWithHighestValues.get(val).length() + " symbols");
        }
        System.out.println("\n" + "Values, that are less then avg: ");
        for (int val = 0; val < arrayWithLowestValues.toArray().length; val++) {
            System.out.println(arrayWithLowestValues.get(val) + " with length " + arrayWithLowestValues.get(val).length() + " symbols");
        }
    }
}
