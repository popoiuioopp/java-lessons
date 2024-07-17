package com.example.lesson12;

// B is a better A
public class B extends A {
    
    private int v;

    public B(int vVal) {
        this.v = vVal;
    }

    public B() {
        this(4);
    }

    public int getV() {
        return v;
    }

    public String toString() {
        return super.toString() + " " + Integer.toString(v);
    }
    
    public void foo(A a) {
        v += a.getV();
    }

    public void bar() {
        foo(this);
    }
}
