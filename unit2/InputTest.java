package unit2;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();//获取一行字符串
        System.out.println(line);
        int i = scanner.nextInt();//获取整数
        float f = scanner.nextFloat();//获取浮点数
        System.out.println(i / f);
        scanner.useDelimiter("\n");//指定根据换行符分割
        line = scanner.next();
        System.out.println(line);

    }
}
