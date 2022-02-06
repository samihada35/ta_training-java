package com.epam.training.student_Vitali_Antonychau.fundamentals.main_task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OutputOfRandomValues {

    public static void main(String[] args) {
        Random generateRandomVal = new Random();
        ArrayList<Integer> arrayOfRandomValues = new ArrayList<>();
        Scanner scannerOfValues = new Scanner(System.in);

        System.out.println("What number of values our want to see?");

        int numberOfValues = scannerOfValues.nextInt();

        for (int val = 0; val < numberOfValues; val++) {
            arrayOfRandomValues.add(generateRandomVal.nextInt());
            System.out.println(arrayOfRandomValues.get(val));
        }

        System.out.println(" "); //for beautiful output

        for (int val = 0; val < numberOfValues; val++) {
            System.out.print(arrayOfRandomValues.get(val) + " ");
        }

    }
}
