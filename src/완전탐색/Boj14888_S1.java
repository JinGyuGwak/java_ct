package 완전탐색;
import java.util.*;
import java.io.*;
public class Boj14888_S1 {
    static int n;
    static int[] a;
    static int[] su = new int[5];
    static int[] visit;
    static int max_result=-1000000000;
    static int min_result=1000000000;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        visit=new int[n-1];
        a=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=4;i++){
            su[i]=Integer.parseInt(st.nextToken());
        }// su는 각각 +,-,*,/ 임
        sol(0);
        System.out.println(max_result);
        System.out.println(min_result);
    }
    public static void sol(int depth){ //연산자 개수는 n-1개
        if(depth==n-1){
            int hap=a[0];
            for(int i=0;i<n-1;i++){
                switch(visit[i]){
                    case 1: hap=hap+a[i+1]; break;
                    case 2: hap=hap-a[i+1]; break;
                    case 3: hap=hap*a[i+1]; break;
                    case 4: hap=hap/a[i+1]; break;
                }
            }
            max_result=Math.max(max_result,hap);
            min_result=Math.min(min_result,hap);
            return;
        }
        //연산자 순서를 정하자
        for(int i=1;i<=4;i++){
            if(su[i]==0)continue;
            visit[depth]=i;
            su[i]-=1;
            sol(depth+1);
            su[i]+=1;
        }
    }
}
