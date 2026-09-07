package com.iqbal.array;

public class Table10Sub2 {
    public static void main(String[] args) {
        int[] lotteryNumber = new int[10];
        lotteryNumber[1] = 298;
        lotteryNumber[2] = 106;
        lotteryNumber[3] = 305;

        for (int lottery : lotteryNumber) {
            System.out.print(lottery + " ");
        }
    }
}
