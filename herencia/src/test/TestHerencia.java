package test;

import clases.Teacher;

public class TestHerencia {
    public static void main(String[] args) {
        // Person teacher = new Teacher();
        Teacher teacher = new Teacher();
        teacher.setName("Eloy");
        teacher.setAge(41);
        teacher.setSalary(12000);
        System.out.println(teacher);
        System.out.println(teacher.showInformation());
    }
}
