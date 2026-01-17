package com.itshaala.String;

public class revastring {
    public static void main(String[] args) {
        String str = "Goat";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
