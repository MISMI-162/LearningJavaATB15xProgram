package ex_01_Java_Basics;

public class Lab003_GreatestOfThreeIntegers {
    public static void main(String[] args) {
        int n1=2;
        int n2=9;
        int n3=-11;
        int result= (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println("MAX OUT OF THREE: "+result);

    }
}
