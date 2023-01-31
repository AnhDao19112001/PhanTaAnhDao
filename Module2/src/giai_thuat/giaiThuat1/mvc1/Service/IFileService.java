package giai_thuat.giaiThuat1.mvc1.Service;

//import Module.Teacher;

import giai_thuat.giaiThuat1.mvc1.Module.Teacher;

import java.util.List;

public interface IFileService {
    List<Teacher> readFile(String path);
    void writeFlie(String path,List<Teacher> teachers);
}
