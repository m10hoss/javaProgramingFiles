package Section8;
/*
Sequence of data type of arguments
 */

public class CarsOverloading3 {
    public static void main(String[] args) {
        increaseSeatHeight("8",8);
        increaseSeatHeight(2,"2");
    }

    public static void increaseSeatHeight (String variables1, int variable2){
        System.out.println("I am the 1st overload.");
    }

    public static void increaseSeatHeight (int variables2, String variable1){
        System.out.println("I am the 2nd overload.");
    }
}
