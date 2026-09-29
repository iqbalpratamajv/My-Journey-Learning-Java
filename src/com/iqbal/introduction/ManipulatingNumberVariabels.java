package com.iqbal.introduction;

public class ManipulatingNumberVariabels {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        System.out.println("Bagian 1");
        int num1;
        num1 = a + b;
        System.out.println(num1);

        num1 = a - b;
        System.out.println(num1);

        num1 = a * b;
        System.out.println(num1);

        num1 = 5 / b;
        System.out.println(num1);

        num1 = 9 % 2;
        System.out.println(num1);


        System.out.println("Bagian 2");
        int num2 = 10;
        num2 -= a;
        System.out.println(num2);

        num2 += b;
        System.out.println(num2);

        num2 %= 6;
        System.out.println(num2);

        num2 *= 4;
        System.out.println(num2);

        num2 /= 2;
        System.out.println(num2);

    }
}
