package com.example.lesson12;

public class A implements IX {
    private int v;

    public A(int vVal) {
        this.v = vVal;
    }

    public A() {
        this(6);
    }

    public int getV() {
        return v;
    }

    public String toString() {
        return Integer.toString(v);
    }

    public void foo(A a) {
        v += 2 * a.getV();
    }

    public void foo(B b) {
        v -= b.getV();
    }
}
