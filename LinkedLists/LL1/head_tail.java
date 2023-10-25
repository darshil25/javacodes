public class head_tail {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        head_tail ll = new head_tail(); //created ll object from head_tail class
        ll.head = ll.new Node(1); //stored data 1 in ll's head
        ll.head.next = ll.new Node(2); //in next node stored data 2
    }
}
