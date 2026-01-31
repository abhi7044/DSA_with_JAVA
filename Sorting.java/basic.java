/* bubble basic sort
public class basic 
{
    public static void sort(int arr[]){
    for(int turn=0; turn<arr.length-1; turn++)
    {
        int swaps = 0;
        for(int j=0; j<arr.length-1-turn; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaps++;
                System.out.println(swaps);
            }
        }
    }
 }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int n = 5;
        sort(arr);
        print(arr);
    }
}
*/

//selection sort
/*
public class basic {
    public static void selectioSort(int number[]) {
        for(int i=0; i<number.length-1; i++) {
            int minPos = i; // current element is minimum position
            for(int j=i+1; j<number.length; j++) {
                if(number[minPos]<number[j]){
                    minPos = j;
                }
            }
            int temp = number[minPos];
            number[minPos] = number[i];
            number[i] = temp;
        }
    }
    public static void print(int number[]){
        for(int k=0; k<number.length; k++){
            System.out.print(number[k]+" ");
        }
    }
    public static void insertionSort(int number[]) {
        for(int i=1; i<number.length-1; i++){
            int curr =number[i];1
            int prev = i-1;
            // finding out corect position
            while(prev >=0 && number[prev] > curr){
                number[prev+1] = number[prev];
                prev--;
            }
            // insertion
            number[prev+1] = curr;
        }
    }
    public static void countSort(int number[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++) {
            largest = Math.max(largest, number[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<number.length; i++){
            count[number[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0){
                number[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1, 4, 1, 3, 2, 4, 3, 7};
            countSort(number);
            print(number);
    }
}
 */

// public class basic {
//     // bubblesort = in this there are two loop aor jo inner loop hai usme agar arr of j is greater than arr of j+1 so both of them should be swap kuki jo j hota hai wo hamesa j+1 se chota hona chahiye lekin jab j bada ho gaya j+1 se to dono ko swap kar denge
//     // selectionsort = int this we take two type of loop pahle loop me minpos hai wo i ho hayega  aor second loop me agar arr of minpos is greater than arr of j to minpos is equal to j and than swap on outer loopwith i and minpos   
//    public static void countsort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }
//         int count[] = new int[largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
//         int j=0;
//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//    }
//     public static void print(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//     }
//   }
//     public static void main(String[] args) {
//         int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
//         print(arr);
//     }
// }

// public class basic{
//     public static void bublesort(int arr[]){
//         int swap = 0;
//         for(int i=0; i<arr.length-1; i++){
//             for(int j = 0; j<arr.length-1-i; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap++;
//                     System.out.println(swap);
//                 }
//             }
//         }
//     }
//    public static void print(int arr[]){
//          for(int i=0; i<arr.length; i++){
//              System.out.print(arr[i]+" ");
//          }
//      }
//     public static void main(String[] args) {
//         int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         bublesort(arr);
//         print(arr);
//     }
// }

