public class Reverse { 
    public static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

           public void addFirst(int data){

        //step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){ //this is for if there is a single node-
            head = tail = newNode;
            return;
        }
        newNode.next= head;//link
        head = newNode;
    }
    public void addLast(int data){

        //step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next= newNode;//link
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.print("linkedlist is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add(int idx, int data){
        // for add head
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;  //track temp on which index
        while(i<idx-1){  //for finding previous
            temp = temp.next;
            i++;
        }
        //i=idx-1; temp -> prev
        newNode.next= temp.next;
        temp.next = newNode;
    }
    public int search(int key){
        Node temp = head;
        int i= 0; //this is iterative because it goes and search at paticular point 
        while (temp!=null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){ //from above code that idx track all ll if not get than idx will be -1
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper( head, key);
    }
    
    public void reverse() {
    Node prev = null; //head ke pahle wala node hames null hota hai
    Node curr = tail = head;
    Node next;
    while (curr!=null){
        next = curr.next;
        curr.next= prev;
        prev=curr;
        curr = next;
    }
    head = prev;
    }

    public static void main(String[] args) {
   Reverse ll = new Reverse();
        ll.addFirst(2);
    
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print(); 
       // System.out.println(ll.recSearch(3));
    // System.out.println(ll.recSearch(11));
    //     System.out.println(ll.size);
        ll.reverse();
        ll.print();
        
    }
}