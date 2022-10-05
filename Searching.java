class Searching{
    public static void main(String[] args) {
        int[] arr={4,6,8,9,11,54,76,90};
        BinarySearch(arr, 76, 0, arr.length);
    }

    static void LinearSearch(int[] arr,int key){
        String result="UnSuccessful";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                result="Successful";
                break;
            }
           
        }
        System.out.println(result);
    }

    static void BinarySearch(int[] arr,int key,int start,int end){
        if(start!=end  ){
        int mid=(start+end)/2; 

       if(arr[mid]==key){
           System.out.println("successful");
       }else if( arr[mid]>key && arr[mid+1]>=key){
        end=mid;
        BinarySearch(arr, key, start, end);
       }else if( arr[mid]<key && arr[mid-1]<=key){
        start=mid+1;
        BinarySearch(arr, key, start, end);
       }else{
        System.out.println("Unsuccessful");
       }

    }else{
        System.out.println("Unsuccessful");
    }
}
}