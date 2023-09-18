package Section8;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

    @Override
    public void engineStart(String engineType, boolean isKeyless) {
        System.out.println("this is the implementation");
    }
    @Override
    public void headsUpNavagiation(){
        System.out.println("this is the headsup Navigation");
    }
}
