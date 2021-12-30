package DesignPatterns._01_solid._04_interfacesegregationprinciple.ex_1;

public class BinarySearchTree implements Tree{
    @Override
    public void insert() {
        System.out.println("Inserting a new item...");
    }

    @Override
    public void delete() {
        System.out.println("Removing a given item...");
    }

    @Override
    public void traverse() {
        System.out.println("In-order traversal in O(N)...");
    }
}
