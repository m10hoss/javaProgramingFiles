package Section8;

public abstract class AbstractCars {

    private int privateSpeed;

    public int publicSpeed;

    protected int protectedSpeed;

    int speedLimit = 100;

    public AbstractCars(){
        this(0);
    }
    public AbstractCars (int pSpeed){
        this.privateSpeed = pSpeed;
    }

    public void setPrivateSpeed(int startSpeed){
        this.privateSpeed = startSpeed;
    }

    public abstract void enginStart(String keyType, int numOfCyl);

}
