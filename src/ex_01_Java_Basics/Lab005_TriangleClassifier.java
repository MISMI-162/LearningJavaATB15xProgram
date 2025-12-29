package ex_01_Java_Basics;
import java.util.Scanner;

public class Lab005_TriangleClassifier {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of side1 of the triangle");
            float side1=sc.nextFloat();
            System.out.println("Enter the length of side2 of the triangle");
            float side2=sc.nextFloat();
            System.out.println("Enter the length of side3 of the triangle");
            float side3=sc.nextFloat();
            if(side1==side2 && side1==side3 && side2==side3) {
                System.out.println("Equilateral Triangle");
            }
            else if(side1==side2 || side1==side3 || side2==side3) {
                System.out.println("Isoceles Triangle");
            }
            else {
                System.out.println("Scalene Triangle");
            }
        }
}
