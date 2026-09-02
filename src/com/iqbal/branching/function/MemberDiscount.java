package com.iqbal.branching.function;

import java.util.Scanner;

public class MemberDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: Rp");
        int totalSpending = input.nextInt();

        System.out.print("Apakah memiliki kartu member (y/n): ");
        String member = input.next();

        int totalDiscount20 = totalSpending - (totalSpending * 20 / 100);
        int totalDiscount10 = totalSpending - (totalSpending * 10);

        if (totalSpending >= 500000) {
            if (member.equals("y")) {
                System.out.println("Anda mendapat diskon 20%");
                System.out.println("Total yang harus dibayarkan: Rp" + totalDiscount20);
            } else {
                System.out.println("Anda tidak mendapat diskon");
                System.out.println("Total yang harus anda bayar Rp" + totalDiscount10);
            }
        } else if (totalSpending < 500000) {
            if (member.equals("y")) {
                System.out.println("Anda mendapat diskon 10%");
                System.out.println("Total yang harus anda bayar Rp" + totalDiscount10);
            } else {
                System.out.println("Anda tidak mendapat diskon");
                System.out.println("total yang harus di bayar: " + totalSpending);
            }
        } else {
            System.out.println("eror");
        }

        input.close();
    }
}
