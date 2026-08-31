package com.iqbal.operator;

public class AndNotOperator {
    public static void main(String[] args) {
        System.out.println((2 * 7 + 10 <= 3 * 8) && (20 - 10 > 30 / 3));

        System.out.println(!(20 - 10 > 30 / 3));
    }
}
