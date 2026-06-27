package Array;

import java.util.Scanner;

public class LeetCode1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        twoSum(arr,target);
    }
    public static void twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

