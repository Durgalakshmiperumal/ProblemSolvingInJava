import java.io.*;

class Node {
    int data;
    Node next;
}

class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    void push(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.next = top;
        top = temp;
    }

    void pop() {
        System.out.println("Element is removed: " + top.data);
        top = top.next;
    }

    boolean isEmpty() {
        return top == null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1; // Return a default value in case of an empty stack
        }
        return top.data;
    }

    void display() {
        System.out.println("Elements in stack");
        Node cur = top;
        while (cur != null) {
            System.out.println(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }
}

public class StackADT {
    public static void main(String args[]) throws IOException {

        
        System.out.println("\nImplementation of stack ADT using linked list");
        System.out.println("****************************************");
        int ch, element;
        DataInputStream d = new DataInputStream(System.in);
        Stack st = new Stack();
        do {
            System.out.println("\n\n1. Push\t2. Pop\t3. Peek\t4. Display\t5. Exit\n");
            System.out.println("Enter the choice:");
            ch = Integer.parseInt(d.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to be added:");
                    element = Integer.parseInt(d.readLine());
                    st.push(element);
                    break;
                case 2:
                    if (st.isEmpty())
                        System.out.println("The stack is empty");
                    else
                        st.pop();
                    break;
                case 3:
                    if (st.isEmpty())
                        System.out.println("The stack is empty");
                    else
                        System.out.println("The top element is " + st.peek());
                    break;
                case 4:
                    if (st.isEmpty())
                        System.out.println("The stack is empty");
                    else
                        st.display();
                    break;
                case 5:
                    System.out.println("Program is terminated");
                    break;
                default:
                    System.out.println("Your choice is wrong");
            }
        } while (ch != 5);
    }
}
