package com.iqbal.method;

public class MethodOverloading {

    static int tambah(int a, int b) {
        return a + b;
    }

    static double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int hasilTambah = tambah(2, 8);

        System.out.println(hasilTambah);
    }
}
