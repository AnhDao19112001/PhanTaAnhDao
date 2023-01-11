package Service;

import Module.Teacher;

import java.util.List;

public interface IFileService {
    List<Teacher> readFile(String path);
    void writeFlie(String path,List<Teacher> teachers);
}
