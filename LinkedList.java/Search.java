//Question:- search for a key in a linked list. return the position where it is found. if not found , return -1
public class Search {
  
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
  
    public static void main(String[] args) {
   Search lil = new Search();
        lil.addFirst(2);
    
        lil.addFirst(1);
        lil.addLast(4);
        lil.addLast(5);
        lil.add(2, 3);
        lil.print(); 
      System.out.println(lil.recSearch(3));
      System.out.println(lil.recSearch(11));
        System.out.println(lil.size);

        
    }
}
