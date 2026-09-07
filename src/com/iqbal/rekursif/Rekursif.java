package com.iqbal.rekursif;

public class Rekursif {
    public static int sum(int x, int y) {
        if (x > y) {
            return y + sum(x, y - 1);
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int result = sum(5, 7);
        System.out.println(result);
    }

}
