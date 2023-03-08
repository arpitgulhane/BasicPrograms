package z_daily_program;
//tail changes position and point new node // head remain same
public class LinkListNode {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    public Node head =null;
    public Node tail =null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next = newNode;
            tail=newNode;
        }
    }


    public int countNodes(){
        int count =0;
        Node current = head;

        while(current != null){
            count ++;
            current = current.next;
        }
        return count;
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        System.out.println("Nodes of singly linked list:");

        while(current != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void removeFirst(){

    }

    public static void main(String []args){
        LinkListNode sList = new LinkListNode();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        sList.display();
        System.out.println("Count of nodes present in list "+sList.countNodes());
        sList.display();


    }



}


