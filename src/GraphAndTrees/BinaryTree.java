package GraphAndTrees;

public class BinaryTree<E extends Comparable<E>> implements Tree<E>{
    private E item;
    private BinaryTree left;
    private BinaryTree right;

    /**
     * Sets the head node of a specific subTree
     * @param item
     */
    public BinaryTree(E item) {

        this.item = item;

        left = null;
        right = null;

    }

    /**
     * gets what is stored in the Tree.
     * @return
     */
    public E getItem() {
        return item;
    }

    /**
     * setLeft and setRight makes items on left and right specific
     * @param t
     */
    public void setLeft(BinaryTree t) {
        this.left = t;
    }
    public void setRight(BinaryTree t) {
        this.right = t;
    }
    /**
     * similar to the set, get retrieves items on left and right
     */
    public BinaryTree getLeft() {
        return left;
    }
    public BinaryTree getRight() {
        return right;
    }
}
