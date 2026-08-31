package com.iqbal.branching.function;

import java.util.Scanner;

public class NumberChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int aNumber = input.nextInt();

        if (aNumber % 2 == 0) {
            System.out.println(aNumber + " adalah bilangan genap");
        }

        input.close();
    }
}
