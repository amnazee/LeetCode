package LeetCode;

public class FlippingBits {
    public static void main(String[] arg) {
        long n=9;
//        flippingBits(n);
        System.out.println(flippingBits(n));
    }
    public static long flippingBits(long n){
        int[] binaryNum=new int[32];
        int i=0;
        while(n>0){
            binaryNum[i]= (int) (n%2);
            n=n/2;
            i++;
        }
        for(int k=31; k>=0; k--){
            System.out.print(binaryNum[k]);
        }
        for(int k=0; k<32; k++){
            if(binaryNum[k]==0){
                binaryNum[k]=1;
            }
            else {
                binaryNum[k]=0;
            }
        }
        System.out.println();
        for(int k=0; k<32; k++){
            System.out.print(binaryNum[k]);
        }
//        for(int k=31; k>=0; k--){
//            System.out.print(binaryNum[k]);
//        }
        long answer = 0;
        int power = 0;
        for (int count = 0; count <binaryNum.length; count++) {
            if (binaryNum[count] == 1) {
                answer += (long) Math.pow(2, power);
            }
            power++; // Increment power after using it in the calculation
        }
        System.out.println();
        System.out.println(answer);
        return answer;
    }
}