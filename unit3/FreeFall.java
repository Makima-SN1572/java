package unit3;

import java.util.Scanner;

public class FreeFall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int height = 10000;
        for (int i = 0; i < num; i++) {
            height = height/2;
            if(height==0){
                System.out.println("第"+(i+1)+"次后，球落地");
                break;

            }

        }
        System.out.println(height);
    }
}
