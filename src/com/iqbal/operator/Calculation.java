package com.iqbal.operator;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int numberOne = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int numberTwo = input.nextInt();

        int addition = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiplication = numberOne * numberTwo;
        double division = numberOne / numberTwo;

        System.out.println("Hasil penjumlahan: " + addition);
        System.out.println("Hasil pengurangan: " + subtraction);
        System.out.println("Hasil perkalian: " + multiplication);
        System.out.println("Hasil pembagian: " + division);
    }
}
