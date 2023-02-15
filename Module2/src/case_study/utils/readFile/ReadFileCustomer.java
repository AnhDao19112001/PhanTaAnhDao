package case_study.Utils.ReadFile;

import case_study.Model.CustomerModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCustomer {
    public static List<CustomerModel> readFileCustomer(String path){
        List<CustomerModel> customerModels = new ArrayList<>();
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
                    String dOB = item[1];
                    String gender = item[2];
                    String idCard = item[3];
                    String phoneNumber = item[4];
                    String email = item[5];
                    String customerCode = item[6];
                    String typeOfGuest = item[7];
                    String address = item[8];
                    CustomerModel customerModel = new CustomerModel(name,dOB,gender,idCard,phoneNumber,email,customerCode,typeOfGuest,address);
                    customerModels.add(customerModel);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return customerModels;
    }
}
