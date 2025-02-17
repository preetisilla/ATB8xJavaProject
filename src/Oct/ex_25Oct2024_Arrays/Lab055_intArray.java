package Oct.ex_25Oct2024_Arrays;

import java.util.Arrays;

public class Lab055_intArray {
    public static void main(String[] args) {
        //Marks 10th -> 51, 100, 91, 87, 90
        int[] marks = {51,100,91,87,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);
       // System.out.println(marks[5]); /ArrayIndexOutOfBoundsException

        int[] marks2 = new int[5];
        // 5 is length
        marks2[0] = 11;
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;
        System.out.println(marks2[4]);
        //System.out.println(marks2[5]); //ArrayIndexOutOfBoundsException

        Arrays.sort(marks);
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        Arrays.sort(marks2);
        System.out.println(Arrays.binarySearch(marks2,15));
    }
}
