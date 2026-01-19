package ex_01_Java_Basics;

public class Lab009_PyramidPattern {
    public static void main(String[] args) {
        System.out.println("Printing star pyramid");
        int n = 5;
        for (int a = 1; a <= n; a++) {
            for (int i = 1; i <= n - a; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
