/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			 Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
			int[] arr=new int[n];
			PriorityQueue<Integer> a=new PriorityQueue<>();
			PriorityQueue<Integer> b=new PriorityQueue<>();
			
			
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
               
				if(i%2==0){
					a.add(arr[i]);
				}else{
					b.add(arr[i]);
				}
					}	
			
		
             int w=a.remove(),d=b.remove();
			 int x=1,y=1;
			 int p=1,q=1;
			 int ares=-1,bres=0;
			while(!a.isEmpty() || !b.isEmpty()){
				if(!a.isEmpty()){

					int aem=a.remove();
				 
				if(w==aem ){
					x++;
				}else{
					if(x>y){
						y=x;
						 ares = w;
					}
					w=aem;
					x=1;
				}
				}
				
				if(!b.isEmpty()){
					int bem= b.remove();
					if(  d==bem){
						p++;
					}else{
						if(p>q){
							q=p;
							bres=d;
						}
						d=bem;
						p=1;
					}
				}	
			}

			if(ares!=bres){
				int res=arr.length-y-q;
				System.out.println(res);
			}else{
				int re=arr.length-(arr.length/2)+y-q;
				System.out.println(re);
			}
			
			
		}
	}
		}
	

	
	

