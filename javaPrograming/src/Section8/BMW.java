package Section8;

import java.util.Stack;

public class BMW extends Cars {
    public BMW (int startSpeed) {
        super(startSpeed);
    }

    @Override
    public void increaseSpeed() {
        protectedSpeed++;
        Cars c1 = new Cars();
        c1.decreaseSpeed();
        System.out.println("Increasing speed of BMW");
    }

    public void headupDisplayNavigation(){
        System.out.println("BMW specific functionality");
    }
    public void stop(){
        Cars c1 = new Cars();
        c1.decreaseSpeed();
        
    }
}