package LeetCode;

public class PalindromeString {
    public static void main(String[] arg){
        String palindrome="abba";
        System.out.println(solution(palindrome));
    }
    static boolean solution(String inputString) {
        int left = 0, right = inputString.length() - 1;

        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
        }
        return true;
    }
}