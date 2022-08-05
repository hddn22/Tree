package ebyte.space;

public class Node {
    private final int value;
    private final int index;
    private Node left;
    private Node right;
    private Node parent;
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node(int value, int index) {
        this.value = value;
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
