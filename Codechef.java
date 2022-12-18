
import java.util.*;

public class Codechef {
    public static void main(String[] args) {
        BufferReader br=new BufferReader(new InputStreamReader(System.in));
	    long mod=(long)Math.pow(10,9)+7;
		int test=Integer.parseInt(br.readLine());
		while(test-->0){
		    int n=Integer.parseInt(br.readLine());
		    int[] arr=br.readLine();
		    long count=0;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		           int val=Integer.parseInt(arr[i])|Integer.parseInt(arr[j]);
		           int newval=(Integer.parseInt(arr[i])^Integer.parseInt(arr[j])) +Integer.parseInt(arr[j]);
                   if(val==newval) count++;
		        }
		        count%=mod;
		        
		    }
		    
		   System.out.println(count);
		}
        }

    }