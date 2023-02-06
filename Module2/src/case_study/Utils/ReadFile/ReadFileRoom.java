package case_study.Utils.ReadFile;

import case_study.Model.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileRoom {
    public static Map<Room, Integer> readFileRoom(String path){
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        if (file.exists()){
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] array = line.split(",");
                    Room room = new Room(array[0],array[1],Double.parseDouble(array[2]),Double.parseDouble(array[3]),array[4],array[5],array[6]);
                    roomIntegerMap.put(room,0);
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
        return roomIntegerMap;
    }
}
