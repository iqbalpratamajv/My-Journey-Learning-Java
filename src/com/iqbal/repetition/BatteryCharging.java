package com.iqbal.repetition;


public class BatteryCharging {
    public static void main(String[] args) {
        int batteryLevel = 70;
        int maximumCapacity = 100;

        while (batteryLevel <= maximumCapacity) {
            System.out.println("Baterai sedang diisi. Level saat ini " + batteryLevel + "%");

            batteryLevel += 5;
        }
        System.out.println("Baterai penuh");
    }
}
