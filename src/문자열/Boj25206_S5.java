package 문자열;
import java.util.*;
import java.io.*;
public class Boj25206_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result=0;
        double hap=0;
        String grade;

        double jumsu=2.4;
        double hakjum;


        int c=0;
        int countP=0;
        while(c<20){
            c+=1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            jumsu=Double.parseDouble(st.nextToken()); //점수 3.0
            hakjum=func(st.nextToken()); // 학점 A+ 단 ,학점 P면 계산에서 제외해야함

            if(hakjum != -1){
                hap+=jumsu;
                result=result+(hakjum*jumsu);
            } else {
                countP+=1;
            }
        }
        System.out.println(result/hap);
    }
    public static double func(String a){ //A+
        switch(a){
            case "A+" :
                return 4.5;
            case "A0" :
                return 4.0;
            case "B+" :
                return 3.5;
            case "B0" :
                return 3.0;
            case "C+" :
                return 2.5;
            case "C0" :
                return 2.0;
            case "D+" :
                return 1.5;
            case "D0" :
                return 1.0;
            case "F" :
                return 0;
        }
        return -1;

    }
}
