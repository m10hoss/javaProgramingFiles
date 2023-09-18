public class
stringDemo {
    public static void main(String args){

        // String Litteral - String Constant Pool
        String str1 = "hello";

        String str3 = "hello";

        // String object -heap
        String str2 = new String("welcome");

        String str4 = new String("welcome");


        //Stirngs
        str1 = "more hello";

        String strad = str1 + str2;

        System.out.println(strad);
    }
}
