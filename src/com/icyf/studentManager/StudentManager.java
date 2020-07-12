package com.icyf.studentManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: ESy
 * @Date: 2020/5/25 20:01
 */
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>() ;
        while (true){
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line){
                case "1":
                    addStudent(arrayList);
                    break;

                case "2":
                    delStudent(arrayList);
                    break;

                case "3":
                    updateStudent(arrayList);
                    break;

                case "4":
                    showAllStudent(arrayList);
                    break;

                case "5":
                    System.out.println("谢谢使用");
                    return;

                default:
                    System.out.println("请输入正确的数字");

            }


        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sid = sc.nextLine();
        for (Student student:arr){
            if (student.getSid().equals(sid)){
                System.out.println("该学号已经被占用");
                return;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String add = sc.nextLine();

        Student student = new Student(sid,name,age,add);
        arr.add(student);
        System.out.println("添加成功");

    }


    //删除学生
    public static void delStudent(ArrayList<Student> arr){
        if (arr.isEmpty()){
            System.out.println("无学生信息");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除学生的学号");
        String sid = sc.nextLine();
        for (Student student : arr){
            if (student.getSid().equals(sid)){
                arr.remove(student);
                System.out.println("删除学生成功");
                break;
            }
        }
        System.out.println("无此学生");

    }


    //更改学生
    public static void updateStudent(ArrayList<Student> arr){
        if (arr.isEmpty()){
            System.out.println("无学生信息");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid = sc.nextLine();
        for (int i = 0;i<arr.size();i++){
            Student student = arr.get(i);
            if (student.getSid().equals(sid)){
                System.out.println("学号："+student.getSid());
                System.out.println("姓名："+student.getName());
                System.out.println("年龄："+student.getAge());
                System.out.println("地址："+student.getAddress());
                System.out.println("");

                System.out.println("请输入更改的学生姓名");
//                String name = sc.nextLine();
                student.setName(sc.nextLine());

                System.out.println("请输入更改的学生年龄");
//                String age = sc.nextLine();
                student.setAge(sc.nextLine());

                System.out.println("请输入更改的学生居住地");
//                String add = sc.nextLine();
                student.setAddress(sc.nextLine());

                arr.set(i,student);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("无此学生");

    }


    //查看所有学生信息
    public static void showAllStudent(ArrayList<Student> arr){
        if (arr.isEmpty()){
            System.out.println("学生信息为空");
        }else {
            for (Student student:arr){
                System.out.print("学号："+student.getSid()+"\t");
                System.out.print("姓名："+student.getName()+"\t");
                System.out.print("年龄："+student.getAge()+"\t");
                System.out.print("地址："+student.getAddress()+"\n");
            }
        }

    }






}
