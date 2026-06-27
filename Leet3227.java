import java.util.*;
public class Leet3227 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String alpha = input.nextLine();
        char[] arr = alpha.toCharArray();
        String ans = "";
        String vow = "";
        int counter = 0;
        for(int i=0; i<alpha.length(); i++){
            if(check(alpha.charAt(i))){
                vow = vow +alpha.charAt(i);
            } 
        }
        vow = sorting(vow);
        for(int i=0; i<alpha.length(); i++){
            if(!check(alpha.charAt(i))){
                ans = ans + alpha.charAt(i);
            } else {
                ans = ans + vow.charAt(counter++);
            }
        }
        System.out.println(ans);
    }
    private static boolean check(char ch){
        String str = "aeiouAEIOU";
        for(int i=0; i<10; i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    private static String sorting(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String newstr = new String(arr);
        return newstr;
    }
}
