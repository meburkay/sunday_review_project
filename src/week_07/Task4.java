package week_07;

public class Task4 {
    /*
    Task 4 :  For Each - Nested For

            Longest Palindrome

             Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic", "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                    Output: No palindrome
     */

    public static void main(String[] args) {
                       //0123
        String[] array={"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longest="";
        for (String s : array) {


            // We need to check the word is palindrome or not
            boolean isPalindrome=true;

            for (int i = 0; i < s.length()/2; i++) {
                char letterFromBeginning=s.charAt(i);    //0 1
                char letterFromLast=s.charAt(s.length()-1-i); //3 2

                if (letterFromBeginning!=letterFromLast){
                    isPalindrome=false;
                    break;
                }

            }



           //we eed to find the longest palindrome

            if (isPalindrome && s.length()>longest.length()){
                longest=s;
            }
        }

        String result = longest.isEmpty() ? "There is no palindrome" : longest;

        System.out.println(result);
    }
}
