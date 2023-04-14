package com.chen.list;

import java.util.ArrayList;

public class AddAll {
    public static void main(String... args) {

        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();

        list.add("1");
        list.add("3");
        list2.add("2");
        list2.add("4");

        list.addAll(new ArrayList());
        list.addAll(1, list2);

        list.stream().forEach(i -> System.out.println(i));
    }
}
