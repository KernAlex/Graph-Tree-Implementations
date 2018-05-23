public class BinaryTree<E> implements Tree<E> {
    private BinaryTree left;
    private BinaryTree right;
    private E item;

    /**
     * Just a basic tree, no items yet.
     * @param item
     */
    public BinaryTree(E item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }
    /**
     * Adds trees on the left and right
     */
    public BinaryTree(E item, BinaryTree l, BinaryTree r) {
        this.item = item;
        this.left = l;
        this.right = r;
    }
    /**
     * More or less to check if the Tree is null or not
     * @param t must be a binary tree
     * @return
     */
    public boolean isTree(Tree t) {
        if(t == null) {
            return false;
        } else if (!t.getClass().isInstance(new BinaryTree<>(null))) {
            return false;
        }
        return true;
    }
    /**
     * Get item on left
     */
    public BinaryTree getLeft() {
        return left;
    }

    /**
     * @return item on the right;
     */
    public BinaryTree getRight() {
        return right;
    }
    /**
     * return item
     */
    public E getItem() {
        return item;
    }
}
