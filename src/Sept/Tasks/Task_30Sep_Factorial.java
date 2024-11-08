package Sept.Tasks;

public class Task_30Sep_Factorial {
    public static void main(String[] args) {
        int fac = 5;
        for (int i = fac-1; i >0 ; i--) {
            fac = fac*i;

        }
        System.out.println("factorial is "+ fac);
    }
}
