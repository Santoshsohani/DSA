package arrayDataStructure;
import java.util.Arrays;
public class ArrayImplementation { private int capacity;
    private int size;
    private int[] array;

    public ArrayImplementation(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    private void resize(){
        capacity = capacity * 2;
        array = Arrays.copyOf(array, capacity);
    }

    // Forward Traversal
    public void forwardTraversal(){
        for(int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }

    // Backward Traversal
    public void backwardTraversal(){
        for(int i = size-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

    // Insert at Front
    public void insertAtFront(int value){
        if(size == capacity){
            resize();
        }

        for(int i = size; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = value;
        size++;
    }

    // Insert at rear
    public void insertAtRear(int value){
        if(size == capacity){
            resize();
        }

        array[size] = value;
        size++;
    }

    // Insert at a given index
    public void insertAtIndex(int index,int value){
        if(size == capacity){
            resize();
        }

        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = value;
        size++;
    }

    // Delete from front
    public void deleteAtStart() throws Exception {
        if(size == 0){
            throw new Exception("Array is empty");
        }

        for(int i = 1; i < size; i++){
            array[i-1] = array[i];
        }
        size--;
    }

    // Delete from rear
    public void deleteFromRear() throws Exception{
        if(size == 0){
            throw new Exception("Array is Empty");
        }

        for(int i = size-2; i >= 0; i--){
            array[i+1] = array[i];
        }
        size--;
    }

    // Delete from a particular index
    public void deleteAtIndex(int index) throws Exception {
        if (size == 0) {
            throw new Exception("Array is Empty");
        }

        if (index < 0 || index >= size) {
            throw new Exception("Index is out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

}
