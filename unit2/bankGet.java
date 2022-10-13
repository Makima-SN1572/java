package unit2;

import java.util.Scanner;

public class bankGet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        input = input < 0 ? 0: input;
        float account = 88.88f;
        input = input > account ? account : input;
        System.out.println("提取之"+ input);
        System.out.println("yu"+(account-input));

    }
}
