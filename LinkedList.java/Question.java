// import java.util.*;

// import org.w3c.dom.Node;
// public class Question {
// static class Node {
// int data;
// Node next;
// Node(int d){
// data = d;
// next = null;
// }
// }
// public Node getIntersectionNode(Node headA, Node headB)
// {
// while (headB != null) {
// Node temp = headA;
// while (temp != null) {
// if (temp == headB) {
// return headB;
// }
// temp = temp.next;
// }
// headB = headB.next;
// }
// return null;
// }
// public static void main(String[] args){
// Question list = new Question();
// Node headA, headB;
// headA = new Node(10);
// headB = new Node(3);
// Node newNode = new Node(6);
// headB.next = newNode;
// newNode = new Node(9);
// headB.next.next = newNode;
// newNode = new Node(15);
// headA.next = newNode;
// headB.next.next.next = newNode;
// newNode = new Node(30);
// headA.next.next = newNode;
// headA.next.next.next = null;
// Node intersectionPoint
// = list.getIntersectionNode(headA, headB);
// if (intersectionPoint == null) {
// System.out.print(" No Intersection Point \n");
// }
// else {
// System.out.print("Intersection Point: "
// + intersectionPoint.data);
// }
// }
// }


//question2
// public class Question{
//      public static class Node{
//         int data; 
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//         public static Node head;
//         public static Node tail;
//          public void addFirst(Node head , int data){

//         //step 1
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         newNode.next= head;//link
//         head = newNode;
//     }
//      public void print(){
        
//         if(head == null){
//             System.out.print("linkedlist is empty");
//         }
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+" -->null ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     public static void skipMdeleteN(Node head, int M, int N){
//         Node curr = head,t;
//         int count;
//         while (curr!=null) {
//             for ( count = 1; count < M && curr!=null; count++) {
//                 curr = curr.next;
//             }
//             if (curr==null) {
//                 return;
//             }
//             t=curr.next;
//             for ( count = 1; count <= N && t!=null; count++) {
//                 Node temp = t;
//                 t= t.next;
//             }
//             curr.next=t;
//             curr=t;
//         }
//     }
//     public static void main(String[] args) {

//  Node head = null;
// int M=2, N=3;
// head=addFirst(head, 10);
// head=addFirst(head, 9);
// head=addFirst(head, 8);
// head=addFirst(head, 7);
// head=addFirst(head, 6);
// head=addFirst(head, 5);
// head=addFirst(head, 4);
// head=addFirst(head, 3);
// head=addFirst(head, 2);
// head=addFirst(head, 1);       System.out.println(" M=%d, N=%d \n " + " Linked list we have is :\n " + M + "," + N);
//         System.out.println(ll);
//         skipMdeleteN(head, M, N);
//         System.out.println(ll);
//     }
// }



// public class Question{
//      public static class Node{
//         int data; 
//         Node next; 
//         public Node(int data){
//             this.data=data;
//             this.next = null;
//          }
//     }
//     public static Node head; 
//     public static Node tail;
//     public void addFirst(int data){

//         //step 1
//         Node newNode = new Node(data);
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         newNode.next= head;//link
//         head = newNode;
//     }
//     public static void SearchEvenOdd(){
        
//     }
//     public static void main(String[] args) {
        
//     }
// }




