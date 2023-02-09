package CaseStudyTrinh.Util;

import CaseStudyTrinh.Model.CustomerManager;
import case_study.Model.CustomerModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileCustomer {
    public static List<CustomerManager> readFile(String path){
        List<CustomerManager> customerManagers = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                String [] item;
                while ((line = bufferedReader.readLine()) != null){
                    item = line.split(",");
                    String name = item[0];
                    String dayOfBirth = item[1];
                    String gender = item[2];
                    int idCardPerson = Integer.parseInt(item[3]);
                    String phoneNumber = item[4];
                    String email = item[5];
                    int customerID = Integer.parseInt(item[6]);
                    String typeOfGuest = item[7];
                    String address = item[8];
                    CustomerManager customerManager = new CustomerManager(name,dayOfBirth,gender,idCardPerson,phoneNumber,email,customerID,typeOfGuest,address);
                    customerManagers.add(customerManager);
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
        return customerManagers;
    }
    public static void writeFile(String path, List<CustomerManager> customerManagerList){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try{
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CustomerManager customer: customerManagerList) {
                bufferedWriter.write(customer.convertLine());
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
