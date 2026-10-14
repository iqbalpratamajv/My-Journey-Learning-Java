package com.iqbal.project;

public class CekPositifNegatif {
    public static void main(String[] args) {
        int angka = 0;

        if (angka > 0) {
            System.out.println("Positif");
        }else if(angka < 0){
            System.out.println("Negatif");
        }else{
            System.out.println("Nilainya 0");
        }
    }
}
