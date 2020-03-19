public class LinkedList {

    Node head;    //head of list

    //Linked List Node.Class is made static so that main can access it.
    static class Node{
        int data;
        Node next;   // next pointer
        Node(int d)   //Constructor to insert incoming data into node.
        {
            data=d;
            next=null;   //Pointing  new node head to null;
        }
    }
    public static void main(String args[])
    {

        LinkedList demolist = new LinkedList();  //Starting with empty list.
        demolist.head = new Node(1);   //pointing the head of new node
        Node second = new Node(2);
        Node third = new Node(3);

        demolist.head.next=second;
        second.next=third;

        System.out.println(demolist.head.data);
        System.out.println(second.data);
        System.out.println(third.data);


    }


}
