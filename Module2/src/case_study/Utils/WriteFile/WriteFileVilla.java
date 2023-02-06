package case_study.Utils.WriteFile;

import case_study.Model.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileVilla {
    public static void writeFileVilla(String path, Map<Villa, Integer> villaIntegerMap){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> entry: villaIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().convertLine()+ "," + entry.getValue());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
