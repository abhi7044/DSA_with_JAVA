import java.util.*;
public class Bit {
    public static int countSetBit(int n){
        int count = 0;
while(n>0){
    if ((n&1) != 0) {
        count++;
    }
    n = n>>1;
}
return count;
    }

    public static int fastexpo(int a, int n){
        int ans = 1;
        while(n>0){
            if ((n & 1) !=0) {
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastexpo(3, 5));
        System.out.println(5 & 6);
        System.out.println(5|6);
        System.out.println(5^6);  
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(6>>1);
    }
}

