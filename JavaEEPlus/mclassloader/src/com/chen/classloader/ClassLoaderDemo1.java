package com.chen.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderDemo1 {
    public static void main(String[] args) throws IOException {
        //ClassLoader getSystemClassloader()  获取一个类加载器
        //InputStream getResourceAsStream(String name)   加载某一个资源文件

        //1.获取一个类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //2.利用加载器加载某一个资源文件
        //参数就是文件路径
        //返回值是字节流
        InputStream is = classLoader.getResourceAsStream("prop.properties");
        //创建properties对象
        Properties prop = new Properties();
        prop.load(is);
        System.out.println(prop);
        //这里打的就是prop.properties配置里面的内容
        //释放资源
        is.close();
    }
}
