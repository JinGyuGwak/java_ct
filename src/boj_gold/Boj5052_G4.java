package boj_gold;
import java.util.*;
import java.io.*;
public class Boj5052_G4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t;i++){
            int n = Integer.parseInt(br.readLine());
            List<String> a = new ArrayList<>();
            for(int j=0;j<n;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                a.add(st.nextToken());
            }
            Collections.sort(a);
            String dap="YES";
            for(int j=0;j<a.size()-1;j++){
                int check = a.get(j).length();
                if(a.get(j+1).length()>=check && a.get(j).equals(a.get(j+1).substring(0,check))){
                    dap="NO";
                    break;
                }
            }
            System.out.println(dap);
        }

    }
}
