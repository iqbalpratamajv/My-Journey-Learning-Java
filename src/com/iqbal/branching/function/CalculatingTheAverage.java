package com.iqbal.branching.function;

import java.util.Scanner;

public class CalculatingTheAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai b.indonesia: ");
        int binValue = input.nextInt();

        System.out.print("Masukkan nilai b.inggris: ");
        int bingValue = input.nextInt();

        System.out.print("Masukkan nilai matematika: ");
        int mtkValue = input.nextInt();

        System.out.print("Masukkan nilai ipa: ");
        int ipaValue = input.nextInt();

        int averageValue = (bingValue + bingValue + ipaValue + mtkValue) / 4;

        if ((binValue >= 0 & binValue <= 10) && (bingValue >= 0 && bingValue <= 10) && (mtkValue >= 0 && mtkValue <= 10) && (ipaValue >= 0 && ipaValue <= 10)) {
            if (bingValue >= 4 && binValue >= 4 && mtkValue >= 4 && ipaValue >= 4) {
                if (averageValue >= 5.5) {
                    System.out.println("Anda Lulus!");
                    System.out.println("Nilai Rata rata: " + averageValue);
                } else {
                    System.out.println("Anda tidak lulus!");
                    System.out.println("Nilai rata rata: " + averageValue);
                }
            } else {
                System.out.println("Anda tidak lulus! nilai dibawah 4");
                System.out.println("Nilai rata rata: " + averageValue);
            }
        } else {
            System.out.println(" Nilai harus rentang 1 - 10;");
        }

        input.close();
    }
}
