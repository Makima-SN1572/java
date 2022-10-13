package unit3;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int x : nums) {
            if (x % 2 == 0) {
                System.out.println(x);
                }
            }
        }
    }

