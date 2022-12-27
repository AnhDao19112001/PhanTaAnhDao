//package caseStudy.Utils;
//
//
//import caseStudy.Models.Customer;
//
//import java.io.*;
//import java.util.LinkedList;
//import java.util.List;
//
//public class ReadWriteCustomerFileUtils {
//    private static List<String> readFile(String path) {
//        List<String> stringList = new LinkedList<>();
//        String line;
//        try {
//            File file = new File(path);
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while ((line = bufferedReader.readLine()) != null) {
//                stringList.add(line);
//            }
//
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return stringList;
//    }
//
//    public static List<Customer> readCustomerFile(String path) {
//        List<String> stringList = readFile(path);
//        List<Customer> customerList = new LinkedList<>();
//        String[] info;
//        for (String line : stringList) {
//            info = line.split(",");
//            if (info.length == 9) {
//                customerList.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
//            }
//        }
//
//        return customerList;
//    }
//
//    private static void writeFile(String path, String data) {
//        try {
//            File file = new File(path);
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(data);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeCustomerFile(String path, List<Customer> customers) {
//        StringBuilder data = new StringBuilder();
//        for (Customer customer : customers) {
//            data.append(customer.getInfo());
//        }
//
//        writeFile(path, data.toString());
//    }
//}
