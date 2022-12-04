import java.util.ArrayList;
import java.util.Arrays;



public class SortMethod {
    public static void main(String[] args) {
      

        int[] arr={5 ,9 ,1, 10, 12, 4};
    QuickSort(arr,0,1, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        int i=0;
         while (i<arr.length){
            for(int j=0;j<arr.length-1;j++){ 
                 if(arr[j]>(arr[j+1])){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                      arr[j+1]=temp;
                 }
            }
            i++;
         }
       
    }

    static void InsertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            while(j>=0 && arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                      arr[j]=temp;
               j--;
            }
        }

    }

    public static void SelectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=i;
            while(j<arr.length){
               
                if(arr[k]>arr[j]){
                    k=j;
                }
                j++;
            }
           int temp=arr[i];
           arr[i]=arr[k];
           arr[k]=temp;
           
        }
    }

    static void QuickSort(int[] arr,int pivot,int start,int end){
        if(end-pivot<=0  || pivot==end ){
            return ;
        }
         
            while(start<end && arr[pivot]>arr[start]) start++;
            

             while(end>pivot && arr[pivot]<arr[end]) end--;
             

       if(start<end){
        
       swap(arr, start, end);
      
           QuickSort(arr,pivot, start, end);
           
       }


       if(start>=end){
      
        swap(arr, pivot, end);
       
           QuickSort(arr, pivot,pivot+1, end-1);
    
           QuickSort(arr, end+1, end+2,arr.length-1);
          

       }

       
     
    }
/* 
    static void QuickSort(int[] arr,int s ,int l,int r){
        if(r-l<=0) return;
        int start=l+1;
        for(int next=start;next<r;next++){
            if(arr[next]<=arr[l]){
                swap(arr, start, next);
                start++;
            }
        }
        swap(arr, l, start-1);
        QuickSort(arr, l, start);
        QuickSort(arr, start+1, r);
    }
 */
    static void MergeSort(int[] arr,int start,int end){
        if(end-start==1 && arr[start]>arr[end]){
             swap(arr, start, end);
            
            }
       
        if(end-start>1){
            int mid=(start+end)/2;
           
            MergeSort(arr, start, mid);
            MergeSort(arr, mid+1, end);
            merge(arr,start,Arrays.copyOfRange(arr, start, mid+1),Arrays.copyOfRange(arr,mid+1,end+1));
            
        }
       

    }

  static void  merge(int[] arr,int start,int[] startarr,int[] endarr){

    int i=0;
    int j=0;
    int k=start;
      while(i<startarr.length && endarr.length>j){
        
        if(startarr[i]>endarr[j]){
            arr[k]=endarr[j];
            j++;
        }else {
            arr[k]=startarr[i];
            i++;
        }
        
        k++;
      }
      

      if(i<startarr.length){
        while(i<startarr.length){
            arr[k]=startarr[i];
            i++;
            k++;
        }
      }
      if(j<endarr.length){
        while(j<endarr.length){
            arr[k]=endarr[j];
            j++;
            k++;
        }
      }

   
  }

    static void swap(int[] arr ,int first,int second){
         int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
    }

    static int[] RadixSort(int[] arr){
        ArrayList<Integer>[] list=new  ArrayList[arr.length];
        for(int i=0;i<String.valueOf(arr[0]).length();i++){
            for(int j=0;j<arr.length;j++){
                int val=Integer.parseInt(String.valueOf(String.valueOf(arr[i]).charAt(i)));
                System.out.print(arr[j]);
                list[val].add(arr[j]);
            }
            int size=0;
        for(int k=0;k<arr.length;k++){
            
            while(! list[k].isEmpty()){
                     arr[size++]=list[k].remove(0);
            }
        }
        }
        return arr;
    }
}

