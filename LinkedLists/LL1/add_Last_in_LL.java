public class add_Last_in_LL {

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

        public void addLast(int data){
            //step-1 (create new node)
            Node newNode = new Node(data);

            //if Node is empty
            if(head == null){
                head=tail=newNode;
            }
            //step-2 (link prev tail to new Node)
            tail.next = newNode;
            //step-3 (set newNode as tail)
            tail = newNode;
        }
    public static void main(String[] args) {
        add_Last_in_LL LL = new add_Last_in_LL();
        LL.addLast(1);
        LL.addLast(2);
    }
}
