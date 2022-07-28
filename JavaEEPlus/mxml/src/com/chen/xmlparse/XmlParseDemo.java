package com.chen.xmlparse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*利用DOM4J解析xml文件*/
public class XmlParseDemo {
    public static void main(String[] args) throws DocumentException {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用SAXReader把xml文档加载到内存中去，返回一个文档对象
        Document document = saxReader.read(new File("mxml\\xml\\Student.xml"));
        //3.获取到根标签
        Element rootElement = document.getRootElement();
        //4.通过根标签获取elements
        /*List list = rootElement.elements();//空参会带所有的子标签
        System.out.println(list.size());//3*/
        ArrayList<Student> list = new ArrayList<>();
        List<Element> studentelements = rootElement.elements("student");
        //5.遍历集合得到每一个student标签
        for (Element element : studentelements) {
            //element表示每一个student标签
            //a.获取id属性
            Attribute attribute = element.attribute("id");
            //b.获取id的属性值
            String id = attribute.getValue();
            //c.获取子标签
            Element nameelement = element.element("name");
            //d.获取标签体
            String name = nameelement.getText();

            Element ageelement = element.element("age");
            String age = ageelement.getText();

           /* System.out.println(id);
            System.out.println(name);
            System.out.println(age);*/
            Student stu = new Student(id,name,Integer.parseInt(age));

            list.add(stu);
        }
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
