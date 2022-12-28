package caseStudy.Utils;

import caseStudy.Models.Booking;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadWriteBookingFileUtil {
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
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static TreeSet<Booking> readBookingFile(String path) {
        List<String> stringList = readFile(path);
        TreeSet<Booking> bookingList = new TreeSet<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 6) {
                bookingList.add(new Booking(info[0], info[1], info[2], info[3], info[4], info[5]));
            }
        }
        return bookingList;
    }
    private static void writeFile(String path, String data){
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
    public static void writeBookingFile(String path, TreeSet<Booking> bookingList){
        StringBuilder data = new StringBuilder();
        for (Booking booking : bookingList){
            data.append(booking.getInfo);
        }
        writeFile(path, data.toString());
    }
}
