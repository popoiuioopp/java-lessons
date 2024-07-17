package com.example.lesson12;

public class Main {
    public static void main(String[] args) {
        System.out.println("===1===");
        IX ix = new C(1);
        B b = new B(3);
        System.out.println(ix);
        System.out.println(b);
        ix.foo(b);
        System.out.println(ix);

        System.out.println("===2===");
        b = new B(5);
        C c = new C(3);
        b.foo(c);
        System.out.println(b);

        System.out.println("===3===");
        c = new C(1);
        c.bar();
        System.out.println(c);

        System.out.println("===4===");
        b = new B(5);
        b.bar();
        System.out.println(b);
    }
}
