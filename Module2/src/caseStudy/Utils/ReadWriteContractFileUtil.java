package caseStudy.Utils;

import caseStudy.Models.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReadWriteContractFileUtil {
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

//            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static Queue<Contract> readContractFile(String path) {
        List<String> stringList = readFile(path);
        Queue<Contract> contractList = new LinkedList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 5) {
                contractList.add(new Contract(info[0], info[1], info[2], info[3], info[4]));
            }
        }

        return contractList;
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

    public static void writeContractFile(String path, Queue<Contract> contractList) {
        StringBuilder data = new StringBuilder();
        for (Contract contract : contractList) {
            data.append(contract.getInfo());
        }

        writeFile(path, data.toString());
    }
}
