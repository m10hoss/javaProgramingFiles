import java.util.ArrayList;

public class ForLoops {
    public static void main(String[] args) {
        int a[] = {16, 19, 11, 15, 10, 12, 14};

        for(int j = 0; j<a.length; j++)
        {
            //initially swapped is false
            boolean swapped = false;
            int i = 0;
            while(i<7-1)
            {
                //comparing the adjacent elements
                if (a[i] > a[i+1])
                {
                    //swapping
                    int num = a[i];
                    a[i] = a[i+1];
                    a[i+1] = num;
                    //Changing the value of swapped
                    swapped = true;
                }
                i++;
            }
            //if swapped is false then the array is sorted
            //we can stop the loop
            if (!swapped)
                break;
        }

        for(int x : a)
        {
            System.out.println(x);
        }

    }


        ArrayList<Integer> age = new ArrayList<Integer>();

        age.add(4);
        age.add(15);
        age.add(17);
        age.add(10);
//        int number = age.size();

//        for (Integer numer : age){
//            System.out.println(number);
//        }

        //iteration
        for(int i = 0; i < age.size(); i++){
            if (age.get(i) > 10){
                System.out.println("youre too old");
            }else {
                System.out.println("youre in");
            }
        }

    }

}

