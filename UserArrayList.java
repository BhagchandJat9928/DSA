import java.util.ArrayList;
import java.util.Arrays;

public class UserArrayList {
    public static void main(String[] args) {
       
       
        
         arrayList<Integer> li=new arrayList<>();
         System.out.println(li.size());
        li.add(7);
        System.out.println(li.toString());
         
         li.addAt(2, 5);
         li.add(4);
         li.add(9);
        
        System.out.println("hello"+li.toString());
    }
}

class arrayList<T>{
   
     Object[] list={};
     arrayList(){ 
     }
     arrayList(T[] list){
          this.list=list;
     }

     

     public int size() {
        return list.length;
    }
   
    void add(T data){
            list=copyof(list, list.length+1);
      
        
        list[list.length-1]=data;
     }

     void addAt(int position, T data){
        if(list[0]!=null){
            list=copyof(list, list.length+1);
        }
        int i=list.length-1;
        while(i>=position){
           list[i]=list[i-1];
           --i;
        }
        list[position-1]=data;
     }

     Object[] copyof(Object[] original,int newlength){
        Object[] newlist=new Object[newlength];
        int i=0;
        while(i<(newlength-1)){
            newlist[i]=original[i];
            ++i;
        }
        return newlist;
     }

    @Override
    public String toString() {
        return "arrayList [list=" + Arrays.toString(list) + "]";
    }

     
}
