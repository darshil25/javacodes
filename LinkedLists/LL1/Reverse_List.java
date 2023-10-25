public record Reverse_List() {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void revList(){ //O(N)
        Node prev = null;  //we start from head so prev is null
        Node curr = tail = head; //basically after reversing head became tail so in star we directly assigning it
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev; //main step of reversing
            prev = curr;
            curr = next;
        }

        head = prev;
    }
    public void print() {
        if (head == null) {
            System.out.print("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->"); // Printing data from temp
            temp = temp.next;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
    Reverse_List LL = new Reverse_List();
    LL.addFirst(1);
    LL.addFirst(2);
    LL.addFirst(3);
    LL.addLast(4);
    LL.addLast(5);
    LL.print();
    
    LL.revList();
    LL.print();
}
}
