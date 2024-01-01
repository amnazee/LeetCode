package LeetCode;

public class SecondMaxElement {
    public static void main(String[] args) {
        int[] numbers = {14, 5, 25, 10, 45, 20};
//        int[] numbers = {-1,-5,-3,-6,0};
        int[] max = maxAndSecondMax(numbers);
        System.out.println("Maximum value is: "+max[0]);
        System.out.println("Second maximum value is: "+max[1]);
    }
    static int[] maxAndSecondMax(int[] array){
        int max=array[0];
        int secondMax=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return new int[]{
                max,
                secondMax
        };
    }
}