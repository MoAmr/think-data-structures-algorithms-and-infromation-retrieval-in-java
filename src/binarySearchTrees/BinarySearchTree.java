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

    }
}
