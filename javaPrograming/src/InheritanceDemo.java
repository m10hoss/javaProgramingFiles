import Section8.BMW;
import Section8.Cars;

public class InheritanceDemo {
    public static void main(String[] args) {
        int speed = 0;

        Cars c1 = new Cars(speed);
        c1.increaseSpeed();
        c1.publicSpeed = 10;




        BMW bmw1 = new BMW(speed);
        bmw1.increaseSpeed();
        bmw1.headupDisplayNavigation();

    }
}
