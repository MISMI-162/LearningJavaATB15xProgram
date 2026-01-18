package ex_01_Java_Basics;
import java.util.Scanner;

public class Lab007_ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str_input=sc.nextLine();
        System.out.println("Entered string is: "+str_input);
        String str_reverse="";
        for(int i=str_input.length()-1;i>=0;i--) {
            str_reverse=str_reverse+str_input.charAt(i);
        }
        System.out.println("Reversed string is: "+str_reverse);
    }
}
