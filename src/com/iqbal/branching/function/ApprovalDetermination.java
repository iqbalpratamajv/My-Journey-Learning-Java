package com.iqbal.branching.function;

import java.util.Scanner;

public class ApprovalDetermination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai terakhir: ");
        int studentGrades = input.nextInt();

        if (studentGrades >= 75) {
            System.out.println("Lulus ujian");
        } else {
            System.out.println("Tidak lulus ujian");
        }

        input.close();
    }
}
