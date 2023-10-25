public class remove_First {
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

    public int removeFirst(){  //set return type int because we will return data value of node that removed
        if(size == 0){ //list is empty
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE; //bcz of LL is empty we can't return valid value
        }
        else if(size == 1){ //List has only one node = head = tail
            int val = head.data;  //can take tail.data also bcz head & tail are same here
            head = tail = null;
            size = 0; //single node removed means ll is empty
            return val;
        }
        int val = head.data;
        head = head.next; //set next node as new head of list
        size--;  //bcz of node removal list is decreased by one
        return val;
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
        remove_First LL = new remove_First();
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.addMiddle(2, 9);
        LL.print();
        System.out.println(LL.size);

        LL.removeFirst();
        LL.print();
        System.out.println(LL.size);
    }
}
