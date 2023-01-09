package tulay;

public class ReverseMyName {

    public static void main(String[]args){

        String name = " Tulay";
        String reverse ="";

        for (int i = name.length()-1; i>=0 ; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);


    }
}
