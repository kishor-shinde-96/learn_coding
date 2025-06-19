package String;

public class StringOperations {

    public static int getLength(String str) {

        return str.length();
    }

    public static String toUpperCase(String str) {

        return str.toUpperCase();
    }

    public static String getSubstring(String str, int start, int last) {
        return str.substring(start, last);

    }


    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
       return sb.reverse().toString();
    }


    public static void main(String[] args) {

        String sample = "Hello word";

        System.out.println("Length :" + getLength(sample));

        System.out.println("upperCase :" + toUpperCase(sample));

        System.out.println("substring :" + getSubstring(sample, 1, 5));

        System.out.println("reverseString :" + reverseString(sample));

        

    } 

}