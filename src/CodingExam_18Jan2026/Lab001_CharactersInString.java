package CodingExam_18Jan2026;
import java.util.Scanner;
public class Lab001_CharactersInString {
    /*1. WAP to count the total number of characters in a given string (excluding spaces).*/
        public static void main(String[] args) {
            System.out.println("Enter a string");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String str1=str.replaceAll(" ", "");
            System.out.printf("Entered string is %n%s%n",str);
            System.out.printf("Entered string without space is %n%s%n",str1);
            int count=0;
            for(int i=0;i<str1.length();i++) {
                count++;
            }
            System.out.println("Length of the string is: "+count);
        }
    }
