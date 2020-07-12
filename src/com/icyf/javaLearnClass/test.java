package com.icyf.javaLearnClass;

/**
 * @Author: ESy
 * @Date: 2020/5/24 16:31
 */
public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(10);
//        System.out.println(student.getAge());
        student.show();

        Person stu1 = new Student();
        stu1.show();

        ClassStaticCount c1 = new ClassStaticCount();
        ClassStaticCount c2 = new ClassStaticCount();
        ClassStaticCount c3 = new ClassStaticCount();
        ClassStaticCount c4 = new ClassStaticCount();
        ClassStaticCount c5 = new ClassStaticCount();
        ClassStaticCount c6 = new ClassStaticCount();

        ClassStaticCount.show(); //ClassStaticCount被调用了6次

        System.out.println(args); //[Ljava.lang.String;@1540e19d
        for (String arg : args) System.out.println(arg); //(空）

        haha(stu1);


    }

    public static void haha(Person p){
        p.show();
    }
}
