public class Question2 {
    static class Solution{
        public static int KthOdd(int range[], int k){
            if(k<=0){
                return 0;
            }
            int L = range[0];
            int R = range[1];
            if ((R&1) > 0 ) {  //bitwise and operator if it is given that it is greater than 0 mean 1 than it is odd and if it came 0 tha means it is even
                int count = (int) Math.ceil((R-L+1)/2.0);  //calculate how many odd number between L and R by this method   this for odd and for even is (r-l+1) /2
                if (k>count) {
                    return 0;
                } else {
                    return (R-2*k+2);  // this for largest number in odd number 
                }
            } else {
                int count = (R-L+1)/2 - (L/2);
                if (k>count) {
                    return 0 ;
                } else{
                    return (R-2*k+1);                     
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int p[]= {-10, 10};
        int k = 8;
        System.out.println(Solution.KthOdd(p,k));
    }
}
