package week_09;

import java.util.Arrays;

public class Task4 {


    /*
    Task 4 : Hide Passwords

			        Given an array of passwords (String). Hide each password as a star (*) and show the hidden password

					Ex:

					Input:
					{"one", "hi", "hold}

					Output:
					[ ***, **, **** ]
     */
    public static void main(String[] args) {

        String[] array = {"one", "hi", "hold" };

        String[] result = hideWords(array);
        System.out.println(Arrays.toString(result));

    }

    private static String[] hideWords(String[] array) {
        String[] res = new String[array.length];
        int index = 0;
        for (String each : array) {

            String temp = "";

            for (int i = 0; i < each.length(); i++) {
                temp += "*";
            }

            res[index++] = temp;
          //  res[index++]="*".repeat(each.length());

        }

return res;
    }
}
