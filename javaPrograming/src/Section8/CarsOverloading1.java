package Section8;

// Different number of parameters in argument list

public class CarsOverloading1 {

    // Number of parameters could be different
    // Data type of parameters are different
    // sequence of data type is differnt
    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(8, true);
    }

    public static void increaseSeatHeight (int heightToIncrease){
        System.out.println("Increased seat height by " + heightToIncrease + " inches");
    }

    public static void increaseSeatHeight (int heightToIncrease, boolean rememberHeight){
        System.out.println("Increased seat height by " + heightToIncrease + " inches");
        if (rememberHeight){
            System.out.println("youre selection is saved");
        }else {
            System.out.println("your selection is not saved");
        }
    }
}
