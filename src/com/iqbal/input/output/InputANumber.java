package com.iqbal.input.output;

import java.util.Scanner;

public class InputANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int numberOne = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int numberTwo = input.nextInt();

        System.out.println("Bilangan pertama: " + numberOne + "\nBilangan kedua: " + numberTwo);
    }
}
