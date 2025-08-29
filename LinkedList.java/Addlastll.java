public class Addlastll {
    public static class Node{
        int data; 
        Node next; 
        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
     public void addFirst(int data){

        //step 1
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next= head;//link
        head = newNode;
    }
    public void addLast(int data){

        //step 1
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next= newNode;//link
        tail = newNode;
    }
    public static void main(String[] args) {
        Addlastll ll = new Addlastll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
    }
}


