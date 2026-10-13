package com.iqbal.project;

public class PeriksaLogin {
    public static void main(String[] args) {
        boolean user = true;
        boolean password = false;

        System.out.println("Regular user: "+ (user && password));
        System.out.println("Regular user: "+ (user || password));
        System.out.println("Regular user: "+ (!password));
    }
}
