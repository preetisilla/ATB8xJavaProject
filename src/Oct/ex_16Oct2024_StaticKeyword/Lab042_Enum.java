package Oct.ex_16Oct2024_StaticKeyword;

public class Lab042_Enum {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());
        if(Color.GREEN.getHexcode() == "#61FF33")
            System.out.println("Color is green");
    }

}
enum Color{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

   private Color(String hexcode) {
        this.hexcode = hexcode;
    }
    public String getHexcode(){
       return hexcode;
    }
}
