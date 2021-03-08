package binarySearchTrees;

/**
 * @author Mohammed Amr
 * @created 08/03/2021 - 22:30
 * @project think-data-structures
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data) {

        if (root == null)
            this.root = new TreeNode(data);
        else root.insert(data);
    }

    public TreeNode find(Integer data) {

        if (root != null)
            return root.find(data);
        
        return null;
    }

    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if (current == null)
            return;

        while (current != null && current.getData() != data) {
            parent = current;

            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if (current == null)
            return;

        // Checking if the node that is about to be deleted is a Leaf Node
        if (current.getLeftChild() == null && current.getRightChild() == null)
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild)
                    parent.setLeftChild(null);
                else
                    parent.setRightChild(null);
            }
    }
}
