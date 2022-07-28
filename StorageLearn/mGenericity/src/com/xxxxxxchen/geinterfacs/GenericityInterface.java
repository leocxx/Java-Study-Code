package com.xxxxxxchen.geinterfacs;

public class GenericityInterface {
    public static void main(String[] args) {
        genericityIPL1<String> genericity = new genericityIPL1<>();
        genericity.method("cx");

        genericityIPL2 genericity2 = new genericityIPL2();
        genericity2.method(14);
    }
}
interface Genericity<E>{
    public abstract void method(E e);
}

class genericityIPL2 implements Genericity<Integer>{
    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}



class genericityIPL1<E> implements Genericity<E>{
    @Override
    public void method(E e) {
        System.out.println(e );
    }
}
