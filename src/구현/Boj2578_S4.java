package 구현;
import java.io.*;
import java.util.*;
public class Boj2578_S4 {
    static int[][] my;
    static int[][] list;

    static int[][] dap;
    static int[][] dap1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        my = new int[5][5];
        list = new int[5][5];
        dap = new int[5][5];
        dap1= new int[5][5];
        int count=0;
        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                my[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                list[i][j] = Integer.parseInt(st.nextToken());
                circle(list[i][j]);
                count+=1;
                if(count>=15 && bingo()){
                    System.out.println(count);
                    break;
                }
            }
        }
    }
    public static void circle(int check){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(my[i][j]==check){
                    dap[i][j]=1;
                    dap1[j][i]=1;
                    return;
                }
            }
        }
    }
    public static boolean bingo(){
        //12
        int result=0;
        for(int i=0;i<5;i++){
            if (Arrays.toString(dap[i]).equals("[1, 1, 1, 1, 1]")){
                result+=1;
            }
            if(result >= 3) return true;
            if(Arrays.toString(dap1[i]).equals("[1, 1, 1, 1, 1]")){
                result+=1;
            }
            if(result >= 3) return true;
        }

        return false;

    }


}
// 25*25
//
