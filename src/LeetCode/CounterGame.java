package LeetCode;

public class CounterGame {

    public static void main(String[] arg){
        long num=6;
        counterGame(num);
    }

    public static void counterGame(long n) {
        boolean isPowOfTwo=true;
        while(n>1){
            if(n%2!=0)
                isPowOfTwo = false;
            n=n/2;
        }
        if(isPowOfTwo){
            System.out.println("Pow of 2");
            n=n/2;
        }
        else {
            System.out.println("Not pow of 2");
        }
    }
}
