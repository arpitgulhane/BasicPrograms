package day14;

//import java.util.LinkedList;

public class Stack {
    LinkedListNode list = new LinkedListNode();

    public void push(Object data) {
        list.addLast(data);
    }


    public void pop() {
        list.removeLast();
    }

    public void display() {
        list.display();
    }



    public static void main(String args []) {

        Stack stack = new Stack();

        stack.push(10);

        stack.display();

        stack.push(20);

        stack.display();

        stack.push(30);

        stack.display(); //10 20 30



        stack.pop();

        stack.display();



    }


}
