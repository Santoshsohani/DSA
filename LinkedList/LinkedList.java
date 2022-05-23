class Node {
    int data;
    Node next;
}

class LL {
    // Method to diplay the Nodes in an Linked List.
    public void display(Node head) {
        Node ptr = head;
        while (ptr.next != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
        System.out.println(ptr.data);
    }

    // Method to Count number of Nodes in a linkedList
    public int countNodes(Node head) {
        Node ptr = new Node();
        ptr = head;
        int count = 1;
        while (ptr.next != null) {
            ptr = ptr.next;
            count++;
        }
        return count;
    }

    // Method to insert a Node at first position in a Linked List.
    public Node insertAtFirst(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        return newNode;
    }
    
    // Method to Append a node in the Linked List.
    public void append(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        Node ptr = new Node();
        ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.next = null;
    }

    // Method to Insert at a given Index. (Index starts from 0)
    public void insertAtIndex(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;

        Node p = new Node();
        Node q = new Node();
        p = head;
        q = head.next;

        for (int i = 0; i < position - 1; i++) {
            p = p.next;
            q = q.next;
        }
        p.next = newNode;
        newNode.next = q;
    }

    // Method to delete first Node.
    public Node deleteFirstNode(Node head) {
        Node p = new Node();
        Node q = new Node();
        p = head;
        q = head.next;
        p.next = null;
        return q;
    }

    // Method to delete the last node.
    public void deleteLastNode(Node head) {
        Node p = new Node();
        Node q = new Node();
        p = head;
        q = head.next;
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = null;
    }

    // Method to delete a node at a particular index.
    public void deleteAtIndex(Node head, int position) {
        Node p = new Node();
        Node q = new Node();
        p = head;
        q = head.next;

        for (int i = 0; i < position - 1; i++) {
            p = p.next;
            q = q.next;
        }
        p.next = q.next;
        q.next = null;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node();
        Node first = new Node();
        Node second = new Node();

        head.data = 10;
        head.next = first;

        first.data = 20;
        first.next = second;

        second.data = 30;
        second.next = null;

        // METHOD CALL'S
        LL linkedList = new LL();
        head = linkedList.insertAtFirst(head, 255);
        linkedList.append(head, 679);
        linkedList.insertAtIndex(head, 888, 3);
        head = linkedList.deleteFirstNode(head);
        linkedList.deleteLastNode(head);
        linkedList.deleteAtIndex(head, 1);
        linkedList.display(head);
        System.out.println("Number of Nodes are : " + linkedList.countNodes(head));
    }
}
