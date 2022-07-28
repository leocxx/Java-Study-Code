package com.chen.classloader;

public class ClassLoaderDemo2 {
    public static void main(String[] args) {
        //获取系统类加载器getSystemClassLoader()
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取系统类加载器的父加载器getParent()   ---平台类加载器
        ClassLoader classLoader1 = systemClassLoader.getParent();
        //获取系平台类加载器的父加载器getParent()   ---启动类加载器
        ClassLoader classLoader2 = classLoader1.getParent();

        System.out.println(systemClassLoader);
        //jdk.internal.loader.ClassLoaders$AppClassLoader@2437c6dc
        System.out.println(classLoader1);
        //jdk.internal.loader.ClassLoaders$PlatformClassLoader@880ec60
        System.out.println(classLoader2);
        //null
    }
}
