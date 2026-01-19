package CodingExam_18Jan2026;
import java.util.Scanner;
public class Lab002_LengthOfString {
    /*WAP to check whether the length of a given string is greater than 10 or not and print the result.*/
        public static void main(String[] args) {
            System.out.println("Enter a string");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            System.out.printf("Entered string is %n%s%n",str);
            int length_str=str.length();
            if(length_str >10) {
                System.out.println("Length is greater than 10 i.e: "+length_str);
            }
            else if(length_str==10) {
                System.out.println("Length is equal to 10.");
            }
            else {
                System.out.println("Length of the string is less than 10 i.e: "+length_str);
            }
        }
    }
