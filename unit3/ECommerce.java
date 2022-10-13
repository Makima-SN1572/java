package unit3;

import java.util.Scanner;

public class ECommerce {
    static final String[] MENUS = {
            "查询所有商品",
            "根据商品编号查询图书",
            "购买图书",
            "取消购买",
            "查询购买情况",
            "推出系统"
    };
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("-------------商品管理系统---------");
            for (int i = 0; i < MENUS.length; i++) {
                System.out.println((i +1)+ "." + MENUS[i]);
            }
            System.out.println("------------------------------------");
            System.out.println("请选择(1-"+MENUS.length+")");
            //输入
            int value = scanner.nextInt();
            if (value<1 || value >MENUS.length){
                //格式错误
                System.out.println("您的选择不正确");
                continue;
            }
            String str = "你选择了: %s业务\r\n";
            System.out.printf(str,MENUS[value - 1]);
            if (value==MENUS.length){
                break;
            }

        }
    }
}
