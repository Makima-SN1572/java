package unit2;

import java.sql.SQLOutput;

public class Typetest {
    public static void main(String[] args) {
        // 整数
        int i2 = 0b10; //  2
        int i8 = 010;  //  8
        int i10 = 10;
        int i16 = 0x10; //16
        //具体整数类型
        byte b = 10;
        // sout

        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        short s = 10;
        System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        int i = 10;
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        long l = 10;
        System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);

        //特性
        int divisor = 100;
        int divided = 3;
        System.out.println(divisor / divided);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        // 浮点数
        float f = 10.01f;
        double d = 10.04;
        System.out.println(Float.MIN_VALUE + "~" + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + "~" + Double.MAX_VALUE);
        double d_noemal = 31415926;
        double d_science = 3.1415926e7;
        System.out.println(d_noemal);
        System.out.println(d_science);
        System.out.println(d_noemal == d_science);

        double r = 3.2;
        System.out.println(r * r);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        // 字符
        char c = 'c';
        i = c;
        System.out.println(c);
        System.out.println(i);
        System.out.println((int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);

        //布尔
        boolean bo = true;




    }
}
