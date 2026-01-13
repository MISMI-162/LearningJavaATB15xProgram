package CodingExam_11Jan2026;

public class CodeExam003_ExplicitTypeCast {
    public static void main(String[] args) {
        /*3. WAP to convert a double value into an int using explicit type casting and print both values.*/
        double number = 1234.983456;
        System.out.println("Before type cast i.e double value:" + number);
        int value = (int) number;
        System.out.println("AFter type cast i.e int value:" + value);
    }
}
