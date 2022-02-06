package com.epam.training.student_Vitali_Antonychau.fundamentals.main_task;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArgs {

    public static void main(String[] args) {

        Scanner scannerForChoice = new Scanner(System.in);
        int choice = 0;

        while (choice != 1 && choice != 2) {
            System.out.println("Are you want to revert String (1) or revert Array(2)?");
            choice = scannerForChoice.nextInt();
        }

        if (choice == 1) {
            Scanner scannerForString = new Scanner(System.in);
            System.out.println("What args your want to be reverted?");
            System.out.println(new StringBuilder(scannerForString.nextLine()).reverse());

        } else {

            Scanner scannerOfArray = new Scanner(System.in);
            ArrayList<String> arrayOfValues = new ArrayList<>();

            System.out.println("What length of array your want? (int data)");
            int lengthOfArray = scannerOfArray.nextInt();

            for (int val = 0; val < lengthOfArray; val++) {
                Scanner scannerOfArrayElements = new Scanner(System.in);
                System.out.println("add new element");
                arrayOfValues.add(scannerOfArrayElements.nextLine());
            }

            for (int i = 0; i < lengthOfArray; i++) {
                System.out.print(arrayOfValues.get((lengthOfArray - 1) - i) + " ");
            }
        }
    }
}
