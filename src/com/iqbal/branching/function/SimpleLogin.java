package com.iqbal.branching.function;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String admin = "admin123";
        String passAdmin = "admin123";

        String user = "user123";
        String passUser = "user123";

        System.out.print("Masukkan username: ");
        String userLogin = input.next();

        System.out.print("Masukkan password: ");
        String userPassword = input.next();

        if (userLogin.equals(admin)) {
            if (userPassword.equals(passAdmin)) {
                System.out.println("Selamat datang admin");
            } else {
                System.out.println("User atau password salah");
            }
        } else if (userLogin.equals(user)) {
            if (userPassword.equals(passUser)) {
                System.out.println("Selamat datang user");
            } else {
                System.out.println("User atau password salah");
            }
        } else {
            System.out.println("Akun belum terdaftar");
        }

        input.close();
    }
}
