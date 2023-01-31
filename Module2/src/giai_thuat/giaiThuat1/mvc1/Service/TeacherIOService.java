package giai_thuat.giaiThuat1.mvc1.Service;

import giai_thuat.giaiThuat1.mvc1.Module.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherIOService implements IFileService{

    @Override
    public List<Teacher> readFile(String path)  { // readFile là phải có list<>
        File file = new File(path);
        List<Teacher> teachers = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] te = line.split(",");
                Teacher teacher = new Teacher(te[0], te[1], te[2], te[3], te[4], te[5]);
                teachers.add(teacher);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return teachers;
    }

    @Override
    public void writeFlie(String path, List<Teacher> teachers) { // fileWrite dùng vòng lặp
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher1: teachers) {
                bufferedWriter.write(teacher1.formatCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
