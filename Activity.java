import java.util.ArrayList;

public class Activity {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int Maxactivity = 0;
        ArrayList<Integer> ans = new ArrayList<>(); //make index
        //1st activity
        Maxactivity = 1;
        ans.add(0);
        int Lastend = end[0];
        for (int i = 0; i < start.length; i++) {
            if (start[i] >= Lastend) {
                Maxactivity++;
                ans.add(i);
                Lastend = end[i];
            }
        } 
        System.out.print("Maximum activity " + "(" + Maxactivity + ")" + " ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}

// this below code is for when there end is not sorted so that we use this type of code of 2D array 

public class Activity{
    public static void main(String[] args){
        int start[] = {0, 1, 3, 5, 5, 8};
        int end[] = {6, 4, 2, 9, 7, 9};
        
        int Activity[][]= new int[start.length][3];
        for(int i = 0 ; i < start.length ; i++){
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }
        Arrays.sort(Activity, Comparator.comparasingDouble(o -> o[2]));

        int Maxactivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //for first
        Maxactivity = 1;
        ans.add(Activity[0][0]);
        int Lastend = Activity[0][2];
        for(int i = 1 ; i < end.length; i++){
         if(Activity[i][1] >= Lastend){
            Maxactivity++; 
            ans.add(Activity[i][0]);
            Lastend = Activity[i][2];
            }
        }
    }
}
