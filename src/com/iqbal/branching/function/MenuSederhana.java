package com.iqbal.branching.function;

import java.util.Scanner;

public class MenuSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pilihan: ");
        int pilihanMenu = input.nextInt();

        switch (pilihanMenu) {
            case 1:
                System.out.println("Seblak");
                break;

            case 2:
                System.out.println("Basreng");
                break;

            case 3:
                System.out.println("Ubi Kukus");
                break;
        
            default:
                System.out.println("Input tidak valid");
                break;
        }

        input.close();
    }
}
