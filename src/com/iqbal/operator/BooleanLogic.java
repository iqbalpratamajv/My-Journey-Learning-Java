package com.iqbal.operator;

public class BooleanLogic {
    public static void main(String[] args) throws Exception {
        System.out.println((6 * 5 == 3 * 10) && (40 - 18 == 5 * 4));
        System.out.println((2 * 7 + 10 <= 3 * 8) && (20 - 10 > 30 / 3));
        System.out.println((12 + 1 * 3 == 39) && (11 * 2 + 9 != 62 / 2));

        System.out.println((6 * 5 == 3 * 10) || (40 - 18 == 5 * 4));
        System.out.println((2 * 7 + 10 <= 3 * 8) || (20 - 10 > 30 / 3));
        System.out.println((12 + 1 * 3 == 39) || (11 * 2 + 9 != 62 / 2));

        System.out.println(!(6 * 5 == 3 * 10));
        System.out.println(!(20 - 10 > 30 / 3));
    }
}
