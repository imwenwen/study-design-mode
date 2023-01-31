package cn.imwenwen;

import java.io.File;

/**
 * @author: Imwenwen
 * @description: TODO
 * @date: 2022/12/16 10:55
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
//        A abcd = new A();
//        A ab = new B();
//        ab = new B();
//        B abc=new B();
        System.out.println(100+'1');
        System.out.println(100+"1");

    }
}

class A {
    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A {
    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}


