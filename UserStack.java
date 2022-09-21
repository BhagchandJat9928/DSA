import java.util.Arrays;

public class UserStack {
    
    public static void main(String[] args) {
        

        stack<Integer> sta=new stack<>();

        sta.push(1);
        sta.push(8);
        sta.push(4);
        sta.push(6);
        System.out.println(sta.top());
        System.out.println(sta.elementAt(1));
        System.out.println(sta.pop());
        System.out.println(sta.elementAt(sta.top()));


        
    }

    

}
class stack<T>{

    T[] st= (T[]) new Object[1];

    stack(){  }

    T pop(){
        T data=null;
        if(st.length>0){
        data=st[st.length-1];
      st= Arrays.copyOf(st, st.length-1);
        }else{
            System.out.println("st is empty");
        }
        return data;
    }

     T push(T data){
        if(st[0]!=null){
          st=  Arrays.copyOf(st, st.length+1);
        }
       
        st[st.length-1]=data;
        
        return data;
    }

     boolean empty(){
        
        return st==null;
    }

     T elementAt(int position){
        int i=1;
        T value=null;
           for(T data: st){
            if(position==i){
            value= data;
            }
            ++i;
           }
        return value;
          
    }
    int top(){
        return st.length;
    }

}
