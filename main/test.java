package main;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] a = new int[3];
        int i = 0;
        while(m>0) {
            a[i++] = m%10;
            m/=10;
        }
        int sum = 0;
        for(int j = 0;j < 3;j++) {
            sum += a[j];
        }
        System.out.print(sum);
    }
}
