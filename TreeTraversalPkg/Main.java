package TreeTraversalPkg;

import java.util.LinkedList;
import java.util.List;

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
        TreeTraversal.BFS(binarytree);
        List<Integer> result = new LinkedList<>();

        System.out.println();
        System.out.println("Inorder:");
        TreeTraversal.Inorder(binarytree, result);
        System.out.println(result);
        System.out.println();
        result.clear();

        System.out.println("Preorder:");
        TreeTraversal.Preorder(binarytree, result);
        System.out.println(result);
        System.out.println();
        result.clear();

        System.out.println("Postorder:");
        TreeTraversal.Postorder(binarytree, result);
        System.out.println(result);
    }
}
