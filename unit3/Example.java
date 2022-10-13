package unit3;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }
        //统计分布
        int countA = 0, countB = 0, countC =0,countD =0,countE =0;
        for (int score:
             scores) {
            if (score >=90){
                countA++;
            } else if (score >=80) {
                countB++;
            } else if (score>=70) {
                countC++;

            } else if (score>=60) {
                countD++;
            }else {
                countE++;
            }
        }
        System.out.println(countA +"--"+countB + "--"+countC+"--"+countD+"--"+countE);
        //降序
        for (int i = 0; i < scores.length-1; i++) {
            for (int j = 0; j < scores.length-1-i; j++) {
                if(scores[j]<scores[j+1]){
                    int c = scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=c;
                }
            }
        }
        System.out.println(Arrays.toString(scores));
    }
}
