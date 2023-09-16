package boj_silver;

import java.io.*;
import java.util.*;
//졸라 머저리 문제다 진짜
public class Boj2751_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

}
