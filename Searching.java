class Searching{
    public static void main(String[] args) {
        int[] arr={4,6,7,8,9,11,54,76,90};
        System.out.println( LinearSearch(arr, 3));
       
    }

    static String LinearSearch(int[] arr,int key){
       int i=0;
       while(i<arr.length && arr[i]!=key){
        i++;
       } 
        
       if(i<arr.length) return "Found";
       else return "Not Found";

    }

    static String  BinarySearch(int[] arr,int key,int start,int end){
        
        int mid=(start+end)/2;
        if(arr[mid]==key) return "Found";
        if(start -end==0) return "Not Found";
        if(arr[mid]>key) return BinarySearch(arr, key, start, mid-1);
        else return BinarySearch(arr, key, mid+1, end);
       
}
}