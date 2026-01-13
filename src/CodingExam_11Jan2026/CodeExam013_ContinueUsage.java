package CodingExam_11Jan2026;

public class CodeExam013_ContinueUsage {
    public static void main(String args[]) {
        /*13. WAP to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.*/
        int b=0;
        System.out.println("\nPrint numbers from 1 to 10, at 5 use continue");
        while(b<=10) {
            b++;
            if(b==5) {
                continue;
            }
            System.out.print(b+" ");
        }
    }
}
