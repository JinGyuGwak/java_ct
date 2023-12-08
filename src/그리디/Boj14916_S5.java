package 그리디;
import java.util.*;
import java.io.*;
public class Boj14916_S5 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer=0;
        while(n>0){
            if(n%5!=0){
                n-=2;
                answer+=1;
            }
            else {
                answer+=n/5;
                n=0;
            }

        }
        System.out.println(n==0 ? answer : -1);

    }
}
//그리디 특 : 거꾸로 가면서 구하는 경우가 많음