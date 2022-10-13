package unit3;

import java.util.Scanner;

public class Rant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();

        }
        //升序
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int c = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = c;

                }
            }
        }
        for (int num:
             nums) {
            System.out.print(num);
        }
    }
}
