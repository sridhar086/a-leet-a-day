package com.sridhar.code.library.medium.tree;

public class Pair<T, P> {
    T left;
    P right;

    public Pair(T left, P right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public P getRight() {
        return right;
    }

    public void setRight(P right) {
        this.right = right;
    }


}
