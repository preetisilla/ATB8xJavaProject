package Oct.ex_11Oct2024_encapsulation.SuperKeyword;

public class Lab036 {
    public static void main(String[] args) {
        Car car = new Car();


    }
}
    class Vehicle{
        public int maxSpeed = 180;
        Vehicle(){
            System.out.println("DC Vehicle");
        }
        Vehicle(int a){
            System.out.println("PC Vehicle");
        }

        void message(){
            System.out.println("Hello Vehicle");
        }
    }

    class Car extends Vehicle{
        private int maxSpeed = 150;

        void message(){
            System.out.println("Hello Car");
        }

        Car(){
            super(); // Constructor Chaining
            System.out.println("DC Car");
            System.out.println(this.maxSpeed);
            System.out.println(super.maxSpeed);
            this.message();
            super.message();
        }
    }

