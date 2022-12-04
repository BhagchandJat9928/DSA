import java.util.Arrays;
import java.util.Scanner;

public class CircularString {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
           int test=sc.nextInt();
           while(test-->0){
             String s1=sc.next();
             String s2=sc.next();
             String x=subStringOfS2(s2,s1);
             String result=s1+x;
             char[] arr=result.toCharArray();
             Arrays.sort(arr);
             StringBuilder s=new StringBuilder();

             for(int i=arr.length-1;i>=0;i--){
               s.append(arr[i]);
             }
           
             
             System.out.println(s.toString());

           }
        }
    }

    private static String subStringOfS2(String s2,String s1) {
       int i=0;
       boolean isString=true;
       StringBuilder sd=new StringBuilder();
       StringBuilder st=new StringBuilder();
        while(i<s2.length()){
        
         if(!s1.contains(s2.substring(i, i+1))){
            st.append(s2.charAt(i));
            if(isString){
                sd.append(s2.charAt(i));
            }
            
         }else{
            isString=false;
            st.delete(0, st.length());
         }
         
            i++;
        }
        st.append(sd.toString());
    
        return st.toString();
    }
    
}
