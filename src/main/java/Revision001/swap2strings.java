package Revision001;

public class swap2strings {
    public static void main(String[] args) {
        String a = "Komal";
        String b = "E&TC";
        a = a+ b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());

        System.out.println(a + " " + b);
    }
}

