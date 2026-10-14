package com.iqbal.branching.function;

public class Verivikasi {
    public static void main(String[] args) {
        boolean masuk = true;
        boolean admin = false;
        int tingkatKeamanan = 3;

        if (masuk && (admin || tingkatKeamanan <= 2)) {
            System.out.println("Boleh masuk");
        }else{
            System.out.println("Jangan masuk");
        }
    }
}
