package com.iqbal.project;

public class DiskonTokoPermen {

    static int hitungHargaPermen(int hargaSatuan, int jumlahBeli) {
        int hargaPermen = hargaSatuan * jumlahBeli;

        if (jumlahBeli >= 10) {
            int potonganDiskon = hargaPermen - 1000;
            return potonganDiskon;
        }
        return hargaPermen;
    }

    public static void main(String[] args) {
        int jumlahBayar = hitungHargaPermen(500, 12);

        System.out.println("Total harga yang harus di bayar " + jumlahBayar);
    }
}
