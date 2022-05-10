package com.Donnovan;

import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstName: ");
        String FirstName = input.next();

        System.out.println("Enter LastName: ");
        String LastName = input.next();

        System.out.println("Enter Student_ID: ");
        int ID = input.nextInt();

        System.out.println("Hello World. My name is " + FirstName + " " + LastName + " " + ID );

        input.close();
    }

}
