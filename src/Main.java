//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import arrayDataStructure.ArrayImplementation;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayImplementation arr = new ArrayImplementation(5);

        arr.insertAtFront(10);
        arr.insertAtRear(20);
        arr.insertAtRear(40);
        arr.insertAtFront(30);
        arr.insertAtFront(50);



        arr.deleteAtIndex(0);

        arr.forwardTraversal();

    }
}