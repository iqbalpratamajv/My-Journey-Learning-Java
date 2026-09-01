package com.iqbal.branching.function;

import java.util.Scanner;

public class PredicateDetermination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int value = input.nextInt();

        if (value >= 85 && value <= 100) {
            System.out.println("A");
        } else if (value >= 75 && value < 85) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
