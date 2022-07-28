package com.chen.reflectdemo5;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取一个类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //2.利用加载器加载某一个资源文件
        //参数就是文件路径
        //返回值是字节流
        InputStream is = classLoader.getResourceAsStream("prop.properties");
        //创建properties对象
        Properties prop = new Properties();
        prop.load(is);
        //System.out.println(prop);
        //释放资源
        is.close();

        //利用反射创建对象并且调用方法
        Class aClass = Class.forName(prop.getProperty("className"));
        //获取构造器对象
        Constructor constructor = aClass.getConstructor();
        //利用构造器创建对象
        Object o = constructor.newInstance();
        //获取对象方法
        Method method = aClass.getMethod(prop.getProperty("methodName"));
        //运行方法
        method.invoke(o);

    }
}
