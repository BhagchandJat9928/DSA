
public class UserQueue{
    public static void main(String[] args) {
       /*  Integer[] arr=new Integer[5];
        Queue<Integer> queue=new Queue<>(arr);
        queue.enque(5);
        queue.enque(7);
        
        queue.deque();
        queue.print();
        queue.deque();
        queue.deque();
        queue.print(); */

        LQueue<Integer> lQueue=new LQueue<>();
        lQueue.deque();
        lQueue.enque(17);
        lQueue.enque(19);
        lQueue.enque(34);
        lQueue.deque();
        lQueue.enque(98);
        lQueue.print();

        

    }
}

// Using Array
class Queue<T>{
    T[] data;
    int front,rear;
    int length;
    public Queue(T[] data) {
        this.data = data;
        front=0;
        rear=-1;
        length=this.data.length;
    }

    void enque(T data){
        if(length-1>=rear){
            rear+=1;
            this.data[rear]=data;
        }else{
            System.out.println("Queue is full");
        }

       
      
    }

    T deque(){
        T val=null;
        if( !isEmpty()){
         val=data[front];
        data[front]=null;
        front+=1;
        
        }else{
            front=0;
            rear=-1;
            System.out.println("Queue is empty");
        }
       

        return val;
    }

    boolean isEmpty(){
        if(front>rear){
          return true;
        }else{
            return false;
        }
    }

    void print(){
        int i=front;
        while(i<=rear && !isEmpty()){
          System.out.print(data[i]+" ");
          i++;
        }
        System.out.println();
    }

    
}


//Using LinkedList
class LQueue<T>{
ListLinked<T> front;
ListLinked<T> rear;

public LQueue() {
    front=new ListLinked<>();
    rear=front;
}

void enque(T data){
        rear.insertAtLast(data);
     
}

T deque(){
    T x=null;
    if(front.isEmpty()){
        System.out.println("Queue is Empty");
        
     }else{
        x=front.deleteAtFront();
     }
     return x;
}

void print(){
    front.print();
}


}