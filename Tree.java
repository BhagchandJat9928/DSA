public class Tree {
    public static void main(String[] args) {
        TreeNode<Integer> bst=new TreeNode<>();
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(25);
        bst.insert(7);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.search(25);
        System.out.println(bst.delete(bst, 5).t);
        
        bst.search(5);
        
    }
}

  
    class TreeNode<T extends Comparable<T>>{
        T t;
        TreeNode<T> left;
        TreeNode<T> right;
        public TreeNode() {
            this.t=null;
            this.left=null;
            this.right=null;
        }
        public TreeNode(T t) {
            this.t=t;
            this.left=null;
            this.right=null;
            

        }

        

    void insert(T data){
            if(t==null){
                t=data;
            }else if(data.compareTo(t)>0 ){
            if(right==null){
                right=new TreeNode<>(data);
            }else{
                right.insert(data);
            }
       }else if(data.compareTo(t)<0 ){
        if(left==null){
            left=new TreeNode<>(data);
        }else{
            left.insert(data);
        }
       }
             
    }

    void search(T data){
       
        if(data.compareTo(t)>0){
           if(right==null){
              System.out.println(data+ "  not found");
           }else{
            System.out.print("right ");
            right.search(data);
           }
        }else if(data.compareTo(t)<0){
             if(left==null){
                System.out.println(data+" not found");
             }else{
                System.out.print("left ");
                left.search(data);
             }
        }else{
            System.out.println(data+" Found");
        }
       
        
    }


    TreeNode<T> delete(TreeNode<T> root,T key){
        if(root==null) return root;

        if(root.t.compareTo(key)>0){
            
          root.left=delete(root.left, key);
        }else if(root.t.compareTo(key)<0){
            root.right=delete(root.right, key); 
        }else{
            TreeNode<T> next=root;
            if(next.right!=null){
                root=next.right;
            }else{
                root=next.left;
            }
            
            while(root.left!=null){
                
                root=root.left;
            }
            root.left=next.left;
        
        }
       
        return root;
    }

    
}
