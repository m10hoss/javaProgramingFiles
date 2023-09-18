package staticPackage;

public class StatickeynotesDemo {

    //Static method cannot use the non-static variable or method directly
    // This and super cannot be used in static context

    public int addNumb = 10;
    public static int addnumStatic = 10;

    public static void main(String[] args) {
        StatickeynotesDemo s1 = new StatickeynotesDemo();
        int output = s1.sum(20);
        int staticOutput = sumStatic(10);
        System.out.println("The output is: " + output);
        System.out.println("The output is: " + staticOutput);
    }
    public int sum(int num ){
        return num + addNumb;
    }
    public static int sumStatic(int num ){
        return num + addnumStatic;
    }

}
