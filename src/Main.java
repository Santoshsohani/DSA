//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import linkedListDataStructure.SingleLinkedListImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
        SingleLinkedListImplementation singleLinkedList = new SingleLinkedListImplementation();

      singleLinkedList.insertAtEnd(10);
      singleLinkedList.insertAtEnd(20);
      singleLinkedList.insertAtEnd(30);
      singleLinkedList.insertAtEnd(40);
      singleLinkedList.insertAtEnd(50);

      singleLinkedList.deleteAtIndex(2);

      singleLinkedList.forwardTraversal();



    }
}