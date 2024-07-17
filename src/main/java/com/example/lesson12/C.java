package com.example.lesson12;

// C is a better B, not a better A
public class C extends B {
    private int v;

    public C(int vVal) {
        v = vVal;
    }

    public C() {
        this(2);
    }

    public int getV() {
        return v;
    }

    public String toString() {
        return super.toString() + " " + Integer.toString(v);
    }
}
