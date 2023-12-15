package variable;

import java.util.*;

public class Var3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        //MAP으로 저장
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String s="IVX";
        List<String> arrayList = new ArrayList<String>(Arrays.asList(s.split("")));

        int sum = 0;
        for (int i = 0; i<arrayList.size(); i++){

            if(!(i==arrayList.size()-1)) {
                String firstStr = arrayList.get(i);
                String sndStr = arrayList.get(i+1); //여기서 에러남
                if ((firstStr.equals("I") && sndStr.equals("V")) || (firstStr.equals("I") && sndStr.equals("X")) || (firstStr.equals("X") && sndStr.equals("L")) || (firstStr.equals("X") && sndStr.equals("C"))|| (firstStr.equals("C") && sndStr.equals("D")) || (firstStr.equals("C") && sndStr.equals("M"))) {
                    int minus = map.get(sndStr) - map.get(firstStr);
                    sum += minus;
                    i++;
                } else {
                    System.out.println(firstStr);
                    sum += map.get(firstStr);
                }
            }else{
                String firstStr = arrayList.get(i);
                System.out.println(firstStr);
                sum += map.get(firstStr);
            }

        }

        System.out.println(sum);

    }//main
}//class
