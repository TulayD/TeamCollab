package tulay;

public class OddEven {

    public static void main(String[] args) {
        OddAndEven(3);

    }

    public static void OddAndEven(int number) {

        if (number <= 0) {
            System.out.println("Invalid number");
        } else if (number % 2 == 0) {
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }
    }
}
