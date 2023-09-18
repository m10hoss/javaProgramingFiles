package Section9DataStructure;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        //adding
        cars.add("BMW");
        cars.add("honda");
        cars.add("audi");
        //size
        int size = cars.size();
        System.out.println(size);

        //get
        System.out.println("item on index 2 is: " + cars.get(2));

        //Iterations
        for (int i = 0; i < size; i++){
            System.out.println("idems on index" + i + " is " + cars.get(i));
        }

        //second Iteration
        System.out.println("\nsecond for loop example");
        for (String car : cars){
            System.out.println("the item is:" + car);
        }
        //remove items
        cars.remove(2);
        System.out.println(cars);


    }
}
