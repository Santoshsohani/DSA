class Node{
    int data;
    Node next;
}

public class Queue01 {
    Node head = new Node();
    int count = 0;
    Node ptr = head;

    // Function to Insert an element into the Queue.
    public void insert(int data) {
        if (count == 0) {
            head.data = data;
            head.next = null;
            count++;
        } else if (count == 1) {
            Node newNode = new Node();
            newNode.data = data;
            head.next = newNode;
            count++;
            ptr = ptr.next;
        } else {
            Node p = new Node();
            Node newNode = new Node();
            p = head;
            while (p.next != null) {
                p = p.next;
            }
            newNode.data = data;
            p.next = newNode;
            count++;
            ptr = ptr.next;

        }
    }

    // Function to delete from the Queue.
    public void delete() {
        if (count == 0) {
            System.out.println("Queue is Empty");
        } else {
            Node p = new Node();
            p = head;
            head = p.next;
            p.next = null;
            count--;
        }
    }

    // Function to display elements from the Queue.
    public void display() {
        Node p = new Node();
        p = head;
        while (p.next != null) {
            System.out.println(p.data);
            p = p.next;
        }
        System.out.println(p.data);
    }

    // Function to display peek and first value
    public void firstAndPeek() {
        if (count == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("First value is : " + head.data);
            System.out.println("Peek value is : " + ptr.data);
        }
    }
    public static void main(String[] args) {
        Queue01 q = new Queue01();

        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);

        q.delete();
        q.delete();

        q.display();

        q.firstAndPeek();
    }
}
