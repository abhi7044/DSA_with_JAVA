import java.util.*;                                  
import java.util.Scanner;

// input and output
/*
public class strings {
    
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        }
}
*/

//length of string
/*
public class strings {
    public static void main(String[] args) {
        String firstName = "Abhijeet";
        String lastName = "Mishra";
        String fullname = firstName + " " + lastName;
        System.out.println(fullname.length());
    }
}
*/

// string concatenation = add two string
/*
 public class strings {
    public static void main(String[] args) {
        String firstName = "Abhijeet";
        String lastName = "Mishra";
        String fullname = firstName + " " + lastName;
        System.out.println(fullname);
    }
 }
     */

// String charAt() method == in this we came to how much letter in name 
/*
public class strings {
    // this function give all letter of full name 
    public static void printletter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstname = "Abhijeet";
        String lastname = "Mishra";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.charAt(0));  //.this output give only first letter of name
    
        printletter(fullname); // this function gives full name letter how much these are

    }
}
     */

//check if string is pelindrome or not
/*
public class strings {
    public static boolean pelindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(pelindrome(str));
    }
}
*/

//check shortest path
/*
public class strings{
    public static float shortestpath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S') {
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2); 
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}
 */

// string function = in we have to all string are same are not if not than  (s1.equals(s3))
/*
public class strings {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        if(s1 == s3){
            System.out.println("string are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("string are equal");
        }
        else{
            System.out.println("string are not equal");
        }
    }
}
*/

//substring
/*
public class strings{
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "abhijeetmishra";
        System.out.println(str.substring(0, 5));
        //System.out.println(substring(str, 0, 5));
    }
}
 */

// print largest string
/*
public class strings{
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
*/


//String builder
/*
public class strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb.length());
    }    
}
*/

//concvert letter to uppercase

public class strings{
    public static String Uppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;  i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am abhijeet mishra";
        System.out.println(Uppercase(str));

    }
}


// string compression
/*
public class strings {
    public static String compress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
    String str = "abhijeetmishra";
    System.out.println(compress(str));        
    }
}
*/

