package Section8.overriding;

/*
rules.
        1. Arguments list: Arguments list in the overriding method should be same as the parent class overridden method
        2. Access modifier: Access modifier of the overriding method cannot be more restrictive then the overridden method
        3. private, static and final methods cannot be overridden as they are local to the class

Advantages

        class can give its own implimentation to the method
        if you have multiple methods and default implemnetations but need more imp. in child class
        so you can over ride the functionality in the base class
 */

public class CarsOverridingChildBMW extends CarsOverridingParent{
    public static void main(String[] args) {
        //dynamic method dispatch
        CarsOverridingParent c1 = new CarsOverridingChildBMW();
        c1.increaseSpeed();
//        CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
        c1.engineStart(2);
    }

    @Override
    public void engineStart(int cyl){
        //invoke immediate parent class constructor
//        super.engineStart(2);
        System.out.println("I am from the child class");
    }
    public static void staticExample() {
        System.out.println("I am the static method from the child class");
    }
}
