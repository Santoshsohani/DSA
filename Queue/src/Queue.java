// Queue using arrays

public class Queue {

    static int ptr = -1;
    static int maxcap = 10;

    // Function to create a queue.
    public int[] create(int size) {
        if (size > maxcap) {
            int a[] = new int[maxcap];
            return a;
        } else {
            int a[] = new int[size];
            return a;
        }
    }

    // Function to insert into a queue.
    public void insert(int array[], int data) {
        if (ptr == maxcap) {
           System.out.println("Queue is Full");
       } else {
           ptr++;
           array[ptr] = data;
       }
    }

    // Function to Delete an element from the Queue.
    public void delete(int array[]) {
        if (ptr == -1) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
                ptr--;
            }
        }
    }

    // Function to display elements from the Queue.
    public void display(int array[]) {
        if (ptr == -1) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    continue;
                } else {
                    System.out.println(array[i]);
                }
            }
        }
    }

    // Function for isEmpty
    public boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }
        return false;
    }

    // Function for isFull
    public boolean isFull() {
        if (ptr == maxcap) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        int[] queue = q.create(5);

        q.insert(queue, 10);
        q.insert(queue, 20);
        q.insert(queue, 30);

        q.delete(queue);
      
        q.display(queue);
    }
}