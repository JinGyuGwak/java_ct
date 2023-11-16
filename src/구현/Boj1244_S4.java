package 구현;
import java.util.*;
import java.io.*;
public class Boj1244_S4 {
    static int[] a;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int m =Integer.parseInt(br.readLine());
        List<Person> p = new ArrayList<>();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            p.add(new Person(t1,t2));
        }
        for(Person dap : p){
            if(dap.sex==1){
                man(dap.number);
            }
            else {
                woman(dap.number);
            }
        }
        int c=1;
        while(c<=n){
            System.out.print(a[c] + " ");
            if(c%20==0) System.out.println();
            c+=1;
        }
    } // number = 3
    public static void man(int card){
        for(int i=1;i<=n;i++){
            if(i%card==0){
                a[i] = (a[i]==1) ? 0 : 1;
            }
        }
    }
    public static void woman(int card){
        int c=1;
        while(card-c>0 && card+c<=n){
            if(a[card-c]==a[card+c]){
                c+=1;
            } else break;
        }
        a[card] = (a[card]==1) ? 0 : 1;
        for(int i=1;i<c;i++){
            if(card-i>0 && card+i<=n){
                a[card+i] = (a[card+i]==1) ? 0 : 1;
                a[card-i] = (a[card-i]==1) ? 0 : 1;
            }
        }

    }



    public static class Person {
        int sex;
        int number;
        public Person(int sex, int number){
            this.sex=sex;
            this.number=number;
        }
    }
}
