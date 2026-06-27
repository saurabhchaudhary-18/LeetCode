import java.util.*;
public class LeetCode443 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        char[] chars = s1.toCharArray();
        String str = "";
        for(int i=0; i<chars.length; i++){
            int cnt = 0;
            char ch = chars[i];
            while(i<chars.length && chars[i]==ch){
                cnt++;
                i++;
            }
            if(cnt==1){
                str = str + ch;
            } else {
                str = str + ch + cnt;
            }
            System.out.println(str);
        }
        //System.out.println(str);
    }
}
