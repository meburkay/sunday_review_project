package week_08;

public class Task3 {
    /*
     Task 3 :    Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

    			 Input: "  He ll o "
        	     Output: Hello
     */

    public static void main(String[] args) {

        String input="  He ll o ";

     String result= getWordWithOutSpaces(input);
        System.out.println("result = " + result);

    }

    private static String getWordWithOutSpaces(String input) {

        String result="";

        for (char c : input.toCharArray()) {

            if (c==' ') {
                continue;
            }else {
                result+=c;
            }

        }

        return result;
    }
}
