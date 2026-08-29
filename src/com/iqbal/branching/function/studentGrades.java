package com.iqbal.branching.function;

import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int HIGHEST_SCORE = 90;

        System.out.print("Masukkan nilai mahasiswa: ");
        int value = input.nextInt();

        if (value >= HIGHEST_SCORE) {
            System.out.println("Anda mendapatkan nilai A");
        } else {
            System.out.println("Anda mendapat nilai C");
        }
    }
}
