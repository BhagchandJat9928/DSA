public class ShortestPath {
    public static void main(String[] args) {
        int[] arr={3,2,4,4};
        System.out.println("b");
    }

    static void Kursgal(int node,TreeNode<Integer> root){
        TreeNode<Integer> origin;

        while(root!=null){
            
        
        if(root.t.equals(node)){
             origin=root;
        }else if(root.left.t.equals(node)){
             origin=root.left;
        }else if(root.right.t.equals(node)){
             origin=root.right;
        }else{
            
            Kursgal(node, root);
        }
    }
             
    }
}
