package tulay;

public class RemoveDuplicate {

    public static void main(String[] args) {

    String str = "AAABBBCCC"; // remove the duplicate
    String result = "";

        for (int i = 0; i < str.length() - 1; i++) {

        if (!result.contains("" + str.charAt(i)))
            result += "" + str.charAt(i);
    }
        System.out.println(result);
}
}

