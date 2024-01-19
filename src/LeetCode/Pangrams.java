package LeetCode;

public class Pangrams {
    public static void main(String[] arg) {
        String sentence = "We promptly judged antique ivory buckles for the next prize";
        pangrams(sentence);
    }
    public static void pangrams(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = s.toLowerCase().replace(" ", "");
        char[] charArray=str.toCharArray();
        if(str.contains(alphabet)){
            System.out.println("string is pangram");
        }
        else {
            System.out.println("string is not pangram");
        }

    }
}
