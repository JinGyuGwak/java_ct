package boj_bronze;

import java.util.*;
import java.io.*;
public class Boj2798_B2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int dap = 0;
        st =  new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }


        Collections.sort(list);
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(list.get(i)+list.get(j)+list.get(k)>m) break;
                    else if(list.get(i)+list.get(j)+list.get(k)>dap){
                        dap=list.get(i)+list.get(j)+list.get(k);
                    }
                }
            }
        }
        System.out.println(dap);
    }

}
