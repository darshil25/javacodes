public class Print_LL {

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
        Print_LL LL = new Print_LL();
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.print();
    }
}
