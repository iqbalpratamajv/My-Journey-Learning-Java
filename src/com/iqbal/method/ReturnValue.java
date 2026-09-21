package com.iqbal.method;

public class ReturnValue {

    static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int hasil = hitungLuasPersegi(6);

        System.out.println(hasil);
    }
}
