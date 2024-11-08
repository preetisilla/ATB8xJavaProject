package Sept.ex_23092024;

public class Lab025 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        char operator = '%';
        switch(operator){
            case '+':
                System.out.println("Result is "+(num1+num2));
                break;
            case '-':
                System.out.println("Result is "+(num1-num2));
                break;
            case '*':
                System.out.println("Result is "+(num1*num2));
                break;
            case '/':
                System.out.println("Result is "+(num1/num2));
                break;
            case '%':
                System.out.println("Result is "+(num1%num2));
                break;
            default:
                System.out.println("No operator");
                break;

        }
    }
}
