package linkedListDataStructure;

public class SingleLinkedListImplementation {
    SingleLinkedListNode head;


    // Forward Traversal
    public void forwardTraversal() throws Exception{
        if(head == null){
            throw new Exception("LinkedList is Empty");
        }

        SingleLinkedListNode tempNode = head;

        while(tempNode.next != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }

        System.out.println(tempNode.data);
    }

    // Insert at Start
    public void insertAtStart(int data){

        SingleLinkedListNode node = new SingleLinkedListNode();
        node.data = data;

        if(head == null){
            head = node;
        }else{
           node.next = head;
           head = node;
        }
    }

    // Insert at End
    public void insertAtEnd(int data){
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else{
            SingleLinkedListNode n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    // Inset at particular index
    public void insertAtIndex(int data, int index) throws Exception {

        if (head == null) {
            throw new Exception("Linked List is empty");
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        if (index > lengthOfLinkedList()) {
            throw new Exception("Index out of bounds");
        }

        SingleLinkedListNode currentNode = head;

        for (int i = 0; i < index-1; i++) {
            currentNode = currentNode.next;
        }

        SingleLinkedListNode node = new SingleLinkedListNode();
        node.data = data;
        node.next = currentNode.next;
        currentNode.next = node;
    }


    // Length of linked list
    public int lengthOfLinkedList() {
        int count = 0;
        SingleLinkedListNode tempNode = head;

        if (head == null) {
            return 0;
        }

        while (tempNode != null) {
            count++;
            tempNode = tempNode.next;
        }

        return count;
    }

    // Delete Node at Start
    // Delete Node at End
    // Delete Node at Particular index

}
