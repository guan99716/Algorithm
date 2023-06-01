package TreeTraversalPkg;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class TreeTraversal {

    public static void BFS(TreeNode root){
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll(); // pop from head(i.e. dequeue)
            System.out.print(node.val + " ");
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
    }
        public static void Inorder(TreeNode root,List<Integer> result){
        if(root==null){return;}
        Inorder(root.left,result);
        result.add(root.val);
        Inorder(root.right,result);
    }

//    public static void Inorder(TreeTraversal.TreeNode root){
//        if(root==null){return;}
//        System.out.print(root.val + " ");
//        Inorder(root.left);
//        Inorder(root.right);
//    }



    public static void Preorder(TreeNode root,List<Integer> result){
        if(root==null){return;}
        result.add(root.val);
        Preorder(root.left,result);
        Preorder(root.right,result);

    }
    public static void Postorder(TreeNode root,List<Integer> result){
        if(root==null){return;}
        Postorder(root.left,result);
        Postorder(root.right,result);
        result.add(root.val);
    }
}