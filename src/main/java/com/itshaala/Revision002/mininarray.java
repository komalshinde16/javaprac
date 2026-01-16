package com.itshaala.Revision002;

public class mininarray {
    public static void main(String[] args) {


        int[] arr = {5, 86, 95, 14, 20, 44};
        int min = arr[0];

        for (int i = 1; i > arr.length; i--) {
            if (arr[i] > min) {
                min = arr[i];
            }

        }
        System.out.println("max element is = " + min);
    }


}
