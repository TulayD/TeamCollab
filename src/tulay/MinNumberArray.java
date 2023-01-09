package tulay;

public class MinNumberArray {

    public static void main(String[] args) {

        int[] arr = {9 ,4 ,23 ,6 ,78 ,4 };
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i] ;
            }
        }
        System.out.println(min);
    }
}
