public class Printll {
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

           public void addFirst(int data){

        //step 1
        Node newNode = new Node(data);
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
            System.out.print(temp.data+" -->null ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Printll lil = new Printll();
        lil.print();
        lil.addFirst(2);
        lil.print();
        lil.addFirst(1);
        lil.print();
        lil.addLast(3);
        lil.print();
        lil.addLast(4);
        lil.print();
    }
}
