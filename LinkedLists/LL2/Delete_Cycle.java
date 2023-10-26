/**
 * Delete_Cycle
 */
public class Delete_Cycle {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; // Removed 'static' keyword
    public Node tail; // Removed 'static' keyword

    public boolean isCycle() { // Removed 'static' keyword
        if (head == null) {
            return false; // List is empty, so no cycle.
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { // Use '&&' instead of '||'
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) { // Both pointers meet at the same node, a cycle exists.
                return true;
            }
        }
        return false; // Cycle does not exist.
    }

    public static void main(String[] args) {
        // Sample cycle LL
        Delete_Cycle LL = new Delete_Cycle();
        LL.head = LL.new Node(1);
        LL.head.next = LL.new Node(2);
        LL.head.next.next = LL.new Node(3);
        LL.head.next.next.next = LL.head; // Uncomment this line to create a cycle.
        // 1->2->3->1
        System.out.println(LL.isCycle());
    }
}
