package com.binarySearchTree.data;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class BinarySearchTree<E extends Comparable<E>> {

    private Comparable<E> myData;
    private BinarySearchTree<E> left;
    private BinarySearchTree<E> right;

}
