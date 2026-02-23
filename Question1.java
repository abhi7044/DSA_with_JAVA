import java.util.*;

public class Question1 {

     class Solution{
         static int Balanced(String str, int n){
        
            if (n==0) {
                return 0;
            }
        
            int r = 0;
            int l = 0;
            int ans = 0;
        
        
            for (int i = 0; i < n; i++) {
        
                if (str.charAt(i) == 'R') {
                    r++;
                }
        
                else if (str.charAt(i) == 'L') {
                    l++;
                }
        
                if(r==l){
                    ans++;
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        String str = "LRLLRRLRRL" ;
        int n = str.length();
        System.out.println(Solution.Balanced(str, n) + "\n");
    }
}
