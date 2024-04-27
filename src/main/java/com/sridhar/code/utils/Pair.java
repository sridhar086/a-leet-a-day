package com.sridhar.code.utils;

public class Pair<T, P> {
    T left;
    P right;

    public T getLeft() {
        return left;
    }

    public P getRight() {
        return right;
    }

    public Pair(T left, P right) {
        this.left = left;
        this.right = right;
    }
    public static <T,P> Pair<T,P> of(T left, P right) {
        return new Pair<>(left, right);
    }
}

class PairCreator<T, P> {

    public static <T,P> Pair<T,P> of(T left, P right) {
        return new Pair<>(left, right);
    }
}
