package 문자열;
import java.io.*;
import java.util.*;
public class Boj5430_G5 {
    static String p;
    static int n;
    static String array;
    static List<Integer> a = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T;i++) {
            p = br.readLine(); //RDD
            n = Integer.parseInt(br.readLine()); //4
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            for(int j=0;j<n;j++){
                a.add(Integer.parseInt(st.nextToken()));
            }
            System.out.println(solve());
            a= new ArrayList<>();
        }
    }
    public static String solve(){
        boolean way=true;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='R'){
                way=!way;
//                Collections.reverse(a);
            }
            else if(p.charAt(i)=='D'){ //true , //false
                if(a.isEmpty()) return "error";
                if(way){
                    a.remove(0);
                }
                if(!way){
                    a.remove(a.size()-1);
                }
            }
            else return "error";
        }
        if(!way) Collections.reverse(a);
        return convertor(a);
    }
    public static String convertor(List<Integer> ar){ // 2,1 이 왔어
        if(ar.size()==0) return "[]";
        StringBuilder dap = new StringBuilder("[");
        for(int i=0;i<ar.size()-1;i++){
            dap.append(Integer.toString(ar.get(i)));
            dap.append(",");
        }
        dap.append(Integer.toString(ar.get(ar.size()-1)));
        dap.append("]");
        return dap.toString();
    }

}
