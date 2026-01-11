package Revision001;

public class palindrome {
    public static void main(String[] args) {
        String str = "radar";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}



