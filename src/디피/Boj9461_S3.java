package 디피;
import java.util.*;
import java.io.*;
public class Boj9461_S3 {
    static long[] a = new long[101];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sol(101);
        for(int i=0; i<n;i++){
            System.out.println(a[sc.nextInt()]);
        }
    }
    public static void sol(int m) {
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;
        for (int i = 4; i <= 100; i++) {
            a[i] = a[i - 2] + a[i - 3];
        }
    }
}
