package CodingExam_18Jan2026;
import java.util.Scanner;
public class Lab004_StringComparison {
        public static void main(String[] args) {
            /*compare two strings and check whether they are equal or not.*/
            System.out.println("Enter string1");
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            System.out.println("Enter string2");
            String str2=sc.nextLine();
            if(str1.length()!=str2.length()) {
                System.out.println("Strings are unequal.");
            }
            if(str1.length()==str2.length()) {
                for(int i=0;i<str1.length();i++) {
                    if(str1.equalsIgnoreCase(str2)) {
                        System.out.printf("Strings are equal.%nNote:Ignores upper/lowercase for comparison");
                        return;
                    }
                }
                System.out.println("Not equal");
            }
        }
}
