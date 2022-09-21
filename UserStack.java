import java.util.Arrays;

public class UserStack {
    
    public static void main(String[] args) {
        

        stack<Integer> sta=new stack<>();

        sta.push(1);
        sta.push(8);
        sta.push(4);
        sta.push(6);
        System.out.println(sta.getTop());
        System.out.println(sta.elementAt(1));
        System.out.println(sta.pop());
        System.out.println(sta.elementAt(sta.getTop()));
        System.out.println(sta);


        
    }

    

}
class stack<T>{

    T[] st;
    int top;
    int length;
    stack(){ 
        Object[] obj={};
        st=(T[]) obj;
       length=0;
        top=-1;
        
     }

     stack(T[] data){ 
        st=data;
        length=st.length;
        top=st.length-1;

    }

   

    public int getTop() {
        return top;
    }


    public int getLength() {
        return length;
    }


    T pop(){
        T data=null;
        if(top>-1){
        data=st[top];
        top-=1;
      st= Arrays.copyOf(st, length-1);
        length=st.length;
        }else{
            System.out.println("st is empty");
        }
        return data;
    }

     T push(T data){
         top+=1;
          st=  Arrays.copyOf(st, length+1);
          length=st.length;
        st[top]=data;
        
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

    @Override
    public String toString() {
        return "stack [st=" + Arrays.toString(st) + "]";
    }

    

}
