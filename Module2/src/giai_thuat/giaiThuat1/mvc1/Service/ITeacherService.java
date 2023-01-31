package giai_thuat.giaiThuat1.mvc1.Service;

import giai_thuat.giaiThuat1.mvc1.Module.Teacher;

import java.util.List;

public interface ITeacherService<Teacher>{
    List<Teacher> getList() ;
    List<Teacher> add();
}
