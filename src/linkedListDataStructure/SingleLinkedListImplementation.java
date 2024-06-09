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
    public void deleteAtStart() throws Exception{
       if(head == null){
           throw new Exception("Linked List is empty");
       }else{
           SingleLinkedListNode deleteNode = head;
           head = head.next;
           deleteNode.next = null;
       }
    }

    // Delete Node at End
    public void deleteAtEnd() throws Exception{
        if(head == null){
            throw new Exception("Linked List is empty");
        }else{
          int length = lengthOfLinkedList();
          if(length == 1){
              head = null;
          }else{
              SingleLinkedListNode tempNode = head;
              // Index starts with 0
              for(int i = 0; i < length-2;i++){
                  tempNode = tempNode.next;
              }
              tempNode.next = null;
          }
        }
    }


    // Delete Node at Particular index
    public void deleteAtIndex(int index) throws Exception {
        if (head == null) {
            throw new Exception("Linked List is empty");
        }

        if (index == 0) {
            deleteAtStart();
            return; // Exit the method after deletion
        }

        if (index == lengthOfLinkedList() - 1) {
            deleteAtEnd();
            return; // Exit the method after deletion
        }

        if (index >= lengthOfLinkedList()) {
            throw new Exception("Index out of bounds");
        }

        SingleLinkedListNode currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        SingleLinkedListNode nodeToDelete = currentNode.next;
        currentNode.next = nodeToDelete.next;
        nodeToDelete.next = null;
    }

    // Searching in a single linked list.
    public boolean searchLinkedList(int key) throws Exception{
        if(head == null){
            throw new Exception("Linked List is empty");
        }

        SingleLinkedListNode tempNode = head;
        while(tempNode.next != null){
            if(tempNode.data == key){
                return true;
            }
            tempNode = tempNode.next;
        }

        return false;
    }

}
