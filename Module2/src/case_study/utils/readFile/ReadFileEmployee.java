package case_study.utils.readFile;

import case_study.model.EmployeeModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<EmployeeModel> readFileEmployee(String path){
        List<EmployeeModel> employeeModelList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                EmployeeModel employeeModel;
                String[] array;
                while ((line = bufferedReader.readLine()) != null){
                    array = line.split(",");
                    String name=array[0];
                    String dOB=array[1];
                    String gender=array[2];
                    String idCard=array[3];
                    String phoneNumber=array[4];
                    String email=array[5];
                    String employeeCode=array[6];
                    String level=array[7];
                    String position=array[8];
                    String wage=array[9];
                    employeeModel = new EmployeeModel(name,dOB,gender,idCard,phoneNumber,email,employeeCode,level,position,wage);
                    employeeModelList.add(employeeModel);
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
        }return employeeModelList;
    }
}
