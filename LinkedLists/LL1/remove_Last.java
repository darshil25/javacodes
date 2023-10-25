public class remove_Last {
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

    public int removeLast(){
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

        Node prev = head;   //first set prev node as head and from loop we'll traverse
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        size--;
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
        remove_Last LL = new remove_Last();
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.addMiddle(2, 9);
        LL.print();
        System.out.println(LL.size);

        LL.removeLast();
        LL.print();
        System.out.println(LL.size);
    }
}
