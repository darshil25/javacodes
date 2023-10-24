public class Find_Remove_nth_Node {
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

    public void removenthFromLast(int n){  //nth node from last
        Node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next; //set head to its next node it unlinked and deleted automatically
            return;
        }

        //now we have to reach node that is previous node of targeted node
        //target node = size-n+1
        //previous node = size - n
        int i=1; //because we already defined condition for 0 aka Head
        int indexToFind = size-n;
        Node prev = head;
        while(i < indexToFind){
            prev = prev.next;
            i++;
        }

        //after loop complete prev become node that is before targeted node
        //we link that node to n+1 node so automatically nth node unlinked and deleted
        prev.next = prev.next.next;
        return;

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
        Find_Remove_nth_Node LL = new Find_Remove_nth_Node();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.print();
        
        LL.removenthFromLast(3);
        LL.print();
    }
}
