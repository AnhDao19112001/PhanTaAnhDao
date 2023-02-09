package giai_thuat.giaiThuat1.mvc1.Controller;



import giai_thuat.giaiThuat1.mvc1.Module.Teacher;
import giai_thuat.giaiThuat1.mvc1.Service.TeacherServiceImpl;

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
    public List<Teacher> add() {

        return null;
    }
}
