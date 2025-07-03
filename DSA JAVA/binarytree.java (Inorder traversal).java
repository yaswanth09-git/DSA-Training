import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}
class BinaryTree{
    TreeNode root;
    BinaryTree() {
        root = null;
    }
    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.println("Inorder traversal: ");
        tree.inorder(tree.root);
    }
}