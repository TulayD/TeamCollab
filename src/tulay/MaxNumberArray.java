package tulay;

public class MaxNumberArray {

    public static void main(String[]args){
        int[] nums = {1 ,4 ,7 ,9 ,3 ,56 ,3 };
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
       }
System.out.println(max);
    }
}
/*Write a method that can find the maximum number from an int Array

 */