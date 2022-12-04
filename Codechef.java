import java.util.Stack;

public class Codechef {
    public static void main(String[] args) {
      /*   Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            long n = in.nextLong();
            long[] arr  = new long[(int) n];

            for(long i=0;i<n;i++){
                arr[(int) i]=in.nextLong();
            }

            long j=0;
            long result=0;
            while(j<n){
                if(j>0 && arr[(int) j]<arr[(int) (j-1)]){
                    result++;
                     arr[(int)j]=(long) Math.pow(arr[(int)j], 2);
                }

                if(j<n-1 && arr[(int) j]>arr[(int) (j+1)]){
                    result++;
                    arr[(int)j]=(long) Math.floor(Math.sqrt(arr[(int)j]));
               }
                j++;
            }
          
            System.out.println(result);
            
            } */
find("{(})");

        }

        static void find(String s){
             String result="true";
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='{' || s.charAt(i)=='('){
                    stack.push(s.charAt(i));
                }else if((stack.peek()=='{' && s.charAt(i)==')' ) ||
                (stack.peek()=='(' && s.charAt(i)=='}') ){
                   Math.floor(i);
                  
                    result="false";
                    break;
                }else{
                    stack.pop();
                }
            }
            if(!stack.empty()){
                result="false";
            }
            System.out.println(result);
        }
}
