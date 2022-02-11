package com.epam.training.student_Vitali_Antonychau.fundamentals.optional_task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNumberWithOnlyFromDifferentDigits {
    public static void main(String[] args) {
        Scanner scannerOfValues = new Scanner(System.in);
        ArrayList<Integer> arrayOfStartValues = new ArrayList<>();
        ArrayList<Integer> temporaryArrayOfValues = new ArrayList<>();
        ArrayList<Integer> arrayListOfCounters = new ArrayList<>();

        System.out.println("What number of values your want to enter? (int data)");
        int lengthOfArray = scannerOfValues.nextInt();

        System.out.println("pls, enter " + lengthOfArray + " values (int data)");

        for (int val = 0; val < lengthOfArray; val++) {
            int counter = 0;
            int value = scannerOfValues.nextInt();

            value = value < 0 ? -value : value; //чтобы не включать минус в расчёт кол-ва символов
            arrayOfStartValues.add(value);

            while (value != 0) {
                int symbol = value % 10;
                value /= 10;
                temporaryArrayOfValues.add(symbol);
            }

            for (int element = temporaryArrayOfValues.toArray().length - 1; element > 0; element--) { //сортировка
                for (int j = 0; j < element; j++) {
                    if (temporaryArrayOfValues.get(j) > temporaryArrayOfValues.get(j + 1)) {
                        int buffer = temporaryArrayOfValues.get(j);
                        temporaryArrayOfValues.set(j, temporaryArrayOfValues.get(j + 1));
                        temporaryArrayOfValues.set(j + 1, buffer);
                    }
                }
            }

            for (int el = 0; el < temporaryArrayOfValues.toArray().length - 1; el++) {
                if (temporaryArrayOfValues.get(el).equals(temporaryArrayOfValues.get(el + 1))) {
                    counter += 1;
                }
            }
            arrayListOfCounters.add(counter);

            temporaryArrayOfValues.clear();
        }

        int correctAnswer = arrayListOfCounters.indexOf(0);

        if (correctAnswer != -1) {
            System.out.println("a number consisting of only distinct digits is " + arrayOfStartValues.get(correctAnswer));
        } else {
            System.out.println("There is no correct values");
        }

    }
}
