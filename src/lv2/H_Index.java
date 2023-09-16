package lv2;

import java.util.*;

public class H_Index {
    public static int solution(int[] arr) {
        int answer = 0;
        int dap=0;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {
            int h=arr.length-i;
            if(arr[i]>=h){
                dap=h;
                break;
            }
        }
        return dap;
    }

    public static void main(String[] args){
        System.out.println(H_Index.solution(new int[]{1,3,35,36,37,38}));

    }
}
