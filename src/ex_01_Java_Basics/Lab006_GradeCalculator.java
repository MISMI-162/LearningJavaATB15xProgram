package ex_01_Java_Basics;
import java.util.Scanner;

public class Lab006_GradeCalculator {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the score to calculate the GRADE");
            float score=sc.nextFloat();
            if(score>=90 && score<=100) {
                System.out.println("Grade A " +score);
            }
            else if(score>=80 && score<90) {
                System.out.println("Grade B " +score);
            }
            else if(score>=70 && score<80) {
                System.out.println("Grade C " +score);
            }
            else if(score>=60 && score<70) {
                System.out.println("Grade D " +score);
            }
            else if(score>=0 && score<60) {
                System.out.println("Grade F " +score);
            }
            else {
                System.out.println("INVALID Input " +score);
            }
        }
    }
