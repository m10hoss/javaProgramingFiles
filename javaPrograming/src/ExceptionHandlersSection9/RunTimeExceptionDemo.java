package ExceptionHandlersSection9;

public class RunTimeExceptionDemo {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        int c;
//
//        c = a / b;
//        System.out.println("the resualt is " + c);
//
//        try {
//        }
//        catch (ArithmeticException e) {
//        System.out.println(e.getMessage());
//        }

        int [] numbers = {1, 2, 3};
            try{
        for (int i = 0; i <= 3; i++) {
            System.out.println(numbers[i]);
            }
        }catch (Exception e){
                System.out.println("thre is no index avaliable after 2");
                System.out.println(e.getMessage());
            }
    }

}
