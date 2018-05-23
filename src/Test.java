public class Test {
    public static void main(String[] args) {
        BinaryTree<Integer> temp = new BinaryTree<>(5, new BinaryTree(4), new BinaryTree(6));
        Heap<Integer> theap = new Heap<>(5);
        System.out.println(temp.getRight().getItem());
    }
}
