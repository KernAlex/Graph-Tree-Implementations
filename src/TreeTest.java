import GraphAndTrees.BinaryTree;
import static org.junit.Assert.*;

import GraphAndTrees.TreeSet;
import org.junit.Test;

import java.util.Random;

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
    @Test
    public void treeSetTests() {
        Random rand = new Random();
        TreeSet<Integer> temp = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            temp.put(rand.nextInt(1000));
        }
        temp.printInOrder();
        temp = new TreeSet<>();
        int[] t  = {10, 5, 15, 7, 12, 4, 16};
        for (int i : t) {
            temp.put(i);
        }
        temp.printInOrder();
        assertEquals(true, temp.has(4));
        assertEquals(false,temp.has(2));
        assertEquals(7, temp.getSize());
    }
}
