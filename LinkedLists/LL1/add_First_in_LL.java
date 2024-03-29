public class add_First_in_LL {

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

    public void addFirst(int data){

        //step - 1 (created newNode)
        Node newNode = new Node(data);

        //if node is null
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step - 2 (linked newNode to head)
        newNode.next = head;

        //step - 3(set newNode as head)
        head = newNode;
    }    
    public static void main(String[] args) {
        add_First_in_LL ll = new add_First_in_LL();

        ll.addFirst(1);
        ll.addFirst(2);
    }
}
