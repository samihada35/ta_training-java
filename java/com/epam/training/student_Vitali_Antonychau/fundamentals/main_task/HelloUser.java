package com.epam.training.student_Vitali_Antonychau.fundamentals.main_task;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is tour name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

}
