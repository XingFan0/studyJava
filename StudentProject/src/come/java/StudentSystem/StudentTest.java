package come.java.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("001", "灰灰", 18, "广西");
        Student s2 = new Student("002", "慧慧", 19, "广东");
        Student s3 = new Student("003", "婷婷", 10, "江西");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        menuOperate(students);
    }

    public static void menuOperate(ArrayList<Student> students) {
        System.out.println("------欢迎来到包子学生管理系统------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        selectOperate(select, students);
    }

    public static void selectOperate(int select, ArrayList<Student> students) {
        switch (select) {
            case 1:
                addStudent(students);
                break;
            case 2:
                removeStudent(students);
                break;
            case 3:
                setStudent(students);
                break;
            case 4:
                checkStudent(students);
                break;
            case 5:
                break;
        }
    }

    public static void addStudent(ArrayList<Student> students) {
        ArrayList<Student> newStudent = students;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入id");
        String id = sc.next();
        System.out.println("输入名字");
        String name = sc.next();
        System.out.println("输入年龄");
        int age = sc.nextInt();
        System.out.println("输入地址");
        String address = sc.next();

        Student s = new Student(id, name, age, address);
        newStudent.add(s);

        menuOperate(newStudent);
    }

    public static void removeStudent(ArrayList<Student> students) {
        ArrayList<Student> newStudent = students;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入删除id");
        String id = sc.next();
        for (int i = 0; i < newStudent.size(); i++) {
            if (newStudent.get(i).getId().equals(id)) {
                newStudent.remove(i);
            }
        }
        menuOperate(newStudent);
    }

    public static void setStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入id");
        String id = sc.next();
        boolean flag=false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                System.out.println("输入名字");
                String name = sc.next();
                System.out.println("输入年龄");
                int age = sc.nextInt();
                System.out.println("输入地址");
                String address = sc.next();
                students.get(i).setName(name);
                students.get(i).setAge(age);
                students.get(i).setAddress(address);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("学生不存在");
        }

        menuOperate(students);

    }

    public static void checkStudent(ArrayList<Student> students) {
        System.out.println("查询学生");
        System.out.println("id " + "姓名 " + "年龄 " + "家庭住址");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getId() + " " + students.get(i).getName() + " " + students.get(i).getAge() + " " + students.get(i).getAddress());
        }
        menuOperate(students);
    }
}
