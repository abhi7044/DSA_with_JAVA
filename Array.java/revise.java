public class revise{
    public static int trapedrainwater(int height[]){
        int n = height.length;
        // left max boundries
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
         }
        //  right max boundries
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
         }
        //  water level
        int trapedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlavel = Math.min(leftmax[i], rightmax[i]);
            trapedwater += waterlavel - height[i];
        }
        return trapedwater;
    }

    public static int buyandsellStock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice< prices[i]) {
            int profit = prices[i] - buyprice;
            maxprofit = Math.max(maxprofit, profit);
                
            }
            else{
                buyprice = prices[i];
            }
            }
            return maxprofit;
    }

    public static void maxsum(int number[]){
        int currsum = 0; 
        int n = number.length;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currsum += number[i];
            if (currsum<0) {
                currsum =0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println(" The maximum sum are " + maxsum);
    }
    public static void main(String[] args) {
         int height[] = {4, 2, 0, 6, 3, 2, 5};
         int prices[] = {7, 1, 5, 3, 6, 4};
          int number[] = {-2, -3, -4, -1, -2, -1, -5, -3};
         maxsum(number);
    }
}