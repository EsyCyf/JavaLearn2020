package com.icyfLambdaLearn.Demo10;

/**
 * @Author: ESy
 * @Date: 2020/6/2 15:10
 * 引用构造器 类名::new
 */
public class StudentDemo {
    public static void main(String[] args) {

        useStudentBuilder((name,age) -> new Student(name,age));

        useStudentBuilder(Student::new);
        //lambda表达式被构造器替代时，他的形参全部传递给构造器
    }


    private static void useStudentBuilder(StudentBuilder s){
        Student student = s.studentBuild("假按揭啊",11 );
        System.out.println(student.getName()+" "+student.getAge());
    }
}
