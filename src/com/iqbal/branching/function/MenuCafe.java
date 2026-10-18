package com.iqbal.branching.function;

import java.util.Scanner;

public class MenuCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Daftar menu");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.print("Pilih menu: ");
        int pilihMenu = input.nextInt();

        switch (pilihMenu) {
            case 1:
                System.out.println("Anda memesan Kopi");
                break;
            case 2:
                System.out.println("Anda memesan Teh");
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }

        input.close();
    }
}
