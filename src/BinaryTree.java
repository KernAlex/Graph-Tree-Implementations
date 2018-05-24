public class BinaryTree<E extends Comparable<E>> implements Tree<E> {

    public BinaryTree left;
    public BinaryTree right;
    public E item;

    private int size;
    /**
     * Just a basic tree, no items yet.
     * @param item
     */
    public BinaryTree(E item) {
        this.item = item;
        this.left = null;
        this.right = null;
        this.size = 1;
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

    /**
     * for inputing values
     * @param i
     */
    public void put(E i) {
        size += 1;
        if (i.compareTo(item) < 0) {
            if(isTree(left)) {
                left.put(i);
            } else {
                left = new BinaryTree(i);
            }
        } else {
            if (isTree(right)) {
                right.put(i);
            }
            else right = new BinaryTree(i);
        }
    }

    /**
     * looks for item in tree
     * @param i if tree has item
     * @return
     */
    public boolean hasItem(E i) {
        if (i.equals(item)) {
            return true;
        } else if (i.compareTo(item) < 0) {
            if (isTree(left)) {
                return left.hasItem(i);
            } else {
                return false;
            }
        } else if (true){
            if (isTree(right)) {
                return right.hasItem(i);
            } else {
                return false;
            }
        }
        return false;
    }
    public int getSize() {
        return this.size;
    }
}
