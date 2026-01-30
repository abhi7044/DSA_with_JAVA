import java.util.*;

// Question : Update marks           
  
public class array {
public static void update(int marks[]){
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) { 
        int marks[] = {1,2,3};
        update(marks);
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    }  


// linear search

public class array {
public static int linearsearch(int numbers[], int key){
    if(numbers == null || numbers.length == 0){   //  by using only this line this get optimized
        return -1;
    }
    for(int i = 0; i<numbers.length; i++){
        if(numbers[i] == key){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int key = 10;
        int index = linearsearch(numbers, key);
        if(index== -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at :" +index);
        }
    }
}
   

// largest number in array

public class array {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity = min value
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            // if(largest < numbers[i]) {
            //     largest = numbers[i];
            // }
            largest = Math.max(largest, numbers[i]);
            // if(smallest > numbers[i]) {
            //     smallest = numbers[i];
            // }
            smallest = Math.min(smallest, numbers[i]);
        }
       System.out.println(+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 8, 9, 3, 4};
        System.out.println("largest valur is : " +getLargest(numbers));
    }
}
  

// binary search

public class array {
    public static int binarysearch(int numbers[], int key) {

        int start = 0, end = numbers.length-1;
        while(start <= end) {

            int mid = (start + (end - start))/2;
            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println( +binarysearch(numbers, key));
    }
}
 

// reverse array

public class array {
    public static void reverse(int numbers[]) {

        int first = 0, last = numbers.length-1;
        while(first < last) {

            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
     

// pairs in array  

public class array {
   public static void Printpair(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        Printpair(numbers);
    }
}
 

// print subarray

public class array {
    public static void Subaray(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        Subaray(numbers);
    }
}
 

// Max subarray sum by brute force

public class array {
    public static void maxSubarray(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++) {
            int start = i;
            for(int j=i; j<number.length; j++) {
                int end = j;
                currsum = 0;
                for(int k=start; k<=end; k++) {
                    currsum += number[k];
                }
                System.out.println(currsum);
                // if(maxsum<currsum) {
                //     maxsum = currsum;
                // }
                maxsum = Math.max(maxsum, currsum); 
            }
        }
            System.out.println("max sum = " + maxsum);
    }
   public static void main(String[] args) {
    int number[] = {1, -2, 6, -1, 3};
        maxSubarray(number);
}
}
 

// Max Subarray sum by prefix array

public class array {
    public static void Prefixsubarray(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];  //size of prefix
        prefix[0] = number[0]; // position at 0 is 0 of prefix and nnumber
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                currsum = start == 0 ?prefix[end] : prefix[end] - prefix[start-1]; 
            if(maxsum<currsum) {
                maxsum = currsum;
                 }
            }
        }
        System.out.println("max sum = " +maxsum);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        Prefixsubarray(number);
    }
}
     

// max subarray sum by kadanes algorithm

public class array {
    public static void maxsum(int number[]) {
        int currsum = 0;
        int n = number.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            currsum += number[i];
            if(currsum<0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("max sum are = " +maxsum);
    }
    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxsum(number);
    }
}
 

//kadanes algorithm if all number are negetive but it cant come true
/*
public class array {
    public static void maxsum(int number[]) {
        int currsum = 0;
        int minsum = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++) {
            currsum += number[i];
            if(currsum<0){
                currsum = number[i];;
            }
            minsum = Math.min(currsum, minsum);
        }
        System.out.println("max sum are = " +minsum);
    }
    public static void main(String[] args) {
        int number[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        maxsum(number);
    }
}
     */


//traping rain water:- dsa sheet number 22
 
public class array {
    public static int trapedrainwater(int height[]) {
        int n = height.length;
        //claculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trapedwater = 0;
        // then find loop
        for(int i=0; i<n; i++) {
            //waterlavel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //traped water = waterlavel- height[i] *width
            trapedwater += waterlevel - height[i];
        } 
        return trapedwater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapedrainwater(height));
    }
}


//HOME WORK question 1 dsa sheet 4 --> given an integer array return true if any value atleast twice in the array and return false if every element is distinct
// public class array {
//     public static boolean structre(int number[]) {
//         for(int i=0; i<number.length-1; i++) {
//             for(int j=i+1; j<number.length; j++) {
//                 if(number[i] == number[j]) {
//                     // System.out.println(true);
//                 return true ;
//                 }
//             }
//         }
//         return false;
//         //System.out.println(false);
//     }
//     public static void main(String[] args) {
//         int number[] = {1, 2, 3, 2, 4, 5, 5, 5, 6, 8};
//         System.out.println(structre(number));
//     }
// }

// question 2:- there is an integer array sorted in ascending order(with distinct value)


// input output and update
/*
public class array{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        // marks[0]  = 95;
        // marks[1]  = 96;
        // marks[2]  = 97;
        //input
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();        
        //output
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
} 
 */

 
 //buy and sell
 
 public class array {
    public static int buyandsellStock(int prices[]){
        int buyprice = Integer.MAX_VALUE; // take +infinity
        int Maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                Maxprofit = Math.max(Maxprofit, profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return Maxprofit;
//    max profit  O(n)
//            Maxprofit = sellprice-buyprice;
}
   public static void main(String[] args) {
     int prices[] = {7, 1, 5, 3, 6, 4};
    System.out.println(buyandsellStock(prices));   
}
}
 