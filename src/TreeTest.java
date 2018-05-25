import GraphAndTrees.BinaryTree;
import static org.junit.Assert.*;
import org.junit.Test;
public class TreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> temp = new BinaryTree<>(5);
        System.out.println(temp.getItem());
    }
    @Test
    public void constTest() {
        BinaryTree<Integer> temp = new BinaryTree<>(5);
        Integer expected = 5;
        assertEquals(expected, temp.getItem());
        assertEquals(null, temp.getLeft());
        assertEquals(null, temp.getRight());
        temp.setLeft(new BinaryTree(3));
        expected = 3;
        assertEquals(expected, temp.getLeft().getItem());
    }
}
