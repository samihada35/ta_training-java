package com.epam.training.student_Vitali_Antonychau.fundamentals.optional_task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindTheShortestAndLongestNumber {

    public static void main(String[] args) {
        Scanner scannerOfLength = new Scanner(System.in);
        ArrayList<Integer> arrayOfValues = new ArrayList<>();

        System.out.println("What number of values your want to enter? (int data)");
        int lengthOfArray = scannerOfLength.nextInt();

        System.out.println("pls, enter " + lengthOfArray + " values (int data)");

        for (int val = 0; val < lengthOfArray; val++) {
            int value = scannerOfLength.nextInt();
            value = value < 0 ? -value : value;
            arrayOfValues.add(value);
        }

        int longestLength = arrayOfValues.get(0);
        for (int element = 1; element < lengthOfArray; element++) {
            longestLength = (Math.max(longestLength, arrayOfValues.get(element)));
        }

        System.out.println("The longest value is " + longestLength);
        System.out.println("Length of this value is " + String.valueOf(longestLength).length());

        int shortestLength = arrayOfValues.get(0);

        for (int element = 1; element < lengthOfArray; element++) {
            shortestLength = (Math.min(shortestLength, arrayOfValues.get(element)));
        }

        System.out.println("The shortest value is " + shortestLength);
        System.out.println("Length of this value is " + String.valueOf(shortestLength).length());
    }

    //more simple method

    /*public static void main(String[] args) {
        Scanner scannerOfLength = new Scanner(System.in);
        ArrayList<Integer> arrayOfValues = new ArrayList<>();

        System.out.println("What number of values your want to enter? (int data)");
        int lengthOfArray = scannerOfLength.nextInt();

        System.out.println("pls, enter " + lengthOfArray + " values (int data)");

        for (int val = 0; val < lengthOfArray; val++) {
            int value = scannerOfLength.nextInt();
            value = value < 0 ? -value : value;
            arrayOfValues.add(value);
        }

        int longest = Collections.max(arrayOfValues);
        System.out.println("The longest value is " + longest + "\n"+ "Length of this value is " + String.valueOf(longest).length());

        int shortest = Collections.min(arrayOfValues);
        System.out.println("The shortest value is " + shortest + "\n" + "Length of this value is " + String.valueOf(shortest).length());

    }*/

}
