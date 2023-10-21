public class LL_Size {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;    //increamenting size after adding node
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;    //increamenting size after adding node
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index, int data) {
        if(index == 0){ //if we have to add node to first then basically it is addFirst method
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;    //increamenting size after adding node
        Node temp = head;  // set temp to head
        int i = 0;
        while (i < index - 1) { // If we have to put a node at index 2, then after (index - 1 = 2), we have to add a node
            temp = temp.next;
            i++;
        }
        // i = index - 1, then temp becomes the previous node of the targeted index
        newNode.next = temp.next;
        temp.next = newNode;
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
        LL_Size LL = new LL_Size();
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.addMiddle(2, 9);
        LL.print();
        System.out.println(LL.size);
    }
}
