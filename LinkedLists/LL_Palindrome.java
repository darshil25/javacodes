public class LL_Palindrome {
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

    //slow-fast approach
    public Node midNode(Node head){  //basically helper function which help to main solution function
        Node slow = head; 
        Node fast = head;

        while(fast != null && fast.next !=  null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
        }

        return slow; //middle node
    }

    public boolean isPalindrome(){
        //boundry case
        if(head == null || head.next == null){
            return true;
        }
        //Step1 - find mid
        Node mid = midNode(head);

        //Step2 - reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step3 - compare 1st & 2nd half
        Node right = prev; //at  last when loop ends it was on last element which is tail or head of 2nd part
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right  = right.next;
        }
        return true;
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
    LL_Palindrome LL = new LL_Palindrome();
    LL.addLast(1);
    LL.addLast(2);
    LL.addLast(2);
    LL.addLast(1);
    LL.print();
    System.out.println(LL.isPalindrome());
}
}
