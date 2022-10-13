package unit3;

import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x>60){
            System.out.println("sb");
        }else {
            System.out.println("nb");
        }

        if(x >= 60){
            if (x >= 90) {
                System.out.println("A");
            }
        }else {
            if (x>=40){
                System.out.println("e");
            }else {
                System.out.println("f");
            }
        }

        System.out.println("0000000000000000000000000000000000000000000");
        if(x>=90){
            System.out.println("AA");
        }else if(x>=60){
            System.out.println("MM");
        } else if (x>=40) {
            System.out.println("PP");
        }else {
            System.out.println("GG");

        }
        int score = x / 10;
        switch (score){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("B");
                break;
            case 5:
            case 4:
                System.out.println("p");
                break;
            default:
                System.out.println("g");
        }


    }

}
