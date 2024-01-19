package LeetCode;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] arg){
        int[] array={1,1,3,2,1};
        System.out.println(Arrays.toString(countingSort(array)));
    }
    public static int[] countingSort(int[] arr) {
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] newArray=new int[max+1];
        Arrays.fill(newArray, 0);
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            newArray[index]++;
        }
        int index = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0) {
                for (int j = 0; j < newArray[i]; j++) {
                    arr[index++] = i;  // Store i in arr and increment index
                }
            }
        }
        return arr;
    }
}