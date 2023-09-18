package boj_gold;
import java.util.*;
import java.io.*;

public class Boj1744_G4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            int input = Integer.parseInt(br.readLine());
            if(input>0) a.add(input);
            else b.add(input);
        }
        Collections.sort(a);
        Collections.sort(b,(o1,o2) -> o2-o1);
        int hap=0;
        hap+=solveA(a);
        hap+=solveB(b);
        System.out.println(hap);
    }
    public static int solveA(List<Integer> a){
        int i = a.size()-1;
        int result=0;
        while(i>=0){
            if(i==0){
                result+=a.get(i);
                break;
            }
            else if(a.get(i)==1 || a.get(i-1)==1){
                result+=a.get(i);
                i-=1;
            }
            else {
                result+=a.get(i)*a.get(i-1);
                i-=2;
            }
        }
        return result;
    }

    public static int solveB(List<Integer> b){
        int i = b.size()-1;
        int hap=0;
        while(i>=0){
            if(i==0){
                hap+=b.get(i);
                break;
            }
            else if(b.get(i)*b.get(i-1)>=0){
                hap+=b.get(i)*b.get(i-1);
                i-=2;
            } else {
                hap+=b.get(i);
                i-=1;
            }
        }

        return hap;
    }
}
