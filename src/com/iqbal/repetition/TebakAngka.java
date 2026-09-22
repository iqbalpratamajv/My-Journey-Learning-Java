package com.iqbal.repetition;

import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angkaBenar = 9;
        int angkaUser = 0;

        while (angkaUser != angkaBenar) {
            System.out.print("Masukkan sebuah angka: ");
            angkaUser = input.nextByte();

            if (angkaUser != angkaBenar) {
                System.out.println("Tebakan kamu salah");
            }
        }

        System.out.println("Tebakanmu benar angkanya " + angkaBenar);

        input.close();
    }
}
