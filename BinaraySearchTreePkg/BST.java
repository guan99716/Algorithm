package BinaraySearchTreePkg;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {
    public static void main(String[] args) {
        int[] arr = {5,7,1,15,9,2,14,8,3};
        TreeNode bstTree = null;
        for(int i:arr) {
           bstTree = treeInsert(bstTree, new TreeNode(i));
        }
        BFS(bstTree);

        System.out.println();
        System.out.println("Inorder:");
        List<Integer> result = new LinkedList<>();
        Inorder(bstTree,result);
        System.out.println(result);

        // check if 7 is in tree
        TreeNode searchPostion;
        searchPostion = SearchTreeNode(bstTree,7);
        System.out.println(searchPostion != null); // true: in tree, false: not in tree

    }
    public static TreeNode treeInsert(TreeNode root, TreeNode z){
        TreeNode y = null;
        TreeNode x = root;
        while(x!=null){
            y = x;
            if(z.val < x.val){x=x.left;}
            else{x=x.right;}
        }
        if(y==null){root=z;}
        else if(z.val<y.val){y.left=z;}
        else{y.right=z;}
        return root;
    }
    public static TreeNode SearchTreeNode(TreeNode root, int key){
        if (root == null || root.val == key){return root;}
        if(key<root.val){return SearchTreeNode(root.left,key);}
        else{return SearchTreeNode(root.right,key);}
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
    public static void Inorder(TreeNode root, List<Integer> result){
        if(root==null){return;}
        Inorder(root.left,result);
        result.add(root.val);
        Inorder(root.right,result);
    }
    
    public static void Preorder(TreeNode root, List<Integer> result){
        if(root==null){return;}
        result.add(root.val);
        Preorder(root.left,result);
        Preorder(root.right,result);

    }
    public static void Postorder(TreeNode root, List<Integer> result){
        if(root==null){return;}
        Postorder(root.left,result);
        Postorder(root.right,result);
        result.add(root.val);
    }
}
