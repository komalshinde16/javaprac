package com.itshaala.String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}


