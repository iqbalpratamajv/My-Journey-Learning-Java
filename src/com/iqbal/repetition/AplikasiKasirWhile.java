package com.iqbal.repetition;

import java.util.Scanner;

public class AplikasiKasirWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalBelanja = 0;
        int hargaBarang = 1;

        while (hargaBarang != 0) {
            System.out.print("Masukkan harga barang: ");
            hargaBarang = input.nextInt();

            totalBelanja += hargaBarang;
        }

        System.out.println("Total harga yang harus dibayar: " + totalBelanja);

        input.close();
    }
}
