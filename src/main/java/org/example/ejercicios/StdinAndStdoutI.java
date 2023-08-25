package org.example.ejercicios;

import java.util.Scanner;

public class StdinAndStdoutI {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        int myNum = scanner.nextInt();
        scanner.close();

        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myNum);
    }
}
