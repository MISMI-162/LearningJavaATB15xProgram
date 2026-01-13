package CodingExam_11Jan2026;
import java.util.Scanner;

public class CodeExam008_MonthSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*8. WAP to print the month name based on the month number (1–12) using a switch statement.*/
        System.out.println("Enter number to see the month where 1=January");
        int num=sc.nextInt();
        switch(num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
