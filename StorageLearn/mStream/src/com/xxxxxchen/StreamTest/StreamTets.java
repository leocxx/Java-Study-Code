package com.xxxxxchen.StreamTest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTets {
    public static void main(String[] args) {
        ArrayList<String> manlist = new ArrayList<>();
        manlist.add("胡歌");
        manlist.add("张国立");
        manlist.add("彭于晏");
        manlist.add("刘华强");
        manlist.add("郑伊健");

        ArrayList<String> womanlist = new ArrayList<>();
        womanlist.add("杨紫");
        womanlist.add("刘亦菲");
        womanlist.add("唐嫣");
        womanlist.add("杨幂");
        womanlist.add("高圆圆");

        Stream<String> stream1 = manlist.stream().filter(name -> name.length() == 3).limit(3);
        Stream<String> stream2 = womanlist.stream().filter(name -> name.startsWith("杨")).skip(1);

        Stream.concat(stream1, stream2).forEach(name ->{
            Actor actor = new Actor(name);
            System.out.println(actor);
        });
    }
}
