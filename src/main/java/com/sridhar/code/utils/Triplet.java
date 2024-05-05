package com.sridhar.code.utils;


public class Triplet<A, B, C> {
    A node;
    B level;
    C distance;

    public A getNode() {
        return node;
    }

    public B getLevel() {
        return level;
    }

    public C getDistance() {
        return distance;
    }

    public Triplet(A node, B level, C distance) {
        this.node = node;
        this.level = level;
        this.distance = distance;
    }

    public static <A,B,C> Triplet<A,B,C>of(A node, B level, C distance) {
        return new Triplet<>(node, level, distance);
    }
}