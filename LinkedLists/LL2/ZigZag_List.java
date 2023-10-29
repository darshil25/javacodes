public class ZigZag_List {
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
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next; //chnanged from head to head.next bcz if we keep fast = head, after loop ends slow points at first node of second part but in this program we want slow to point last node of first part for that we will point fast to head.next

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //slow pointing at desired mid node
    }

    public void zigzag(){
        //Step-1 : Find Mid
        Node mid = getMid(head);

        //Step-2 : Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;  //setting nex node of mid(first node of 2nd half) to null so it break the list
        Node prev = null;
        Node next;

        while(curr != null){  //part to reverse list
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Step-3 : Alternate/ zig-zag Merge
        Node leftH = head;
        Node rightH = prev;
        Node nextL,nextR;

        while(leftH != null && rightH != null){
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            leftH = nextL; //two lines to update pointers
            rightH = nextR;
        }
        
    }

    public void print(){
        if(head == null){
            System.out.print("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->"); //printing data from temp
            temp = temp.next;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
    ZigZag_List LL = new ZigZag_List();
    LL.addLast(1);
    LL.addLast(2);
    LL.addLast(3);
    LL.addLast(4);
    LL.addLast(5);
    LL.print();

    LL.zigzag();
    LL.print();
}
}
