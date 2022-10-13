package unit2.part1;

public class ConverTest {
    public static void main(String[] args) {
        //自动转换
        int i = 100;
        float f = 2.5f;
        System.out.println(i / f);
        i = 'a';
        System.out.println(i);
        // 强制转换
        char c = (char) (i +1);
        System.out.println(c);

    }
}
