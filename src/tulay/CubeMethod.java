package tulay;

public class CubeMethod {
    public static void main(String[] args) {

        displayCube(5);

    }

    public static void displayCube(int num){

        int cube = num * num *num;
        System.out.println("Cube of " + num + " is " + cube );
    }
}
