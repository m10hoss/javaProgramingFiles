public class SrtingMethods {

    public static void main(String[] args){
        String str = "this is the test string";

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "welcome";
        String str4 = "";
        String str5 = "      spaces all around          ";
        String str6 = "hello";

        System.out.println("Length of the stirng is: " + str.length());
        System.out.println("Character at inded 2 is: " +str.charAt(2));
        System.out.println(str.concat(" this is the appended string"));
        System.out.println("Contians check 1: " +str.contains("is"));
        System.out.println("Contians check 2: " +str.contains("si"));
        System.out.println("Starts with check 1: " +str.startsWith("This"));
        System.out.println("Starts with check 2: " +str.startsWith("That"));
        System.out.println("Ends with check 1: " +str.endsWith("string"));
        System.out.println("Ends with check 2: " +str.endsWith("zzzz"));
        System.out.println("Check contnt are equal: " +str1.equals(str2));
        System.out.println("Check contnt are equal: " +str3.equals(str4));

        System.out.println("index of 'h' is: " + str.indexOf('h'));
        System.out.println("Check if String is empty 1: "+ str.indexOf('q'));
        System.out.println("Check if String is empty 2: "+str4.isEmpty());
        System.out.println("Tring the leading and trailing spaces: "+str5.trim());
        System.out.println("Replace example: "+ str6.replace('e','a'));


        System.out.println("Substring example 1: " + str.substring(5));
        System.out.println("Substring Example 2:" + str.substring(5,10));

        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++){
            System.out.println("Index " + i + " is " + charArray[i]);
        }
        System.out.println("Lower case: " + str.toLowerCase());
        System.out.println("Upper case: " + str.toUpperCase());


    }
}
