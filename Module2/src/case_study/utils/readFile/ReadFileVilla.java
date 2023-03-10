package case_study.utils.readFile;

import case_study.model.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileVilla {
    public static Map<Villa, Integer> readFileVilla(String path){
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        if (file.exists()){
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] array = line.split(",");
                    Villa villa = new Villa(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),array[4],array[5],array[6],Double.parseDouble(array[7]),array[8]);
                    villaIntegerMap.put(villa,0);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return villaIntegerMap;
    }

}
