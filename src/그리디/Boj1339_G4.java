package 그리디;
import java.io.*;
import java.util.*;
public class Boj1339_G4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] visit = new int[26];

        for(int i=0;i<n;i++){
            arr[i]=br.readLine();
        }
        for(int i=0;i<n;i++){
            int c=arr[i].length()-1; //2
            int now=0;
            while(c!=-1){ //arr[i] == GCF
                visit[arr[i].charAt(now)-'A']+=Math.pow(10,c);
                c-=1;
                now+=1;
            }
        }
        Arrays.sort(visit);
        int answer=0;
        int temp=9;
        for(int i=visit.length-1 ; i>=0;i--){
            answer+=visit[i]*temp;
            temp-=1;
        }
        System.out.println(answer);



    }

}

