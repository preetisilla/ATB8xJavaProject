package Sept.Tasks;
import java.util.Scanner;

public class FizzBussClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = sc.nextInt();
        for (int j = 1; j<=i ; j++) {
            if(j%3==0 && j%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(j%3==0)
            {
                System.out.println("Fizz");
            }
            else if(j%5==0)
            {
                System.out.println("Buzz");
            }
        }
    }
}
