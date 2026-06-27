package String;

import java.util.*;

public class LeetCode5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>=i; j--){
                if(pal(s.substring(i,j+1)) && j-i>=ans.length()){
                    ans = s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
    private static boolean pal(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
