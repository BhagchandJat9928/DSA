import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        //here
        int[] arr={34,12,45,7,5,6,23,90,1,4,5,};
        QuickSort(arr, 0, 1, arr.length-1);
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

        
        
        while(start<arr.length && end>pivot && arr[pivot]>=arr[start] || arr[pivot]<=arr[end]  ){
           
            if(arr[pivot]>arr[start]){
                start++;
            }
            if(arr[pivot]<arr[end]){
                end--;
            }
            System.out.println(start+ " "+end+" "+pivot);
        }

        if(start>=end && end>pivot){
            int temp=arr[pivot];
            arr[pivot]=arr[end];
            arr[end]=temp; 
            pivot=end; 
            System.out.println(start+ " "+end+" "+pivot);
            QuickSort(arr,0 , 1, pivot-1); 
            QuickSort(arr,pivot+1 , pivot+2, end);
        }else if(start>=end && end==pivot){
            int temp=arr[pivot];
            arr[pivot]=arr[start];
            arr[start]=temp; 
        }else if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            System.out.println(start+ " "+end+" "+pivot);
            if(start!=arr.length-1 || end!=0){
                QuickSort(arr, pivot, start, end);
            }
        }
    }
}

