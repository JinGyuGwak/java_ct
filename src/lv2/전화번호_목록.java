package lv2;
import java.util.*;
public class 전화번호_목록 { //다시 풀어라
    public static boolean Solution(String[] phone_book){
        HashMap<String, Integer> map = new HashMap<>();
        for(String a : phone_book){
            map.put(a,1);
        }
        for(String pn : phone_book){
            for(int i=1;i<pn.length();i++){
                String prefix = pn.substring(0,i);
                System.out.println(prefix);
                if(map.containsKey(prefix)) return false;
            }
        }


        return true;
    }
    public static void main(String[] args){
        System.out.println(Solution(new String[]{"apeae", "App", "Banana", "ape"}));

    }

}
