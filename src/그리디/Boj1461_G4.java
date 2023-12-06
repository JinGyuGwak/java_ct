package 그리디;
import java.io.*;
import java.util.*;
public class Boj1461_G4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        List<Integer> dap = new ArrayList<>();
        for(int i=0;i<n;i++){
            int check = Integer.parseInt(st.nextToken());
            if(check>0)positive.add(check);
            else negative.add(check);
        }
        Collections.sort(positive,(n1,n2) -> n2-n1);
        Collections.sort(negative);

        while(!positive.isEmpty()){
            int now = positive.remove(0);
            for(int i=1; i<m;i++){
                if(!positive.isEmpty()){
                    positive.remove(0);
                }
            }
            dap.add(now);
        }
        while(!negative.isEmpty()){
            int now = negative.remove(0);
            for(int i=1; i<m;i++){
                if(!negative.isEmpty()){
                    negative.remove(0);
                }
            }
            dap.add(-now);
        }
        int answer=0;
        Collections.sort(dap,Collections.reverseOrder());
        answer=dap.remove(0);
        while(!dap.isEmpty()){
            answer+=dap.remove(0)*2;
        }
        System.out.println(answer);
    }
}
// -1
// 11 6 5 4 3


// 11 5 3
