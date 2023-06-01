package TreeTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        // create a tree
        TreeNode binarytree = new TreeNode(6); // root
        binarytree.left = new TreeNode(2);
        binarytree.left.left = new TreeNode(1);
        binarytree.left.right=new TreeNode(4);
        binarytree.left.right.left = new TreeNode(3);
        binarytree.left.right.right = new TreeNode(5);
        binarytree.right = new TreeNode(7);
        binarytree.right.right = new TreeNode(9);
        binarytree.right.right.left=new TreeNode(8);
        System.out.println("BFS:");
        BFS(binarytree);
        List<Integer> result = new LinkedList<>();

        System.out.println();
        System.out.println("Inorder:");
        Inorder(binarytree, result);
        System.out.println(result);
        System.out.println();
        result.clear();

        System.out.println("Preorder:");
        Preorder(binarytree, result);
        System.out.println(result);
        System.out.println();
        result.clear();

        System.out.println("Postorder:");
        Postorder(binarytree, result);
        System.out.println(result);
    }
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
