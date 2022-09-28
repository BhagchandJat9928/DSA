import java.util.Arrays;

public class HeapTree{
    public static void main(String[] args) {
        
        MinHeapTree<Integer> min=new MinHeapTree<>(new Integer[10], 20);

        //Find minimum three values 
        int[] ar={6,12,4,34,2,3,35};
        for(int i=0;i<ar.length;i++){
            min.insert(ar[i]);
        }
       min.heapify(0);
        min.print();
        int[] minthree={min.remove(),min.remove(),min.remove()};
        System.out.println(Arrays.toString(minthree));
       
    }
}

class MinHeapTree<T extends Comparable<T>> {
    T[] heap;
    int maxSize;
    int size;
   static final int FRONT=0;
    MinHeapTree(T[] arr,T node){
       maxSize=arr.length;
       heap=arr;
       size=0;
       heap[0]=node;
    }

    int parent(int pos){
        
        if(pos%2==0){
            return pos/2-1;
        }else {
            return pos/2;
        }
        
    }

    int leftChild(int pos){
        if(pos==0){
            return 1;
        }
        return 2*pos+1;
    }

    int rightChild(int pos){
        if(pos==0){
            return 2;
        }
        return 2*pos+2;
    }

    boolean isleaf(int pos){
       
      if(pos<size/2+1){
        return false;
      }
        return true;
         
     }
 

    void swap(int pos1,int pos2){
            T temp=heap[pos1];
            heap[pos1]=heap[pos2];
            heap[pos2]=temp;
    }

    void print(){
        int i=0;
        while(i<=(size/3+1)){
            System.out.println("parent : "+ heap[i] +" LeftChild : "+heap[leftChild(i)]+" RightChild : "+heap[rightChild(i)]);
       i++;
        }

       
    }

    T remove(){
          T pop=heap[FRONT];
          heap[FRONT]=heap[size];
          heap[size--]=null;
          heapify(FRONT);
          return pop;
    }

    void insert(T data){
       
       if(size>=maxSize){
        return ;
       }
        heap[++size]=data;
        int current=size;
        while(current>=1 && heap[current].compareTo(heap[parent(current)])<0 ){
             swap(current, parent(current));
             current=parent(current);
        }
    }

    void heapify(int position){
        if(!isleaf(position) &&( heap[position].compareTo(heap[leftChild(position)])>0 ||
        heap[position].compareTo(heap[rightChild(position)])>0)){
           
            if(heap[rightChild(position)]!=null &&heap[rightChild(position)].compareTo(heap[leftChild(position)])<0){
                
                swap(rightChild(position), position);
                
             /*    if(rightChild(leftChild(position))<size/2+1 || leftChild(leftChild(position)) <size/2+1){
                    if(heap[rightChild(leftChild(position))]!=null &&
                     heap[rightChild(leftChild(position))].compareTo(heap[leftChild(leftChild(position))])<0 &&
                     heap[rightChild(leftChild(position))].compareTo(heap[rightChild(position)])<0 ){
                        swap(rightChild(leftChild(position)), rightChild(position));
                     }else 
                     if(  heap[leftChild(leftChild(position))].compareTo(heap[rightChild(position)])<0){
                        swap(leftChild(leftChild(position)), rightChild(position));
                     }

                } */

                heapify(rightChild(position));
            }else{
                swap(leftChild(position), position);
                
/* 
                if(rightChild(rightChild(position))<size/2+1 || leftChild(rightChild(position)) <size/2+1){
                    if(heap[rightChild(rightChild(position))]!=null &&
                     heap[rightChild(rightChild(position))].compareTo(heap[leftChild(rightChild(position))])<0 &&
                     heap[rightChild(rightChild(position))].compareTo(heap[rightChild(position)])<0 ){
                        swap(rightChild(rightChild(position)), rightChild(position));
                     }else 
                     if(  heap[leftChild(rightChild(position))].compareTo(heap[rightChild(position)])<0){
                        swap(leftChild(rightChild(position)), rightChild(position));
                     }
            } */
            
            heapify(leftChild(position));
              
        }

}
}
class MaxHeap<T extends Comparable<T>>{
    
    T[] heap;
    int size;
    private static final int FRONT = 0;
    int maxSize;

    MaxHeap(T[] arr,T node){
        maxSize=arr.length;
        heap=arr;
        size=0;
        heap[size]=node;

    }

    int parent(int pos){
        
        if(pos%2==0){
            return pos/2-1;
        }else {
            return pos/2;
        }
        
    }

    int leftChild(int pos){
        if(pos==0){
            return 1;
        }
        return 2*pos+1;
    }

    int rightChild(int pos){
        if(pos==0){
            return 2;
        }
        return 2*pos+2;
    }

    void swap(int pos1,int pos2){
            T temp=heap[pos1];
            heap[pos1]=heap[pos2];
            heap[pos2]=temp;
    }

    boolean isleaf(int pos){
       return pos<= (size-2);
        
    }

    void print(){
        int i=0;
        while(i<=(size/3+1) ){
            System.out.println("parent : "+ heap[i] +" LeftChild : "+heap[leftChild(i)]+" RightChild : "+heap[rightChild(i)]);
       i++;
        }

       
    }

    void insert(T data){
       
       if(size>=maxSize){
        return ;
       }
        heap[++size]=data;
        int current=size;
        while( current>=1 && heap[current].compareTo(heap[parent(current)])>0   ){
             swap(current, parent(current));
             current=parent(current);
        }
        
        
    }

    T remove(){
        T pop=heap[FRONT];
        heap[FRONT]=heap[size--];
        heapify(FRONT);
        return pop;
  }
  
    void heapify(int position){
        if(!isleaf(position) &&(heap[position].compareTo(heap[leftChild(position)])<0 ||
        heap[position].compareTo(heap[rightChild(position)])<0)){
            if(heap[rightChild(position)].compareTo(heap[leftChild(position)])<0){
                swap(leftChild(position), position);
                heapify(leftChild(position));
            }else{
                swap(rightChild(position), position);
                heapify(rightChild(position));
            }

        }
    }
    
}
}

