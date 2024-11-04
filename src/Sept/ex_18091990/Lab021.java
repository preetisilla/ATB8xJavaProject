package Sept.ex_18091990;

public class Lab021 {
    public static void main(String[] args) {
        //Type Casting
        //Widening
        byte a = 10;
        int b = a; // implicit widening

        float c = (float)b; // explicit widening

        // Narrowing
        int mrp = 100;
        float gst = 18.45f;

        //int total_price = mrp+gst; // implicit narrowing

        int total_price = mrp+(int)gst; // explicit narrowing
    }
}
