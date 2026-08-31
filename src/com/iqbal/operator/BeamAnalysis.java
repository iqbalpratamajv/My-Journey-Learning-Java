package com.iqbal.operator;

import java.util.Scanner;

public class BeamAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        int lenghtOfTheBlock = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        int blockWidth = input.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        int blockHeight = input.nextInt();

        int surfaceAreaOfBlock = 2 * ((lenghtOfTheBlock * blockWidth) + (lenghtOfTheBlock * blockHeight) + (blockWidth * blockHeight));

        System.out.println("Hasil dari luas permukaan balok: " + surfaceAreaOfBlock);
        input.close();
    }
}
