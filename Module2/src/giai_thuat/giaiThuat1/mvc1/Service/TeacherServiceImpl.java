package giai_thuat.giaiThuat1.mvc1.Service;

import giai_thuat.giaiThuat1.mvc1.Module.Teacher;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService<Teacher>{
    public static final String PATH_NAME = "D:\\Codegym\\Module2\\src\\giai_thuat\\giaiThuat1\\mvc1\\Data\\teacher.csv";
    public final IFileService iFileService = new TeacherIOService();

    @Override
    public List<Teacher> getList() {
        List<Teacher> teachers = iFileService.readFile(PATH_NAME);
        return iFileService.readFile(PATH_NAME);
    }

    @Override
    public List<Teacher> add() {
        return null;
    }
}
