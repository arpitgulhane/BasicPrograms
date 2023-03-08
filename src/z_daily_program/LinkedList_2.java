package z_daily_program;
//head point new node   //it will print that value whis last pointed
public class LinkedList_2 {
    Node head;
    class Node {

        Object data;
        Node next;
        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(Object data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printNode(){
        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }

        Node tempNode = head;

        while(tempNode != null){
            System.out.print(tempNode.data + "=>");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public void addLast(Object data) {

        Node newNode = new Node(data);

        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }

        Node tempNode = head;

        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next=newNode;
    }


    public static void main(String[] args) {

        LinkedList_2 ll = new LinkedList_2();

        ll.addFirst(20);
        ll.addFirst(2);

        ll.addFirst(10);

        ll.addLast(30);
        ll.addLast(5);

        ll.printNode();



    }

}
