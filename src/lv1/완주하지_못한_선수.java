package lv1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {

    public static String Solution(String[] participant, String[] competition){
        Map<String,Integer> map = new HashMap<>();
        String dap ="";
        for(String a : participant){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(String a : competition){
            if(map.get(a)>1){
                map.put(a,map.get(a)-1);
            }
            else map.remove(a);
        }
        for(String key : map.keySet()){
            dap=key;
        }

        return dap;
    }

    public static void main(String[] args){
        System.out.println(Solution(new String[]{"leo", "kiki", "eden"},new String[]{"leo","eden"}));
    }
}
