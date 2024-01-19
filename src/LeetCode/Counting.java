package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Counting {
    public static void main(String[] args)
    {
//        List<Integer> arr = new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println("Original list: " + arr);
        arr = countingSort(arr);
        System.out.println("Sorted list: " + arr);
    }
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] newArray=new int[100];
        Arrays.fill(newArray, 0);

        for (int i = 0; i < arr.size(); i++) {
            int index = arr.get(i);
            newArray[index]++;
        }

        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]);
        }
//        List<Integer> result = new ArrayList<>();
//        int index = 0;
//        for (int i = 0; i < newArray.length; i++) {
//            if (newArray[i]> 0) {
//                for (int j = 0; j < newArray[i]; j++) {
//                    result.set(index++, i);
//                }
//            }
//        }
        return arr;
    }
}