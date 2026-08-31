package com.iqbal.operator;

import java.util.Scanner;

public class ChangeTheTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam celcius: ");
        int celciusTemperature = input.nextInt();

        int fahrenheitTemperature = (9 * celciusTemperature / 5) + 32;

        System.out.println("Hasil setelah dirubah: " + fahrenheitTemperature);

        input.close();
    }
}
