package com.itshaala.Revision002;

import javax.swing.*;

public class EvenOddInArray {
    public static void main(String[] args) {
        int []arr = {5,7,4,5,8,6,9,12,33};
                int even =0;
        int odd = 0;

        for ( int i =0; i< arr.length; i++){
            if (arr[i]%2==0) {
                even++;
            } else
                    odd++;

        }
        System.out.println("even count is = " +even);
        System.out.println("odd count is = " +odd);
    }
}
