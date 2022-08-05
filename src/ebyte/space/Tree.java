package ebyte.space;

public class Tree {
    private Node root;
    private Node previousNode;

    public void add(int value, int index) {
        Node currentNode = new Node(value, index);
        if (root == null) {
            root = new Node(value, index);
            previousNode = root;
        }

        if(index < root.getIndex() && root.getLeft() == null) {
            root.setLeft(currentNode);
        } else if(index > root.getIndex() && root.getRight() == null) {
            root.setRight(currentNode);
        } else {
            if(index < previousNode.getIndex()) {
                previousNode.setLeft(currentNode);
            } else if(index > previousNode.getIndex()){
                previousNode.setRight(currentNode);
            }
        }
        currentNode.setParent(previousNode);
        previousNode = currentNode;
    }

    public Node search(int index) {
        if (index > root.getIndex()) {
            root = root.getRight();
            search(index);
        } else if (index < root.getIndex()) {
            root = root.getLeft();
            search(index);
        }
        return root;
    }
    

}
