package LeetCode;

public class AbsoluteDifference {
// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
public static void main(String[] arg){
    int[][] sqMatrix={{1,2,3},{4,5,6},{9,8,9}};
    int value=AbsoluteDiff(sqMatrix);
    System.out.println("Absolute Difference is: "+value);
}

public static int AbsoluteDiff(int[][] matrix){
    int sum1=0, sum2=0;
    int absoluteDifference;
    for(int i=0; i<matrix.length; i++){
        sum1+=matrix[i][i];
        sum2+=matrix[i][matrix.length-1-i];
    }
    System.out.println("Sum1: "+sum1);
    System.out.println("Sum2: "+sum2);
    absoluteDifference=sum1-sum2;
    return absoluteDifference;
}
}