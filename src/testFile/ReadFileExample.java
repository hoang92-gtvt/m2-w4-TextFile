package testFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bR = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bR.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bR.close();

            System.out.println("Tổng"+sum);

        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("file không tồn tại, hoặc nội dung file có lỗi");
        }
    }
}
