package com.iqbal.project;

public class CekRemaja {
    public static void main(String[] args) {
        int umurRemaja = 10;

        if (umurRemaja > 18) {
            System.out.println("Boleh masuk");
        }else if(umurRemaja < 18){
            System.out.println("Dilarang masuk");
        }else{
            System.out.println("Tidak valid");
        }
    }
}
