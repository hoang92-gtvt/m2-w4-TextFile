package testFile;

import java.io.*;
import java.util.ArrayList;

public class TextFile {
    public boolean saveFile(ArrayList<String> dsData, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bos = new BufferedWriter(osw);
            for (String data: dsData) {
                bos.write(data);
                bos.newLine();
            }
            bos.close();
            osw.close();
            fos.close();
            return true;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<String> readFile (String filePath) throws IOException{
        ArrayList<String>  dataList = new ArrayList<>();

        FileInputStream fis = new FileInputStream(filePath);
//        throw  new Error("có lỗi");
        InputStreamReader ipR = new InputStreamReader(fis, "UTF-8");
        BufferedReader bR = new BufferedReader(ipR);

        String  line = bR.readLine();
        do {
            if(line.length()>0){
                dataList.add(line);
                line = bR.readLine();
            }
        }while (line !=null);
        bR.close();
        ipR.close();
        fis.close();
        return dataList;
    }


}
