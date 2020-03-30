package code.design_pattern.creational.Prototype;

import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Students students = new Students();
        students.addStudents();

        //Use the clone method to get the Students object
        Students studentNew = (Students) students.clone();
        Students studentNew1 = (Students) students.clone();
        List<String> studentNewList = studentNew.getStudentsList();
        studentNewList.add("Jos");
        List<String> studentNewList1 = studentNew1.getStudentsList();
        studentNewList1.remove("Krishty");

        System.out.println("students List: " + students.getStudentsList());
        System.out.println("studentNew List: " + studentNewList);
        System.out.println("studentNew1 List: " + studentNewList1);
    }
}
