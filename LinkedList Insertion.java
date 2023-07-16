import java.util.*;

class Node{
    int data;
    Node next;
}

class Main {
    Node head;

public void insert(int new_data){
    Node new_node = new Node();
    new_node.data = new_data;
    new_node.next = head;
    head = new_node;
}

public void print(){
    Node node = head;
    while(node != null){
        System.out.print(node.data + " ");
        node = node.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        Main l1 = new Main();
        l1.insert(7);
        l1.insert(6);
        l1.insert(3);

    l1.print();

    l1.insert(1);
    l1.print();
}
}

