public class SinglyLinkedList {

    static class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head ;
    // time complexity o(n)
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

         if( head == null )
        {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null ){
            temp = temp.next;
        }

        temp.next = newNode;

 }
// time complexity o(1);
 public void insertAtBeginning(int data){

    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
 }

 public void delete (int key){

    // if list is empty
    if(head == null ){
        System.out.println("List is empty ");
        return;
    }

    // if head needs to be deleted 

    if(head.data == key ){
        head = head.next;
        return;


    }
    Node temp = head ;
    while (temp.next != null && temp.next.data != key ){
        temp = temp.next;
    }

    if(temp.next == null ){
        System.out.println("Value not found ");
    }else {
        temp.next = temp.next.next;
    }
 }

 //display list
 public void display(){
    Node temp = head ;

    while (temp != null){
        System.out.println(temp.data + "->");
        temp = temp.next;
    }

    System.out.println("null");
 }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(20);

        System.out.println("After inserting at end :");
        list.display();

        list.insertAtBeginning(5);
        System.out.println("After inserting at beginning :");
    list.display();

    list.delete(20);
    System.out.println("After deleting 20 :");
    list.display();


       
    }
}
