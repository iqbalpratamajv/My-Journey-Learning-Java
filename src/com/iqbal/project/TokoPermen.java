package com.iqbal.project;

public class TokoPermen {

    static int hitungTotalHarga(int hargaSatuanPermen, int jumlahBeli) {
        int totalHarga = hargaSatuanPermen * jumlahBeli;
        return totalHarga;
    }

    public static void main(String[] args) {
        int hargaBayar = hitungTotalHarga(500, 6);

        System.out.println("total harga yang harus dibayar: " + hargaBayar);
    }
}
