package ss16.bai_tap.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainNation {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file;
        String line;
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Nation> readNationFile(String path) {
        List<String> strings = readFile(path);
        List<Nation> nations = new ArrayList<>();
        String[] information;
        for (String line : strings) {
            information = line.split(",");
            nations.add(new Nation(Integer.parseInt(information[0]), information[1], information[2]));
        }
        return nations;
    }

    public static void main(String[] args) {
        String path = "D:\\Codegym\\Module2\\src\\ss16\\bai_tap\\read\\Nation.csv";
        for (Nation nation : readNationFile(path)) {
            System.out.println(nation);
        }
    }
}
