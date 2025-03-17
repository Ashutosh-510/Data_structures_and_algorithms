package Recursion.Basic;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        reverse(nums , 0 , nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums ,int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums , int i , int j){
        if(i > j){
            return;
        }
        swap(nums , i, j);
        reverse(nums , i + 1 , j - 1);
    }
}
