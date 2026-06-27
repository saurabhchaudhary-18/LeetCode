import java.util.*;
public class LeetCode3612 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String s = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='*'){
                s = remove(s);
            }
            else if(str.charAt(i)=='#'){
                s = duplicate(s);
            }
            else if(str.charAt(i)=='%'){
                s = reverse(s);
            } else {
                s=s+str.charAt(i);
            }
            System.out.println(s);
        }
        System.out.println();
        System.out.println(s);
    }
    public static String remove(String s){
        String str = "";
        for(int i=0; i<s.length()-1; i++){
            str = str + s.charAt(i);
        }
        return str;
    }
    public static String reverse(String s){
        String str = "";
        for(int i=s.length()-1; i>=0; i--){
            str = str + s.charAt(i);
        }
        return str;
    }
    public static String duplicate(String s){
        return s+s;
    }
}
//'*' removes the last character from result, if it exists.
//'#' duplicates the current result and appends it to itself.
//'%' reverses the current result.
