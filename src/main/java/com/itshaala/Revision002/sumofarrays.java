package com.itshaala.Revision002;

public class sumofarrays {
    public static void main(String[] args) {
        int [] arr = {2,4,3,4,3};
        int sum = 0;

        for (int i =0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum is = " +sum);
    }
}
