package com.iqbal.branching.function;

public class NestedIf {
    public static void main(String[] args) {
        int x = 15;
        int y = 2;

        if (x > 10) {
            System.out.println("X lebih besar dari 10");
            if (y < 20) {
                System.out.println("y lebih kecil dari 20");
            }
        }
    }
}
