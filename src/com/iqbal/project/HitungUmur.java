package com.iqbal.project;

public class HitungUmur {

    static int hitungUmur(int tahunSekarang, int tahunLahir) {
        int hasilUmur = tahunSekarang - tahunLahir;
        return hasilUmur;
    }

    public static void main(String[] args) {
        int umurSaya = hitungUmur(2026, 2006);

        System.out.println("umur saya sekarang " + umurSaya);

        if (umurSaya >= 18) {
            System.out.println("Kamu remaja");
        } else {
            System.out.println("Kamu anak anak!");
        }
    }
}
