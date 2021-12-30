package DataStructures._06_linkedlists;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int numberOfItems;

    @Override
    public void insert(T data) {
        if(root == null) {
            root = new Node<T>(data);
        } else {
            insertBeginning(data);
        }
    }

    @Override
    public void remove(T data) {

        if(root == null)
            return;

        if(root.getData().compareTo(data) == 0) {
            root = root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }

    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        while (actualNode != null) {
            if(actualNode.getData().compareTo(data) == 0) {
                numberOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public void traverse() {
        if(root == null)
            return;

        Node<T> actualNode = root;

        while (actualNode != null) {
            System.out.print(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return numberOfItems;
    }

    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    private void insertEnd(T data, Node<T> node) {

        if(node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<T>(data);
            node.setNextNode(newNode);
        }

    }
}
