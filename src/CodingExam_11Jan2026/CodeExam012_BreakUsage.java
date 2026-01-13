package CodingExam_11Jan2026;

public class CodeExam012_BreakUsage {
    public static void main(String args[]) {
        /*12. WAP to print numbers from 1 to 10, but stop the loop
        when the number becomes 5 using the break statement.*/
        int a = 1;
        System.out.println("\nPrint numbers from 1 to 10, at 5 use break");
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
            if (a == 5) {
                break;
            }
        }
    }
}
