package com.chen.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Fliter {
    public static void main(String... args) {
        ArrayList<Map<String, String>> list = new ArrayList();
        HashMap<String, String> map1 = new HashMap();
        map1.put("key1", "asd");
        map1.put("key2", "k2");
        map1.put("key3", "k3");
        map1.put("key4", "k4");
        list.add(map1);

        HashMap<String, String> map2 = new HashMap();
        map2.put("key1", "k11");
        map2.put("key2", "k22");
        map2.put("key3", "k33");
        map2.put("key4", "k44");
        list.add(map2);

        HashMap<String, String> map3 = new HashMap();
        map3.put("key1", "k11");
        map3.put("key2", "k223");
        map3.put("key3", "k33");
        map3.put("key4", "k44");
        list.add(map3);

        list = (ArrayList<Map<String, String>>)list.stream().filter(item ->
                "k111".equals(item.get("key1"))
         ).collect(Collectors.toList());

        list.forEach(item -> System.out.println(item.get("key2")));
        System.out.println(list.isEmpty());

    }
}
