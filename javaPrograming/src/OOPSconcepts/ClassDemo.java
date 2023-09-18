package OOPSconcepts;

public class ClassDemo {
    public static void main(String[] args) {
        Car bmw = new Car(); // create and nitalize the object
        bmw.setMake("BMW");
        System.out.println(bmw.getMake());

        Car benz = new Car();
        benz.setMake("Benz");
        System.out.println(benz.getMake());

        benz.setModel("c300");
        System.out.println(benz.getModel());

        benz.setYear(1800);
        System.out.println(benz.getYear());
    }
}
