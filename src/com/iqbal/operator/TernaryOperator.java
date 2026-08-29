package com.iqbal.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        String ternary;

        numberOne = 3 * 3;
        numberTwo = 7 * 4;

        ternary = (numberOne < numberTwo) ? "true" : "false";

        System.out.println(ternary);
    }
}
