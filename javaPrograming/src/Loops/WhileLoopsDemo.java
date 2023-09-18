package Loops;

public class WhileLoopsDemo {
    public static void main(String[] args) {
// in do while loop the step is always executed first, then the condition is checked.
        int i = 10;

        while (i < 20) {
            System.out.println(i);
            i++;
            if (i == 17) {
                continue;
            }
            System.out.println("calue of i: " + i);
        }

        System.out.println("outside loop.......");

        do {
            System.out.println("do while loop....");
            System.out.println(i);
            i++;

        }while(i <20);
    }

}
