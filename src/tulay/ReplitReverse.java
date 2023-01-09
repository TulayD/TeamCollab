package tulay;

import java.util.Scanner;

public class ReplitReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }

    public static String reverse(String name){
        String str = "hello";
        String reverse="";

        for(int i = str.length()-1; i>=0 ; i--){
            reverse += str.charAt(i);
        }
        return reverse;

    }
}
