public class Delete_Cycle {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail; 

    public boolean isCycle() { 
        if (head == null) {
            return false; // List is empty, so no cycle.
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Both pointers meet at the same node, a cycle exists.
                return true;
            }
        }
        return false; // Cycle does not exist.
    }

    public void deleteCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){ 
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){ // detected cycle
                cycle = true;
                break; //bcz we point slow to head again but we need pos of fast to use 
            }
        }
        if(cycle == false){ // Use 'if (!cycle)' instead of 'if (cycle == false)'
            return;
        }

        // Find the meeting point
        Node prev = null;
        slow = head;
        while(slow != fast){  //loop until both node meet 2nd time
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        } //at end of this loop prev will be last node of list
        
        // Remove cycle - last.next -> tail
        prev.next = null;
    }

    public static void main(String[] args) {
        // Sample cycle LL
        Delete_Cycle LL = new Delete_Cycle();
        LL.head = LL.new Node(1);
        Node temp = LL.new Node(2);
        LL.head.next = temp;
        LL.head.next.next = LL.new Node(3);
        LL.head.next.next.next = temp; // Uncomment this line to create a cycle.
        // 1->2->3->2
        System.out.println(LL.isCycle());
        LL.deleteCycle();
        System.out.println(LL.isCycle());
    }
}
