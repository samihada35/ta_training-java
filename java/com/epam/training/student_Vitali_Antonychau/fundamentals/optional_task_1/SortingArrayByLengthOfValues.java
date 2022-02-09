package com.epam.training.student_Vitali_Antonychau.fundamentals.optional_task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingArrayByLengthOfValues {

    public static void main(String[] args) {

        Scanner scannerOfLength = new Scanner(System.in);
        ArrayList<Integer> arrayOfValues = new ArrayList<>();
        ArrayList<Integer> arrayOfSortedValues = new ArrayList<>();

        System.out.println("What number of values your want to enter? (int data)");
        int lengthOfArray = scannerOfLength.nextInt();

        System.out.println("pls, enter " + lengthOfArray + " values (int data)");

        for (int val = 0; val < lengthOfArray; val++) {
            int value = scannerOfLength.nextInt();
            value = value < 0 ? -value : value;
            arrayOfValues.add(value);
        }

        for (int val = lengthOfArray; val >= lengthOfArray; val--) {
            int longestVal = arrayOfValues.get(0);
            if (lengthOfArray > 1) {
                for (int element = 1; element < lengthOfArray; element++) {
                    longestVal = (Math.max(longestVal, arrayOfValues.get(element)));
                }
                int index = arrayOfValues.indexOf(longestVal);
                arrayOfSortedValues.add(longestVal);
                arrayOfValues.remove(index);
                lengthOfArray--;
            } else arrayOfSortedValues.add(longestVal);
        }
        System.out.println(arrayOfSortedValues);

        for (int i = arrayOfSortedValues.toArray().length - 1; i >= 0; i--) {
            System.out.print(arrayOfSortedValues.get(i) + "  ");
        }

    }
}
