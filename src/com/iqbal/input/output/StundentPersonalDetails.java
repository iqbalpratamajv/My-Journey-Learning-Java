package com.iqbal.input.output;

import java.util.Scanner;

public class StundentPersonalDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nameStudent = input.nextLine();

        System.out.print("Masukkan NIM: ");
        int nimStudent = input.nextInt();

        System.out.print("Masukan kelas: ");
        String roomStudent = input.next();
        System.out.println();
        System.out.println("Selamat datang");
        System.out.println("Nama: " + nameStudent);
        System.out.println("NIM: " + roomStudent);
        System.out.println("Kelas: " + roomStudent);
    }
}
