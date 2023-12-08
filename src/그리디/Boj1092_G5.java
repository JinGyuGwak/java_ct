package 그리디;
import java.io.*;
import java.util.*;
public class Boj1092_G5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> weight = new ArrayList<>();
        List<Integer> limit = new ArrayList<>();
        for(int i=0;i<n;i++){
            limit.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            weight.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(limit,(n1,n2)->n2-n1);
        Collections.sort(weight,(n1,n2)->n2-n1);

        if(limit.get(0)<weight.get(0)){
            System.out.println(-1);
            return;
        }
        int answer=0;
        int now=0;
        // 9 2 2      : limit
        // 9 9 9 9 9  : weight
        while(!weight.isEmpty()){
            for(int i=0;i<limit.size();i++){
                while(now<weight.size()){ // now=0
                    if(limit.get(i)>=weight.get(now)){ //9 8 6
                        weight.remove(now); //7 5
                        break;
                    } else now+=1; // now=2
                }
            }
            answer+=1;
            now=0;

        }
        System.out.println(answer);
    }
}
