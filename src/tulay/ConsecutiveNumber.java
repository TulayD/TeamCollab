package tulay;

public class ConsecutiveNumber {
    public static void main(String[] args) {


        int N = 24;
        for (int i = 0; i < N; i++) {
            String str = " ";
            if (i % 2 == 0) {
                str += "Codility";
            }
            if (i % 3 == 0) {
                str += "Test";
            }
            if (i % 5 == 0) {
                str += "Coders";
            }
            if (!(i % 3 == 0) && !(i % 5 == 0) && !(i % 2 == 0)) {
                System.out.println(i);
            }
            System.out.println(str);
        }
    }
}