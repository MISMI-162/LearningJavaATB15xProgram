package CodingExam_16Jan2026;
import java.util.Scanner;
public class Lab003_CaseConversion {
    /*WAP to cconvert a given string into uppercase and print the result.*/
        public static void main(String[] args) {
            System.out.println("Enter a string");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            System.out.printf("Entered string is %n%s%n",str);
            String str1=str.toUpperCase();
            System.out.println(str1);
        }
    }
