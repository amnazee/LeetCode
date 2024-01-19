package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] arg){
        int d=4;
        int m=2;
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        birthday(list,d,m);
    }
    public static void birthday(List<Integer> s, int d, int m) {
        int counter=0;

        for(int i=0; i<s.size()-m-1; i++){
            int sum=0;
           for(int j=i; j<=i+m-1; j++){
               sum+=s.get(j);
//               System.out.println("j:"+j);
           }
           if(sum==d){
               counter++;
           }
            System.out.println("i:" +i);
//            System.out.println(sum);
        }
        System.out.println(counter);
    }
}