public class ReverseStringPractice {
    public static void main(String[] args) {
        String string = "this is a test string";

        byte [] strAsByteArray = string.getBytes();

        byte [] result = new byte[strAsByteArray.length];

        for (int i = 0; i <strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }
}
