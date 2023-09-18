package Section9DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList();

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

        /*
        Array list - { 0, 1, 2, 3 , 4 ,5 ,6}
        linked list - [0] > [1] > [2]
                          <     <
        Array list- When you have to add at the end and remove from the add and get it fast
        Linked list - When you have to add at the beginning and remove from the begining
         */

        List<Integer> lList = new LinkedList<Integer>();
        List<Integer> aList = new ArrayList<Integer>();


    }
}
