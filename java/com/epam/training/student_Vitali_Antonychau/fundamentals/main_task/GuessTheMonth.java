package com.epam.training.student_Vitali_Antonychau.fundamentals.main_task;

import java.util.Scanner;

public class GuessTheMonth {

    public static void main(String[] args) {
        Scanner scannerOfMonth = new Scanner(System.in);
        int numberOfMonth =0;

        while (numberOfMonth < 1 || numberOfMonth > 12) {
            System.out.println("pls enter the number between 1 and 12");
            numberOfMonth = scannerOfMonth.nextInt();
        }

        switch (numberOfMonth) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }

    }

}
