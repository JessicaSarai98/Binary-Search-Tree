package com.binarySearchTree.data;

public interface ITree<E extends Comparable<? super E>>{

    public int size();
    public boolean add(E obj);
    public boolean contains(E obj);
}
