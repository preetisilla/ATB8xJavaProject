package Sept.Tasks;

import java.util.Scanner;

public class TriangularClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1:");
        double side1 = sc.nextDouble();

        System.out.println("Enter the side2:");
        double side2 = sc.nextDouble();

        System.out.println("Enter the side3:");
        double side3 = sc.nextDouble();

        if(side1>0 && side2>0 && side3>0) {
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("Equilateral");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Iscolese");
            } else {
                System.out.println("scalene");
            }
        }
    }
}
