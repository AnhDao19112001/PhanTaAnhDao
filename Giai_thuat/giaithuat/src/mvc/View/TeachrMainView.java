package View;

import Controller.TeacherController;
import Module.Teacher;

import javax.swing.text.View;
import java.util.List;
import java.util.Scanner;

public class TeachrMainView {
    public final TeacherController teacherController = new TeacherController();
    public void display(){
        int option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Hiển thị danh sách");
            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    List<Teacher> teachers = teacherController.getList();
                    for (Teacher teacher : teachers){
                        System.out.println(teacher);
                    }
                    break;
            }
        }while (true);
    }

    public static void main(String[] args) {
       TeachrMainView teachrMainView = new TeachrMainView();
       teachrMainView.display();
    }
}
