/**
 * Interative_Search
 */
public class Interative_Search {

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

    public int itrSearch(int key){ //O(n)
        int index = 0;
        Node temp = head;

        while(temp != null){
            if(temp.data == key){ //key found
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
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
    Interative_Search LL = new Interative_Search();
    LL.addFirst(1);
    LL.addFirst(2);
    LL.addFirst(3);
    LL.addLast(4);
    LL.addLast(5);
    LL.print();
    System.out.println(LL.itrSearch(4));
}
}