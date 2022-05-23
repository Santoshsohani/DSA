// Stack using a Linked List.

class Node {
    int data;
    Node next;
}

public class Stack01 {
    static int top = -1;
    static int MAXCAP = 10;
    static int count = 0;

    Node head = new Node();

    // Function to push an element into a stack.
    public void push(int data) {
        if (count == 0) {
            head.data = data;
            head.next = null;
            top++;
            count++;
        } else if (count == 1) {
            Node newNode = new Node();
            newNode.data = data;
            head.next = newNode;
            top++;
            count++;
        } else {
            Node ptr = new Node();
            Node newNode = new Node();
            ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            newNode.data = data;
            ptr.next = newNode;
            top++;
            count++;
        }
    }

    // Function to pop an element from the Stack.
    public void pop() {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
        } else {
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
        count--;
        top--;
    }

    // Function to display all the elements from the stack.
    public void display() {
        if (count == 0) {
            System.out.println("Stack UnderFlow");
        } else {
            Node ptr = new Node();
            ptr = head;
            while (ptr.next != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
            System.out.println(ptr.data);
        }
    }
    public static void main(String[] args) {
        Stack01 s = new Stack01();

        s.push(25);
        s.push(10);
        s.push(50);

        s.display();
        System.out.println();
        s.pop();
        s.display();

    }
}
