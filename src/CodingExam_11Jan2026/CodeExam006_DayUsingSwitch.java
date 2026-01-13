package CodingExam_11Jan2026;
import java.util.Scanner;

public class CodeExam006_DayUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*6. WAP to print the name of the day based on a number (1–7) using a switch statement.*/
        System.out.println("Enter an integer to print the day in a week where 1=Sunday");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
