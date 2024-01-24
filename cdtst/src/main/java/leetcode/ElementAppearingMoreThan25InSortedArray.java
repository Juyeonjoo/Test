package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25InSortedArray {

    public int findSpecialInteger(int[] arr) {
        int result =0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for(int j = 0; j<arr.length; j++){

               if(arr[i] == arr[j]){
                   sum +=1;
               };
            }
            try{
                map.put(arr[i], sum);
            }catch (Exception e){
                continue;
            }
        }//outer for
        Integer max = Collections.max(map.values());
        if(max>arr.length/4){
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()==max){
                    result = entry.getKey();
               }
        }}
        System.out.println("max = " + max);
        System.out.println("result = " + result);
        return result;
    }//main
}//class