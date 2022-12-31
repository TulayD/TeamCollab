package ali;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + b; //a=25
        b = a - b; //b=10
        a = a - b; //a=15

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
/*
    Write a program that swap variables x & y values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20
 */