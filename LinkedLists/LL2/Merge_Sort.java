public class Merge_Sort {
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

    public Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1); //merged LL with dummy node
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1; //temp point to head 1
                head1 = head1.next; //head1 point to its next node
                temp = temp.next; //temp next become temp.next
            }
            else{
                temp.next = head2; //temp point to head 2
                head2 = head2.next; //head2 point to its next node
                temp = temp.next; //temp next become temp.next
            }
        }

        //for remaining node in lists
        while(head1 != null){
            temp.next = head1; 
            head1 = head1.next; 
            temp = temp.next; 
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next; 
            temp = temp.next; 
        }

        return mergeLL.next; //instead of head(mergeLL) we return it's next because at mergeLL dummyNode stored if we return mergeLL.next it remove link btn dummynode & mergeLL
    }

    public Node mergeSort(Node head){
        //if ll is null or have only 1 node then it is already sorted
        if(head == null || head.next == null){
            return head;
        }

        //Step-1 : Find Mid
        Node mid = getMid(head);

        //Step-2 : Divide in left and right half
        Node rightHead = mid.next; //making right half node
        mid.next = null; //break link btn left & right halves
        Node newLeft = mergeSort(head); //left half & return sorted left LL's head
        Node newRight = mergeSort(rightHead); //right half & return sorted right LL's head

        //Step-3 : Merge Sorted halves
        return merge(newLeft, newRight);
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
    Merge_Sort LL = new Merge_Sort();
    LL.addLast(5);
    LL.addLast(9);
    LL.addLast(11);
    LL.addLast(3);
    LL.addLast(8);
    LL.print();

    LL.head = LL.mergeSort(head);
    LL.print();
}
}
