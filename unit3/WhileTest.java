package unit3;

public class WhileTest {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <=100){
            sum += i++;
        }
        System.out.println(sum);
        System.out.println("-----------------");
        //do while
        sum = 0;
        i = 1;
        do{
            sum += i++;
        } while (i<=100);
        System.out.println(sum);
        System.out.println("-----------------");
        //for
        sum = 0;
        for (int j = 0; j <= 100; j++) {
            sum += j;
        }
        System.out.println(sum);
        for (int n=1, m=1;n<=5;m=m+n*2,n++){
            System.out.println(m+"");
        }
        System.out.println();
        int m=1;
        for (int j = 0; j  <=5; j++) {
            System.out.println(m+"");
            m=m+j*2;
        }
        System.out.println();
        System.out.println("-----------------");
        //嵌套循环
        for (int j = 1; j <= 9; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(j+"*"+k+"="+j*k+"\t");

            System.out.println();
            
        }
    }
}}
