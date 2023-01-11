package Service;

import Module.Teacher;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService<Teacher>{
    public static final String PATH_NAME = "D:\\test web\\Luyen_tap_1\\src\\Data\\teacher.csv";
    public final IFileService iFileService = new TeacherIOService();

    @Override
    public List<Teacher> getList() {
        List<Teacher> teachers = iFileService.readFile(PATH_NAME);
        return iFileService.readFile(PATH_NAME);
    }
}
