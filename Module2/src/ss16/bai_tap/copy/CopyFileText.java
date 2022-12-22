package ss16.bai_tap.copy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        String line;
        int sum = 0;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Số kí tự có trong file: " + sum);
        return list;
    }
    public static void writeFile(String path, List<String> list) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String sourcePath = "D:\\Codegym\\Module2\\src\\ss16\\bai_tap\\copy\\source_file.csv";
        String targetPath = "D:\\Codegym\\Module2\\src\\ss16\\bai_tap\\copy\\target_file.csv";
        CopyFileText.writeFile(targetPath, CopyFileText.readFile(sourcePath));
    }
    }

