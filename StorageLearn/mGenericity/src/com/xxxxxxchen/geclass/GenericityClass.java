package com.xxxxxxchen.geclass;

public class GenericityClass {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setElement("cx");
        String element1 = box1.getElement();
        System.out.println(element1);

        Box<Integer> box2 = new Box<>();
        box2.setElement(14);
        Integer element2 = box2.getElement();
        System.out.println(element2);
    }
}
