package com.iqbal.branching.function;

import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int numberOne = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int numberTwo = input.nextInt();

        System.out.println("1. Tambah +");
        System.out.println("2. Kurang -");
        System.out.println("3. Kali x");
        System.out.println("4. Bagi /");
        System.out.print("Pilih jenis operasi: ");
        int menuOption = input.nextInt();

        switch (menuOption) {
            case 1:
                int add = numberOne + numberTwo;
                System.out.println("Hasilnya " + add);
                break;
            case 2:
                int subtract = numberOne - numberTwo;
                System.out.println("Hasilnya " + subtract);
                break;
            case 3:
                int multiply = numberOne * numberTwo;
                System.out.println("Hasilnya " + multiply);
                break;
            case 4:
                int divide = numberOne / numberTwo;
                System.out.println("Hasilnya " + divide);
                break;
            default:
                System.out.println("Tidak ada menu pilihan");
                break;
        }

        input.close();

    }
}
