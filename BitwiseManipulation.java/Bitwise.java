import java.util.*;
// //even or odd
// public class Bitwise{
//     public static void OddorEven(int n){
//         int Bitmask = 1;
//         if((n & Bitmask) == 1){
//             System.out.println("odd");
//         }else{
//             System.out.println("even");
//         }
//     }
// public static int getIthBit(int n, int i){
//     int Bitmask = 1<<i;
//     if((n &Bitmask) ==0){
//         return 0;
//     }else{
//         return 1;
//     }
// }
// public static int SetIthBit(int n , int i){
//     int Bitmask = 1<<i;
//         return n | Bitmask;
// }
// public static int ClearIthBit(int n , int i){
//     int Bitmask = ~(1<<i);
//     return n & Bitmask;
// }
// public static int UpdateIthBit(int n, int i, int newBit){
//     if(newBit == 0){
//         return ClearIthBit(n, i);
//     }else{
//         return SetIthBit(n, i);
//     }
// }
// public static int ClearlastIthBit(int n, int i){
//     int Bitmask = ((-1)<<i);
//     return n & Bitmask;
// }
//     public static void main(String[] args) {
//        OddorEven(3);
//        System.out.println(getIthBit(10, 2));
//        System.out.println(SetIthBit(10, 2));
//        System.out.println(ClearIthBit(10, 1));
//        System.out.println(UpdateIthBit(10, 2, 1));
//        System.out.println(ClearlastIthBit(15, 2));

//     }
// }

public class Bitwise{
    public static void OddorEven(int n){
        int Bitmask = 1;
        if((n & Bitmask) == 1){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
    public static int GetIthbit(int n, int i){
        int Bitmask = 1<<i;
        if((n&Bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int SetIthBit(int n, int i){
        int Bitmask = 1<<i;
         return n|Bitmask;
    }
    public static int ClearIthBit(int n, int i){
        int Bitmask = ~(1<<i);
        return n&Bitmask;
    }
    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return ClearIthBit(n, i);
        }else{
            return SetIthBit(n, i);
        }
    }
    public static int LastIthBit(int n, int i){
        int Bitmask = (-1)<<i;
        return n&Bitmask;
    }
    public static int exponential(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
        a= a*a;
        n=n>>1;
        
        }
        return ans;
    }
    public static int CountSet(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
            count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static boolean Power(int n){
        return (n&(n-1))==0;
    }
    // public static int Value(int x){
    //     return x^x;
    // }
    public static void main(String[] args){
        System.out.println(5<<2);
        OddorEven(6);
        System.out.println(GetIthbit(15, 2));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateIthBit(10, 2, 1));
        System.out.println(LastIthBit(15, 2));
        System.out.println(exponential(3, 5));
        System.out.println(CountSet(10));
        System.out.println(Power(8));
        System.out.println(5^5);
    }
} 