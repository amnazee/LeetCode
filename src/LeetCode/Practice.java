package LeetCode;

public class Practice {
    public static void main(String[] arg){
        int[][] array={{11,2,4},{4,5,6},{10,8,-12}};
        int diff=diagonalDifference(array);
        System.out.println(diff);
    }
    public static int diagonalDifference(int[][] arr) {
        int primarySum=0;
        int secondarySum=0;
//        for(int i=0; i<arr.length; i++)
//        {
//            primarySum+=arr[i][i];
//        }

        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<arr.length; j++){
                if(i + j ==arr.length - 1){
                    secondarySum+=arr[i][j];
                }
                if(i==j){
                    primarySum+=arr[i][j];
                }
            }
        }
        int difference=Math.abs(primarySum-secondarySum);
//        int difference=primarySum-secondarySum;
        return difference;
    }
}
