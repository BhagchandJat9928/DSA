/* package codechef; // don't place package name! */

import java.util.*;



/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
         	Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    boolean inValid=false;
		    Map<String,Integer> map=new HashMap<>();
		    int j=1;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
				if(arr[i]>n){
					inValid=true;
				}
		        if(map.get(String.valueOf(arr[i]))==null){
		            map.put(String.valueOf(arr[i]),j);
		            
		              j++;
		        }
		        
		    }
		    
		    if(inValid){
		        System.out.println("-1");
		    }else{
		    for(int i=0;i<n;i++){
		    System.out.print(map.get(String.valueOf(arr[i]))+" ");
			}
			System.out.println();
		    }
		  
		}
	}
}
