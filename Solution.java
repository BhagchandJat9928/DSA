import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
    QuickSort(arr, 1, arr.size()-1, 0);
                 int result=(arr.size()+1)/2;

                 System.out.println(arr.toString());
                 return arr.get(result-1);
                 

    }
    
    static void QuickSort(List<Integer> arr,int pivot,int start,int end){
        if(end-pivot<=0  || pivot==end ){
            return  ;
        }
         
            while(start<end && arr.get(pivot)>arr.get(start)) start++;
            

             while(end>pivot && arr.get(pivot)<arr.get(end)) end--;
             

       if(start<end){
        int val=arr.get(start);
        arr.set(start, arr.get(end));
       arr.set(end, val);
      
           QuickSort(arr,pivot, start, end);
           
       }


       if(start>=end){
        int val=arr.get(start);
        int data=arr.get(end);
        arr.set(start, arr.get(end));
       arr.set(end, val);
       
           QuickSort(arr, pivot,pivot+1, end-1);
    
           QuickSort(arr, end+1, end+2,arr.size()-1);
          
           
       }

       
     
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
       
 try (Scanner in = new Scanner(System.in)) {
    int n = in.nextInt();

    List<Integer> arr =new ArrayList<>();
    for(int i=0;i<n;i++){
        int data=in.nextInt();
        arr.add(data);
    }

    int result = Result.findMedian(arr);
    System.out.println(result);
}

       
    }
}

