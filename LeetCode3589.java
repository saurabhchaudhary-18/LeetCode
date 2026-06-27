import java.util.*;
public class LeetCode3589{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        int cnt =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(max(arr,i,j)-min(arr,i,j)<=k){
                    cnt++;
                    System.out.print(arr[i]+" "+arr[j]);
                }
                System.out.println();
            }
        }
        System.out.println(cnt);
    }
    public static int max(int[] arr, int a, int b){
        int max = 0;
        for(int i=a; i<=b; i++){
            if(prime(arr[i]) && max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr, int a, int b){
        int min = Integer.MAX_VALUE;
        for(int i=a; i<=b; i++){
            if(prime(arr[i]) && min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static boolean prime(int x){
        if(x==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}