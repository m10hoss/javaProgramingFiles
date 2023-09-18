package Section9DataStructure;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {

// hashset dose not maintain order
        Set<String> set = new HashSet<String>();

//set adds only unique elements
        set.add("BMW");
        set.add("audi");
        set.add("honda");
        set.add("honda");

        //System.out.println(set);

        for (String item: set){
            System.out.println(item);
        }
//LinkedHashSet - It maintains the order in which the elements are added
        Set<String> lHset = new LinkedHashSet<String>();
        lHset.add("BMW");
        lHset.add("audi");
        lHset.add("honda");
        System.out.println("\nlinked");
        for (String item: lHset){
            System.out.println(item);
        }

//TreeSet - IT maintains the natural sorting 1, 2, 3...alphabetical
        Set<String> tSet = new TreeSet<String>();
        tSet.add("BMW");
        tSet.add("audi");
        tSet.add("honda");
        System.out.println("\nTree");
        for (String item: tSet){
            System.out.println(item);
        }

        List<String> list = new ArrayList<String>();
//list adds any element at all times
        list.add("BMW");
        list.add("audi");
        list.add("honda");
        list.add("honda");

        //System.out.println(list);

    }
}
