package ex_01_Java_Basics;
import java.util.Scanner;

public class Lab008_SecondLargest {
        public static void main(String[] args) {
            System.out.println("Enter size of array");
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            if(size<2) {
                System.out.println("Atleast 2 numbers/integers are necssary for comparison," +
                        " enter valid size for creating array");
                return;
            }
            int[] num=new int[size];
            for(int n=0;n<num.length;n++) {
                System.out.printf("Enter %d value%n",n);
                num[n]=sc.nextInt();
            }
            int f_largest=num[0];
            int s_largest=num[1];
            if(num[0]>num[1]) {
                f_largest=num[0];
                s_largest=num[1];
            }
            else {
                f_largest=num[1];
                s_largest=num[0];
            }
            for(int i=2;i<num.length;i++) {
                if(num[i]>f_largest) {
                    s_largest=f_largest;
                    f_largest=num[i];
                }
                else if(num[i]>s_largest) {
                    s_largest=num[i];
                }
            }
            System.out.println("Largest number is: "+f_largest);
            System.out.println("Second largest number is: "+s_largest);

        }
    }
