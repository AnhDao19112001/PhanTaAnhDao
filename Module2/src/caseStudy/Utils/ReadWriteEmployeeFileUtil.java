package caseStudy.Utils;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteEmployeeFileUtil {

    public static List<String> readFile(String path) {
        List<String> stringList = new LinkedList<>();
        String line = "";
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    private static void writeFile(String path, String data) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
