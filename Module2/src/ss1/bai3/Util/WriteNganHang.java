package ss1.bai3.Util;

import ss1.bai3.Model.NganHangModel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteNganHang {
    public static void writeFile(List<NganHangModel> list, String path) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (NganHangModel nganHang : list) {
                bufferedWriter.write(nganHang.convertLine());
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
