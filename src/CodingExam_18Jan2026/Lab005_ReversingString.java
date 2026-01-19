package CodingExam_18Jan2026;
import java.util.Scanner;
public class Lab005_ReversingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String str1="";
        System.out.printf("String entered is:%n%s%n",str);
        for(int i=str.length()-1;i>=0;i--) {
            str1=str1+str.charAt(i);
        }
        System.out.println("Reversed String is\n"+str1);
    }
}
