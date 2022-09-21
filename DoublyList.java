public class DoublyList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> li=new DoublyLinkedList<>();
        li.insertAtFront(4);
        li.insertAtLast(9);
        li.insertAtFront(7);
        li.insertAtMiddle(5, 2);
        li.print();
    }
    
}

class DoublyLinkedList<T>{
    Node head;
    class Node{
        T t;
        Node left,right;
        public Node() {
            this.t=null;
            this.left=null;
            this.right=null;
        }
        public Node(T t) {
            this.t=t;
            this.left=null;
            this.right=null;
            

        }

        
    }

    

    public DoublyLinkedList() {
        head=new Node();
    }



    void insertAtFront(T t){
         Node node=new Node(t);
         node.left=head;
         node.right=head.right;
         head.right=node;
    }

    void insertAtLast(T t){
        Node n=head;
        while(n.right!=null){
            n=n.right;
        }
        Node node=new Node(t);
        n.right=node;
        node.left=n;
        node.right=null;
    }

    void insertAtMiddle(T t,int position){
        Node n=head;
        int i=1;
        while(i!=position && n.right!=null){
            i++;
            n=n.right;
        }
        Node node=new Node(t);
        node.right=n.right;
        node.left=n;
        n.right=node;
    }

    void print(){
        Node n=head;
        while(n.right!=null){
            System.out.println(n.right.t);
            n=n.right;
        }
    }
}
