package CaseStudy2.Util;

import CaseStudy2.Model.EmployeeManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileEmployee {
    public static List<EmployeeManager> readFileE(String path){
        List<EmployeeManager> employeeManagerList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] info;
                EmployeeManager employeeManager;
                while ((line = bufferedReader.readLine()) != null){
                    info = line.split(",");
                    String name = info[0];
                    String dateOfBirth = info[1];
                    String gender = info[2];
                    int idCardPerson = Integer.parseInt(info[3]);
                    String phoneNumber = info[4];
                    String email = info[5];
                    int employeeID = Integer.parseInt(info[6]);
                    String level = info[7];
                    String position = info[8];
                    Double wage =Double.parseDouble( info[9]);
                    employeeManager = new EmployeeManager(name,dateOfBirth,gender,idCardPerson,phoneNumber,email,employeeID,level,position,wage);
                    employeeManagerList.add(employeeManager);
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
        return employeeManagerList;
    }
    public static void writeFile(String path, List<EmployeeManager> employeeManagerList){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try{
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (EmployeeManager employee: employeeManagerList) {
                bufferedWriter.write(employee.convertLine());
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
