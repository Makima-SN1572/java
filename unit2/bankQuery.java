package unit2;

import java.util.Scanner;

public class bankQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        final float ACCOUNT = 88.88f;
        System.out.printf("用户名为%s，yuEWEI%5.2f",name,ACCOUNT);
    }
}
