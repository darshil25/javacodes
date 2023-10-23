public class Recursive_Search {
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

    public int helper(Node head, int key){
        //Base
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        //recursion
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }

        return index+1;
    }

    public int recSearch(int key){  //O(N)
        return helper(head, key); //we have to use another function because in search fun we can take only key val. but recursive search is based on head and key so by another function head can be used
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
    Recursive_Search LL = new Recursive_Search();
    LL.addFirst(1);
    LL.addFirst(2);
    LL.addFirst(3);
    LL.addLast(4);
    LL.addLast(5);
    LL.print();
    System.out.println(LL.recSearch(4));
}
}
