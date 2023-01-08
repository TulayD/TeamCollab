package tulay;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);

        System.out.println(list);

        for (Integer element : list) {
            int frequency = 0;
            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
                break; //exiting the loop, in order to return the first unique element only
            }
        }
    }
}

/* Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}
			output:
				2

 */