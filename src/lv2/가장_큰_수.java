package lv2;
import java.util.*;
public class 가장_큰_수 {
    public static String solution(int[] numbers) {
        List<String> arr = new ArrayList<>();
        String dap = "";
        for(int a :numbers){
            arr.add(Integer.toString(a));
        }
        Collections.sort(arr,(n1,n2) -> (n2+n1).compareTo(n1+n2));
//        Collections.sort(arr, Comparator.reverseOrder());



        for(String a : arr){
            dap+=a;
        }
        if(dap.charAt(0)=='0') return "0";
        return dap;
    }


    public static void main(String[] args){
        System.out.println(가장_큰_수.solution(new int[]{30,21,70}));
    }
}
