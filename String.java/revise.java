import java.util.*;

public class revise {
   public static boolean pelindrome(String str){
       int left = 0;
       int right = str.length()-1;

       while (left<right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
       }
       return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(pelindrome(str));
    }
}
