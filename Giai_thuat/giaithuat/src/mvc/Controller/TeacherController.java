package Controller;

import Module.Teacher;
import Service.TeacherIOService;
import Service.TeacherServiceImpl;

import java.util.List;

public class TeacherController {
    public final TeacherServiceImpl teacherService = new TeacherServiceImpl();
    public List<Teacher> getList(){
        try {
            return teacherService.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
