package 완전탐색;
import java.util.*;
import java.io.*;
public class Boj15686_G5 {
    static int n;
    static List<Node> house = new ArrayList<>();
    static List<Node> chicken = new ArrayList<>();
    static boolean[] visit;
    static int m;
    static int hap=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        //2인 경우 값 저장
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                String check = st.nextToken();
                if(check.equals("1"))house.add(new Node(i,j)); //x좌표 y좌표
                else if(check.equals("2"))chicken.add(new Node(i,j));
            }
        }
        visit = new boolean[chicken.size()];
        sol(0,0);
        System.out.println(hap);
    } //2일 때 치킨거리를 구해야 한다
    public static void sol(int depth,int idx){ //도시의 치킨거리는 모든 집의 치킨거리의 합
        if(depth==m){ //치킨집이 정해졋으니 집 기준으로 치킨거리를 구하면 됨
            int test=0;
            for(int i=0; i<house.size(); i++){
                int ma = Integer.MAX_VALUE;
                for(int j=0; j<chicken.size();j++){ //집의 치킨거리 구함
                    if(visit[j]){
                        int dist = Math.abs(house.get(i).x-chicken.get(j).x)+Math.abs(house.get(i).y-chicken.get(j).y);
                        ma=Integer.min(ma, dist);
                    }
                }
                test+=ma;
            }
            hap=Integer.min(hap,test);
            return;
        }
        for(int i=idx;i<chicken.size();i++){ //치킨집 선택
            if(!visit[i]){
                visit[i]=true;
                sol(depth+1,idx+1);
                visit[i]=false;
            }
        }
    }
    public static class Node{
        int x;
        int y;
        public Node(int y, int x){
            this.y=y;
            this.x=x;
        }
    }
}
