package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] arg){
        List<String> strings=new ArrayList<>();
        strings.add("ab'");
        strings.add("ab'");
        strings.add("abc'");
        List<String> queries=new ArrayList<>();
        queries.add("ab'");
        queries.add("abc'");
        queries.add("bc'");
//        matchingStrings(strings,queries);
        System.out.println(matchingStrings(strings,queries));
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

//        int[] newArr=new int[queries.size()];
        List<Integer> newArr=new ArrayList<>();
        for(int i=0; i<queries.size(); i++){
            int count=0;
            for(int j=0; j<strings.size(); j++){
                if(strings.get(j).equals(queries.get(i))){
                    count++;
                }
            }
            newArr.add(count);
        }
//        for (int i=0; i<newArr.size()-1; i++){
//            System.out.print(newArr.get(i));
//        }
        return newArr;
    }
}