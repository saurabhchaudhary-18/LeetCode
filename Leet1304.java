import java.util.*;
public class Leet1304 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int ind = 0;
        if(n%2!=0){
            arr[ind++] = 0;
        }
        for(int i=1; i<=n/2; i++){
            arr[ind++] = i;
            arr[ind++] = -i;
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
