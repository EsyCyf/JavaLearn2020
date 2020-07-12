package com.icyfReflect.Demo01;

/**
 * @Author: ESy
 * @Date: 2020/6/2 23:22
 *
 * 这里我们提供三种方式获取Class类型的对象
 * 使用类的class属性来获取该类对应的Class对象。 举例: Student.class将 会返回Student类对应的Class对象
 *
 * 调用对象的getClass()方法,返回该对象所属类对应的Class对象
 * 该方法是Object类中的方法，所有的Java对象都可以调用该方法
 *
 * 使用Class类中的静态方法forName(StringclassName),该方法需要传入字符串参数,该字符串参数的值是某
 * 个类的全路径，也就是完整包名的路径
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1); //class com.icyfReflect.Demo01.Student

        Class<Student> c2 = Student.class;
        System.out.println(c1==c2); //true
        System.out.println("--------------------");

        //调用对象的getClass()方法,返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1==c3); //true
        System.out.println("--------------------");

        //使用Class类中的静态方法forName(StringclassName)
        Class<?> c4 = Class.forName("com.icyfReflect.Demo01.Student");
        System.out.println(c1==c4); //true


    }
}
