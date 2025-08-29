public class Remove_first_LL {
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
    public int rmov(){
        if(size == 0){
            System.out.println("Linkedlilst is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head = tail = null;
            size=0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }
    public int rmovlast(){
        if(size==0){
            System.out.println("ll empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int value = head.data;
            head= tail= null;
            size =0; 
            return value;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int value = prev.next.data; //tail.data
        prev.next= null;
        tail = prev;
        size--;
        return value;
    }
    public static void main(String[] args) {
    Remove_first_LL lil = new Remove_first_LL();
        lil.addFirst(2);
        lil.addFirst(1);
        lil.addLast(4);
        lil.addLast(5);
        lil.add(2, 3);
        lil.print(); 
        lil.rmov();
        lil.print();       
        lil.rmovlast();
        lil.print();
        System.out.println(lil.size);

        
    }
}
