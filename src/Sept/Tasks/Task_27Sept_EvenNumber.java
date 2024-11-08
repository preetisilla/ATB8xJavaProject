package Sept.Tasks;

public class Task_27Sept_EvenNumber {
    public static void main(String[] args) {
        //first 5 even number
        int count = 0;
        int i = 1;
        do{
            if (i%2 == 0)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }while(count<5);
    }
}
