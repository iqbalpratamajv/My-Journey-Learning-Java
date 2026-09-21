package com.iqbal.method;

public class MethodParameter {

    static void tampilkanNama(String nama, int umur) {
        System.out.println("Halo: " + nama + " Umur: " + umur);
    }

    public static void main(String[] args) {
        tampilkanNama("Iqbal", 20);
    }
}
