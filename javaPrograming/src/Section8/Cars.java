package Section8;

public class Cars  {

    //no Modifier - accessible in the same package
    int speed;

    // only in class
    private int privateSpeed;

    // Anywhere in Java World with importing package and class
    public int publicSpeed;

    // In some package and in sub classes
    protected int protectedSpeed;

    int speedLimit = 100;

    public Cars(){
        this(0);
    }
    public Cars(int startSpeed){
        this.privateSpeed = startSpeed;
    }

    public void setPrivateSpeed(int pSpeed){
        this.privateSpeed = pSpeed;
    }

    public void increaseSpeed(){
        if (speed <100) {
            speed++;
        }
        System.out.println("Increasing Speed of cars");
    }
    protected void decreaseSpeed(){
        speed--;
        System.out.println("Decreasing Speed of cars");
    }
}
