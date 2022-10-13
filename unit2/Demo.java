package unit2;

public class Demo {
    public static void main(String[] args) {
        int increase = 0;
        System.out.println(increase++);
        System.out.println(++increase);
        System.out.println(10 >= 0);
        System.out.println("aa" == "aa");

        //位运算
        int i = 3;//0011
        System.out.println(i >> 1);//0001

        System.out.println(i << 1); //0110
        int j = 4;//0100
        System.out.println(i & j);//0000
        System.out.println(i | j);//0111
        System.out.println(i ^ j);//0111
        System.out.println(~i);//1100
        //条件运算
        int aa = 70;
        String ab = aa >= 60 ? "ok" : "not ok";
        System.out.println(ab);
        //ctrl+alt+L

        System.out.println(3 + -4);
    }
}
