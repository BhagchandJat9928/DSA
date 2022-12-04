
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


class Calculator{
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)){
            String s=in.next();
            System.out.println("Result :-  "+total(s.toCharArray()));
        }
    }

    static double total(char[] arr){
        Deque<Character> s=new ArrayDeque<>();
        stack<Double> result=new stack<>();
        int i=0;
        while(i<arr.length){
            if(arr[i]>= '0' && arr[i]<='9'){
                String r=String.valueOf(arr[i]);
                int j=i+1;
                while(j<arr.length && arr[j]>='0' && arr[j]<='9'){
                    r+=String.valueOf(arr[j]);
                    j++;
                }
                i=j-1;
                System.out.println("Hello "+r);
                result.push(Double.parseDouble(r));
                
            }else{
            if(arr[i]=='('){
                s.addLast(arr[i]);
            }else if(arr[i]==')'){
                 
                  while(s.getLast()!='('){
                  
                    result.push(val(s.removeLast(), result.pop(), result.pop()));
                   
                  }
                  s.removeLast();
            }else if(!s.isEmpty()){
                while(!s.isEmpty() && !persistence(arr[i], s.getLast())){

                result.push(val(s.removeLast(), result.pop(), result.pop()));
                
                
                }
                s.addLast(arr[i]);
              }else{
                s.addLast(arr[i]);
              
            }
        
        }
       i++;
        }

        System.out.println(s.size()+" "+result.length);
        if(s.size()+1==result.length){
            while(!s.isEmpty()){
               
                result.push(val(s.removeLast(),result.pop() , result.pop()));
                System.out.println(result.elementAt(result.length));
            }
            return result.elementAt(result.length);
        }else{
            System.out.println("Please enter operand after operator");
            return -1;
        }
    }

    static boolean persistence(char last,char prev){

        if(last=='+' || last=='-' && prev=='*' || prev=='/' || prev=='^'  ){
            return false;
        }else if((last=='*'  && prev=='^' || prev=='/')  ||( last=='/' && prev=='^')){
            return false;
        }else{
            return true;
        }
    }

    static double val(char c,double b,double a){
        if(c=='+'){
             return a+b;
        }else if(c=='-'){
            return a-b;
        }else if(c=='*'){
            return a*b;
        }else if(c=='/'){
            return a/b;
        }else {
            return Math.pow(a, b);
        }
    }
}