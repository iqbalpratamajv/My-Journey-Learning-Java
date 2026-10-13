package com.iqbal.branching.function;

public class NestedIfTwo {
    public static void main(String[] args) {
        int umur = 25;
        boolean wargaNegara = false;

        if (umur >= 20) {
            System.out.println("Umur kamu mencukupi");
            if (wargaNegara) {
                System.out.println("Kamu adalah warga negara, kamu bisa coblos");
            }else{
                System.out.println("Kamu bukan warga negara, tidak bisa coblos");
            }
        }else{
            System.out.println("Umur kamu kurang");
        }
    }
}
