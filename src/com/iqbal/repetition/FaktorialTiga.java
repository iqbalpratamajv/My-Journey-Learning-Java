package com.iqbal.repetition;

public class FaktorialTiga {
    public static void main(String[] args) {
        int total = 1;

        for (int i = 3; i >= 1; i--) {
            total *= i;

            System.out.println("Hasilnnya: " + total);
        }
    }
}
