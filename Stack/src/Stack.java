// Stack using a Array.

public class Stack {
    static int top = -1;
    static int MAXCAP = 10;

    // Function to push an element into a stack.
    public void push(int[] stk, int element) {
        if (top == MAXCAP) {
            System.out.println("Stack OverFlow");
        } else {
            stk[++top] = element;
        }
    }

    // Function to pop an element 
    public int pop(int[] stk) {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
            return -1;
        } else {
            int ele = stk[top];
            top--;
            return ele;
        }
    }

    // Function to Display all the elements in an Stack.
    public void display(int[] stk) {
        if (top == -1) {
            System.out.println("Stack UnderFlow");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stk[i]);
            }
        }
    }

    // Function to get the peek value of a stack.
    public int peek(int[] stk) {
        if(top == -1) {
            System.out.println("Stack UnderFlow");
            return -1;
        } else {
            return stk[top];
        }
    }
    public static void main(String[] args) {
        int[] S = new int[MAXCAP];

        Stack stack = new Stack();

        stack.push(S, 10);        
        stack.push(S, 20);        
        stack.push(S, 30);        
        stack.push(S, 40);
        
        stack.pop(S);
        stack.pop(S);

        stack.display(S);

        System.out.println("The peek value of the stack is : "+ stack.peek(S));

    }
}
