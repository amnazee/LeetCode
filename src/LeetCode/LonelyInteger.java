package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

    public static void main(String[] arg){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        System.out.println(lonelyinteger(integerList));
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int unique=0;
        for(int i=0; i<a.size(); i++){
            int count=0;
            for(int j=0; j<a.size(); j++){
                if(a.get(i).equals(a.get(j))){
                    if(i==j){
                        continue;
                    }
                    else {
                        count++;
                    }
                }
            }
            if(count==0){
                unique=a.get(i);
            }
        }
//        System.out.println(unique);
        return unique;
    }
}
