package DesignPatterns._01_solid._04_interfacesegregationprinciple.ex_1;

public class App {
    public static void main(String[] args) {

        Tree tree = new BalancedTree();

        tree.insert();
        tree.delete();
        tree.traverse();
//        tree.leftRotation();
//        tree.rightRotation();

    }
}
