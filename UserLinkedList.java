

public class UserLinkedList {
    public static void main(String[] args) {
        ListLinked<Integer> list=new ListLinked<>();
        list.insertAtFront(5);
        list.insertAtLast(7);
        list.insertAtFront(6);
        list.insertAtMiddle(1, 2);
        list.deleteAtFront();

        ListLinked<Integer> li=new ListLinked<>();
        li.insertAtFront(10);
        li.insertAtLast(17);
        li.insertAtFront(16);
        li.insertAtMiddle(31, 2);
         list.mergListLinked(li);
         list.print();
         list.reverse();
         list.print();
           
            
        }
      
    }



class ListLinked<T>{
    Node head ;
    class Node{
      T t;
      Node next;
    public Node() {
        this.t=null;
        this.next=null;
    }
    public Node(T data) {
        this.t = data;
        this.next = null;
    }

      
    }
    public ListLinked() {
        head=new Node();
    }

    void insertAtFront(T data){
        Node newNode=new Node(data);
        newNode.next=this.head.next;
        this.head.next=newNode;
    }

    void insertAtLast(T data){
        Node n=head;
        while(n.next!=null){
             n=n.next;
        }
        if(n.next==null){
            Node newNode=new Node(data);
            newNode.next=n.next;
        n.next=newNode;
        

        }
    }

    void insertAtMiddle(T data,int position){

        int i=1;
        Node start=this.head;
        while(i<position){
            start=start.next;
            i++;
        }
        Node newNode=new Node(data);
        newNode.next=start.next;
        start.next=newNode;
    }

    void print(){
        Node node=this.head;
        while(node.next!=null){
            System.out.println(node.next.t);
            node=node.next;
        }
    }

    void mergListLinked(ListLinked<T> list){
        
        Node node=this.head;
        while(node.next!=null){
           
            node=node.next;

        }
        
        node.next=list.head.next;
       
     

    }

    T deleteAtFront(){
        T data=null;
        if(head.next!=null){
            head.next=head.next.next;
        }
        return data;
           
    }

    T deleteAtEnd(){
        T data=null;
        Node node=head;
       
        while(node.next!=null){
            if(node.next.next==null){
                break;
            }
                node=node.next;
           
        }
        
        data=node.next.t;
      node.next=null;

        return data;
           
    }

    void deleteAtAny(T key){
        Node node=head;
        while(node.next!=null){
            if(node.next.t==key){
               break;
            }
          
            node=node.next;
        }
        node.next=node.next.next;
    }

    void reverse(){
        int i=1;
        Node start=head;
        while(start.next!=null){
            T data=deleteAtEnd();
            insertAtMiddle(data, i);
            start=start.next;
            
            i++;

        }
    }

    boolean isEmpty(){
        if(head.next==null){
            return true;
        }else{
            return false;
        }
    }
    
}

