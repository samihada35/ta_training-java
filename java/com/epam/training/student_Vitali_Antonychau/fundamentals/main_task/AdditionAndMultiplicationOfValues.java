package com.epam.training.student_Vitali_Antonychau.fundamentals.main_task;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionAndMultiplicationOfValues {

    public static void main(String[] args) {

        Scanner scannerOfValues = new Scanner(System.in);
        ArrayList<Integer> arrayOfValues = new ArrayList<>();
        int sum = 0;
        int mul = 1;

        System.out.println("What number of values your want to enter? (int data)");
        int lengthOfArray = scannerOfValues.nextInt();

        System.out.println("pls, enter the values");

        for (int val = 0; val < lengthOfArray; val++) {
            arrayOfValues.add(scannerOfValues.nextInt());
        }

        for (int i = 0; i < lengthOfArray; i++) {
            sum = sum + arrayOfValues.get(i);
            mul = mul * arrayOfValues.get(i);
        }

        System.out.println("The sum of values = " + sum + "\n" + "The multiplication of values = " + mul);
    }
}
