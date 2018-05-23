public class Heap<E> implements Tree<E> {
    private E item;
    private Heap left;
    private Heap right;
    public Heap(E item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }
    public boolean isTree(Tree t) {
        if(t == null) {
            return false;
        } else if (!t.getClass().isInstance(new Heap<>(null))) {
            return false;
        }
        return true;
    }

    /**
     * Returns item;
     * @return
     */
    @Override
    public E getItem() {
        return item;
    }
}
