public class Test {
    public static void main(String[] args) {
        BinaryTree<Integer> temp = new BinaryTree<>(5);
        temp.put(3);
        temp.put(7);
        temp.put(4);
        temp.put(6);
        Heap<Integer> theap = new Heap<>(5);
        System.out.println(temp.getLeft().getRight().getItem());
        System.out.println(temp.hasItem(5));
        System.out.println(temp.hasItem(3));
        System.out.println(temp.hasItem(7));
        System.out.println(temp.hasItem(4));
        System.out.println(temp.hasItem(6));
        System.out.println(temp.hasItem(10));
        System.out.println(temp.getSize());
    }
}
