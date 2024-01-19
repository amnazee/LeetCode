package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Socks {

    public static void main(String[] arg){
        List<Integer> arr = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        System.out.println(sockMerchant(9,arr));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pair=0;
        int[] mark= new int[n];
        for(int i=0; i<mark.length; i++){
            mark[i]=0;
        }

        for(int i=0; i<ar.size()-1 ; i++){
            for(int j=i+1; j<ar.size(); j++){
                if(ar.get(i)==ar.get(j) && (mark[i]!=1 && mark[j]!=1))
                {
                    mark[i]=1;
                    mark[j]=1;
                    pair++;
                }
            }
        }
        for(int i=0; i<mark.length; i++){
            System.out.print(mark[i] + " ");
        }
        System.out.println();
        return pair;
    }
}
