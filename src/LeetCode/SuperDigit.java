package LeetCode;

public class SuperDigit {

    public static void main(String[] arg){
        superDigit("148", 3);
    }

    public static void superDigit(String n, int k) {
        int sum=0;
        String superDigit="";
        for(int i=0; i<k; i++){
            superDigit+=n;
        }
        System.out.println(superDigit.length());
        for(int i=0; i<superDigit.length(); i++) {
            sum = sum + Character.getNumericValue(superDigit.charAt(i));
        }
        superDigit= String.valueOf(sum);
        System.out.println(superDigit);
        k=superDigit.length();
        System.out.println(k);
//        while(superDigit.length()>1){
//            superDigit(superDigit,k);
//        }
    }
}
