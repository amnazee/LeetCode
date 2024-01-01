package LeetCode;

public class SecondMaxElement {
    public static void main(String[] arg){
        int[] array={33,1,4,5,8,11,4,5,7,99};
        System.out.println(maxAndSecondMax(array));
    }

    static int maxAndSecondMax(int[] array){
        int max=0;
        int secondMax=0;

        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0; i<array.length; i++){
            if(array[i]>secondMax && array[i]<max){
                secondMax=array[i];
            }
        }

        return secondMax;
    }
}
