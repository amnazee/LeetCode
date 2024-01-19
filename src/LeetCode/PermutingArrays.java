package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingArrays {

    public static void main(String[] arg){
        List<Integer> list1= Arrays.asList(0,1);
        List<Integer> list2= Arrays.asList(0,2);
        System.out.println(twoArrays(1, list1, list2));
    }
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        String result="";
        A.sort(Collections.reverseOrder());

        Collections.sort(B);

        for(int i=0; i<A.size(); i++){
            for(int j=0; j<B.size(); j++){
                if(i==j){
                    if(A.get(i)+B.get(j)>=k){
                        result="Yes";
                        break;
                    }
                }
                else {
                    result="No";
                }
            }
        }
        return result;
    }
}
