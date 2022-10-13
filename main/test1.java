package main;
import java.util.Scanner;
public class test1 {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        double n=sc.nextDouble();
        int m;
        n= n*100;
        m=(int)n;
        System.out.println(m/1000+"张十元");
        System.out.println(m%1000/500+"张五元");
        System.out.println(m%500/100+"张一元");
        System.out.println(m%100/50+"个五角");
        System.out.println(m%50/10+"个一角");
        System.out.println(m%10/2+"个贰分");
        System.out.println(m%2+"个壹分");

    }
}
