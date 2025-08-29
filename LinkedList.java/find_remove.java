public class find_remove { 
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

    public void frmv(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        //if we have to delete the first node
        if(n==sz){
            head = head.next;
            return;
        }
        // for sz-n
        int idx= 1;
        int idxTofind = sz-n;
        Node prv = head;
        while (idx < idxTofind) {
            prv = prv.next;
            idx++;
        }
        prv.next = prv.next.next;
        return;
    }
    
    public static void main(String[] args) {
   find_remove ll = new find_remove();
        ll.addFirst(2);
    
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print(); 
        ll.frmv(3);
        ll.print();
        
    }
}

