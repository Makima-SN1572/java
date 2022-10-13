package unit3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //二維數組
        //初始化
        int[][] e = new int[2][2];
        System.out.println(e[0][0]);
        e[0][0]=101;
        e[0][1]=102;
        int[][] f = {{101,102},{0,0}};
        System.out.println(Arrays.toString(e[0]));
        System.out.println(Arrays.toString(f[0]));
        //修改
        e[1][0] = 201;
        e[1][1] = 202;
        f[1] = new int[]{201,202};
        //遍历
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                System.out.print(e[i][j]+"--");
            }
        System.out.println();
        }
        for (int[] x : e){//查询
            for (int y : x){
                System.out.println(y + " ");
            }
            System.out.println();
        }
        //矩阵转置
        //123
        //456
        int[][] origin = {{1,2,3},{4,5,6}};
        //1 4
        //2 5
        //3 6
        int[][] target = new int[3][2];
        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < origin[i].length; j++) {
                target[j][i] = origin[i][j];
            }


        }
        for (int[] x :origin){
            System.out.println(Arrays.toString(x));
        }
        for (int[] x:target){
            System.out.println(Arrays.toString(x));
        }


        }


    }


