package ss1.bai3.Util;

import ss1.bai3.Model.NganHangModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadNganHang {
    public static List<NganHangModel> readFile(String path) {
        List<NganHangModel> sinhVienModelList = new ArrayList<>();
        File file = new File(path);
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] array = line.split(",");
                    NganHangModel nganHangModel = new NganHangModel(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
                    sinhVienModelList.add(nganHangModel);
                }
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
        return sinhVienModelList;
    }
}
