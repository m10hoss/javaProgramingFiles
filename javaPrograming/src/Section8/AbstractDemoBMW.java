package Section8;

public class AbstractDemoBMW extends AbstractCars {

    public void setPrivateSpeed(int speed){
        super.setPrivateSpeed(10);
    }

    @Override
    public void enginStart(String keyType, int numOfCyl) {
        System.out.println("This is the BMW engine start");

    }

//    public void engineStart() {
//        super.enginStart();
//        System.out.println("BMWs have keyless engine start");
//    }

}
