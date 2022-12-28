package caseStudy.Utils;

import caseStudy.Models.Facility;
import caseStudy.Models.Room;
import caseStudy.Models.Villa;

import java.io.*;
import java.util.*;

public class ReadWriteFacilityFileUtil {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            //bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static Map<Facility, Integer> readFacilityFile(String path) {
        List<String> stringList = readFile(path);
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 10) {
                facilityList.put(new Villa(info[0],
                                info[1],
                                Double.parseDouble(info[2]),
                                Integer.parseInt(info[3]),
                                Integer.parseInt(info[4]),
                                info[5],
                                info[6],
                                Double.parseDouble(info[7]),
                                Integer.parseInt(info[8])),
                        Integer.parseInt(info[9]));
            } else if (info.length == 8) {
                facilityList.put(new Room(info[0],
                                info[1],
                                Double.parseDouble(info[2]),
                                Integer.parseInt(info[3]),
                                Integer.parseInt(info[4]),
                                info[5],
                                info[6]),
                        Integer.parseInt(info[7]));
            }
        }

        return facilityList;
    }

    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFacilityFile(String path, Map<Facility, Integer> facilityList) {
        StringBuilder data = new StringBuilder();
        Set<Facility> keys = facilityList.keySet();
        for (Facility key : keys) {
            data.append(key.getInfo()).append(",").append(facilityList.get(key)).append("\n");
        }

        writeFile(path, data.toString());
    }
}
