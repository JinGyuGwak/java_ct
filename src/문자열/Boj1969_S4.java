package 문자열;

import java.util.*;
import java.io.*;
public class Boj1969_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int check[][] = new int[m][27];
        String[] array = new String[n];
        for(int i=0;i<n;i++){
            array[i]=br.readLine();
        }
        for(int i=0;i<n;i++){ //dna 수
            for(int j=0;j<m;j++) { //
                check[j][array[i].charAt(j)-'A']+=1;
            }
        }
        StringBuilder result = new StringBuilder();
        int su=0;
        for(int i=0;i<m;i++){
            int ma=0;
            int test=n;
            for(int j=0;j<27;j++){
                if(ma<check[i][j]){
                    result.delete(i,i+1);
                    result.append((char)('A' + j));
                    ma=check[i][j];
                    test=n-check[i][j];
                }
            }
            su+=test;
        }
        System.out.println(result.toString());
        System.out.println(su);

    }
}
