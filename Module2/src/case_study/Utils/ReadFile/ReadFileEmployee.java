package case_study.Utils.ReadFile;

import case_study.Model.EmployeeModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<EmployeeModel> readFile(String path){
        List<EmployeeModel> employeeModelList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] arr = line.split(",");
                    EmployeeModel employeeModel = new EmployeeModel(arr[0], arr[1], arr[2], arr[3], arr[4],arr[5],arr[6],arr[7],arr[8],Double.parseDouble(arr[9]));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }return employeeModelList;
    }
}
