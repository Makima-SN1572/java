package unit2.part1;

import java.sql.SQLOutput;

public class BlockTest {
    public static void main(String[] args) {
        System.out.println("普通代码块");
        new BlockTest();

    }
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态代码块");  //静态代码块先运行
    }

}
