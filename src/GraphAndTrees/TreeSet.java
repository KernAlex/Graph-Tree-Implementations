package GraphAndTrees;

public class TreeSet<E extends Comparable<E>> {
    private int size;
    private BinaryTree sentinal;

    public TreeSet() {
        size = 0;
        sentinal = new BinaryTree(null);
    }
    public TreeSet(E item) {
        sentinal = new BinaryTree(null);
        sentinal.setLeft(new BinaryTree(item));
        size = 1;
    }

    /**
     * adds items to the key
     * @param item
     */
    public void put(E item) {
        if (size == 0) {
            sentinal.setLeft(new BinaryTree(item));
            size = 1;
            return;
        }
        BinaryTree t = sentinal.getLeft();
        putHelp(t, item);
    }
    private void putHelp(BinaryTree t, E item) {
        if (t.getItem().compareTo(item) == 0) {
            return;
        }
        if (t.getItem().compareTo(item) > 0) {
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
    public boolean has(E item) {
        if (size == 0) {
            return false;
        }
        BinaryTree t = sentinal.getLeft();
        return hasHelper(t, item);
    }
    private boolean hasHelper(BinaryTree t, E item) {
        if (t.getItem().compareTo(item) == 0) {
            return true;
        }if (t.getItem().compareTo(item) > 0) {
            if (t.getLeft() == null) {
                return false;
            } else {
                return hasHelper(t.getLeft(), item);
            }
        } else {
            if (t.getRight() == null) {
                return false;
            } else {
                return hasHelper(t.getRight(), item);
            }
        }
    }
    public int getSize(){
        return size;
    }
    public void printInOrder() {
        if (size == 0) {
            return;
        }
        BinaryTree t = sentinal.getLeft();
        pIOH(t);
    }
    private void pIOH(BinaryTree t) {
        if (t == null) {
            return;
        }
        System.out.println(t.getItem());
        BinaryTree t1 = t.getLeft();
        pIOH(t1);
        BinaryTree t2 = t.getRight();
        pIOH(t2);
    }
    public void printMid() {
        if (size == 0) {
            return;
        }
        BinaryTree t = sentinal.getLeft();
        pMH(t);
        System.out.println("");
    }
    private void pMH(BinaryTree t) {
        if (t == null) {
            return;
        }
        BinaryTree t1 = t.getLeft();
        pMH(t1);
        System.out.print(t.getItem() + " ");
        BinaryTree t2 = t.getRight();
        pMH(t2);
    }
}
