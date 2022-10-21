
import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        while(test-->0){
            int len=in.nextInt();
            int[] arr=new int[len];
            for(int j=0;j<len;j++){
                arr[j]=in.nextInt();
            }
           int result=arr[0];
            int sum=0;
            int i=0;
            int val=0;
            while(i<len){
                if(result==arr[i] ){
                    result=0;
                }else {
                    result=1;
                }
                if(result==1) sum++;
                val=i;
             while(i<len && arr[i]==arr[i+1]){
                 i++;
             }
             if(val!=i){
                result=arr[i];
                i--;
             }
             
                
            }
            
            System.out.println(sum);
           
        }
           
        
    }
}
