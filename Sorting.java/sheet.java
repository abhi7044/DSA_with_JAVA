public class sheet {
    public static void bubblesort(int array[]){
        for (int turn = 0; turn < array.length-1; turn++) {
            for (int i = 0; i < array.length-1-turn; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
    public static void selectionsort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }  
    public static void insertionsort(int array[]){
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prv = i-1;
            while (prv>=0 && array[prv] > curr) {
                array[prv+1] = array[prv];
                prv--;
            }
            array[prv+1] = curr;
        }
    }
    public static void countsort(int array[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
         }

         int count[] = new int[largest+1];
         for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
         }
         int j =0;
         for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
         }
    }
    public static void print(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1}; 
        countsort(array);
        print(array);
    }
}
