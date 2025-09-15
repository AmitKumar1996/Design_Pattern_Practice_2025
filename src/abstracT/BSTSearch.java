package abstracT;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTSearch {
    public boolean searchBST(TreeNode root, int target) {
        if (root == null) {
            return false; // target not found
        }

        if (root.val == target) {
            return true; // found the target
        } else if (target < root.val) {
            return searchBST(root.left, target); // search in left subtree
        } else {
            return searchBST(root.right, target); // search in right subtree
        }
    }

    public static void main(String[] args) {
        // Example tree:
        //       5
        //     /   \
        //    2     6

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        BSTSearch bst = new BSTSearch();

        int target = 2;
        System.out.println(bst.searchBST(root, target)); // true

        target = 4;
        System.out.println(bst.searchBST(root, target)); // false
    }
}
