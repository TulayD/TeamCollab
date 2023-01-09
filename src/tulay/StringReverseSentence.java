package tulay;

public class StringReverseSentence {

    public static void main(String[] args) {

        String sentence = "Hadi bakalim bu cumleyi cevir!";
        String reversedSentence = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversedSentence += "" + sentence + "";
        }
        System.out.println(reversedSentence);
    }
}