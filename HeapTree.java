public class HeapTree {
    public static void main(String[] args) {
        int[] arr={10,20,30}
        MinHeapTree<Integer> min=new MinHeapTree<>(new Integer[3], arr[0]);


        //Find minimum three values 
      //  int[] ar={6,12,4,34,2,3,35};
        for(int i=1;i<arr.length;i++){
            min.insert(ar[i]);
        }
       min.heapify(0);
     /*   while(min.size>0){
            int a=min.remove();
            int b=min.remove();
            min.insert(a+b);
            min.heapify(0);
       }
       System.out.println(min.remove()); */
       min.print();
       /*  
        int[] minthree={min.remove(),min.remove(),min.remove()};
        System.out.println(Arrays.toString(minthree)); */
       
    }
}

class MinHeapTree<T extends Comparable<T>> {
    T[] heap;
    int maxSize;
    int size;
    static final int FRONT = 0;

    MinHeapTree(T[] arr, T node) {
        maxSize = arr.length;
        heap = arr;
        size = 0;
        heap[0] = node;
    }

    int parent(int pos) {

        if (pos % 2 == 0) {
            return pos / 2 - 1;
        } else {
            return pos / 2;
        }

    }

    int leftChild(int pos) {
        if (pos == 0) {
            return 1;
        }
        return 2 * pos + 1;
    }

    int rightChild(int pos) {
        if (pos == 0) {
            return 2;
        }
        return 2 * pos + 2;
    }

    boolean isleaf(int pos) {

        if (pos < size / 2 + 1) {
            return false;
        }
        return true;

    }

    void swap(int pos1, int pos2) {
        T temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }

    void print() {
        int i = 0;
        while (i <= (size / 3 + 1)) {
            System.out.println("parent : " + heap[i] + " LeftChild : " + heap[leftChild(i)] + " RightChild : "
                    + heap[rightChild(i)]);
            i++;
        }

    }

    T remove() {
        T pop = heap[FRONT];
        heap[FRONT] = heap[size];
        heap[size--] = null;
        heapify(FRONT);
        return pop;
    }

    void insert(T data) {

        if (size >= maxSize) {
            return;
        }
        heap[++size] = data;
        int current = size;
        while (current >= 1 && heap[current].compareTo(heap[parent(current)]) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    void heapify(int position) {
        if (leftChild(position)<=size && (heap[position].compareTo(heap[leftChild(position)]) > 0 ||
        rightChild(position)<=size &&   heap[position].compareTo(heap[rightChild(position)]) > 0)) {
            if (heap[rightChild(position)] != null
                    && heap[rightChild(position)].compareTo(heap[leftChild(position)]) < 0) {
                swap(rightChild(position), position);
                heapify(rightChild(position));
            } else {
                swap(leftChild(position), position);
                heapify(leftChild(position));

            }

        }
    }

    class MaxHeap<T extends Comparable<T>> {

        T[] heap;
        int size;
        private static final int FRONT = 0;
        int maxSize;

        MaxHeap(T[] arr, T node) {
            maxSize = arr.length;
            heap = arr;
            size = 0;
            heap[size] = node;

        }

        int parent(int pos) {

            if (pos % 2 == 0) {
                return pos / 2 - 1;
            } else {
                return pos / 2;
            }

        }

        int leftChild(int pos) {
            if (pos == 0) {
                return 1;
            }
            return 2 * pos + 1;
        }

        int rightChild(int pos) {
            if (pos == 0) {
                return 2;
            }
            return 2 * pos + 2;
        }

        void swap(int pos1, int pos2) {
            T temp = heap[pos1];
            heap[pos1] = heap[pos2];
            heap[pos2] = temp;
        }

        boolean isleaf(int pos) {
            return pos <= (size - 2);

        }

        void print() {
            int i = 0;
            while (i <= (size / 3 + 1)) {
                System.out.println("parent : " + heap[i] + " LeftChild : " + heap[leftChild(i)] + " RightChild : "
                        + heap[rightChild(i)]);
                i++;
            }

        }

        void insert(T data) {

            if (size >= maxSize) {
                return;
            }
            heap[++size] = data;
            int current = size;
            while (current >= 1 && heap[current].compareTo(heap[parent(current)]) > 0) {
                swap(current, parent(current));
                current = parent(current);
            }

        }

        T remove() {
            T pop = heap[FRONT];
            heap[FRONT] = heap[size--];
            heapify(FRONT);
            return pop;
        }

        void heapify(int position) {
            if ( leftChild(position)<=size && (heap[position].compareTo(heap[leftChild(position)]) < 0 ||
            rightChild(position)<=size   heap[position].compareTo(heap[rightChild(position)]) < 0)) {
                if (heap[rightChild(position)].compareTo(heap[leftChild(position)]) < 0) {
                    swap(leftChild(position), position);
                    heapify(leftChild(position));
                } else {
                    swap(rightChild(position), position);
                    heapify(rightChild(position));
                }

            }
        }

    }
}
