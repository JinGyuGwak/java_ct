package lv2;
import java.util.*;
public class 전화번호_목록 { //다시 풀어라
    public static boolean Solution(String[] phone_book){
        Map<String ,Integer> map = new HashMap<>();
        for(String a : phone_book){
            map.put(a,1);
        }
        for(String a : phone_book){
            for(int i=1;i<a.length();i++){
                String substring = a.substring(0, i);
                if(map.containsKey(substring)){
                    System.out.println(substring);
                    return false;

                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(Solution(new String[]{"123", "456", "789"}));

    }

}
