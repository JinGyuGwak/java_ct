package boj_silver;


import java.util.*;
public class Boj1920_S4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);

        int m =sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        for(int i=0;i<m;i++){
            System.out.println(check(a,b[i]));
        }
    }
    public static int check(int[] arr, int num){
        int low=0;
        int high = arr.length-1;
        int mid=0;

        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num)return 1;

            else if(arr[mid]>num) high=mid-1;
            else if(arr[mid]<num) low= mid+1;
        }
        return 0;
    }


}
