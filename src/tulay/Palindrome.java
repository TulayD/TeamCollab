package tulay;

public class Palindrome {

    public static void main(String[] args) {

        String str1 = "kayak";
        String str2 = "";

        for (int i = str1.length()-1; i >= 0; i--) {
            str2 += str1.charAt(i);

            if (str1.equalsIgnoreCase(str2)) {
                System.out.println(str1 + " is a palindrome");
            } else {
                System.err.println(str1 + " is NOT a palindrome!" );
            }

        }

    }
}
/*
Given any String determine if it is Palindrome. Print“Palindrome” if it is and “Not Palindrome” if
it is not
 */