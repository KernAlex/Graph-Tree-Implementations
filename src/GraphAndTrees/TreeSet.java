package GraphAndTrees;

public class TreeSet<E extends Comparable<E>> {
    private int size;
    private BinaryTree sentinal;

    public TreeSet() {
        size = 0;
        sentinal = null;
    }
    public TreeSet(E item) {
        sentinal.setLeft(new BinaryTree(item));
        size = 1;
    }
    public void put(E item) {
        if (size == 0) {
            sentinal.setLeft(new BinaryTree(item));
            return;
        }
        BinaryTree t = sentinal.getLeft();
        putHelp(t, item);
    }
    private void putHelp(BinaryTree t, E item) {
        if (t.getItem().compareTo(item) == 0) {
            size = 1;
            return;
        }
        if (t.getItem().compareTo(item) < 0) {
            if (t.getLeft() == null) {
                t.setLeft(new BinaryTree(item));
                size += 1;
                return;
            } else {
                putHelp(t.getLeft(), item);
                return;
            }
        } else {
            if (t.getRight() == null) {
                t.setRight(new BinaryTree(item));
                size += 1;
                return;
            } else {
                putHelp(t.getRight(), item);
                return;
            }
        }
    }
}
