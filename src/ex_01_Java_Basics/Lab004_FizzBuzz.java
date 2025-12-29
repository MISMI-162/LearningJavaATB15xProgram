package ex_01_Java_Basics;

public class Lab004_FizzBuzz {
    public static void main(String[] args) {
        for(int a=1;a<=100;a++) {
            if(a%3==0 && a%5==0) {
                System.out.println("FizzBuzz");
            }
            else if(a%3==0) {
                System.out.println("Fizz");
            }
            else if(a%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(a);
            }
        }
    }
}
