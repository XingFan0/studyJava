package com.java.demo.Test7;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stArr = new Student[3];

        Student st1 = new Student("001", "张三", 18);
        Student st2 = new Student("002", "李四", 19);
        Student st3 = new Student("003", "王五", 20);

        stArr[0] = st1;
        stArr[1] = st2;
        stArr[2] = st3;

        //要求：添加一个新的对象到数组当中
        Student st4 = new Student("004", "钱六", 21);
        boolean flag = contains(stArr, st4.getId());
        if (flag) {
            System.out.println("学生已存在");
            printStudent(stArr);
        } else {
            int count = getCount(stArr);
            if (count == stArr.length) {
                System.out.println("数组已经存满,修改数组长度");
                //创建新的数组
                Student[] arr = createNewArr(stArr);
                arr[count] = st4;
                printStudent(arr);
            } else {
                stArr[count] = st4;
                printStudent(stArr);
            }
        }

        //要求删除根据id删除学生对象
        Scanner sc = new Scanner(System.in);
        boolean flag2 = contains(stArr, "001");
        if (!flag2) {
            System.out.println("删除的学生不存在");
        } else {
            System.out.println("删除后的学生数组==========");
            Student[] beforeDeleteArr = deleteStudent(stArr,"001");
            printStudent(beforeDeleteArr);
        }
    }

    public static boolean contains(Student[] arr, String id) {

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            Student st = arr[i];
            if (st.getId() == id) {
                return true;
            }
        }
        return flag;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printStudent(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student st = arr[i];
            if (st != null) {
                System.out.println(st.getId() + "," + st.getName() + "," + st.getAge());
            }

        }
    }

    public static Student[] deleteStudent(Student[] arr, String id) {
        Student[] newArr = new Student[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() != id) {
                newArr[count] = arr[i];
                count++;
            }
        }
        return newArr;
    }

}
