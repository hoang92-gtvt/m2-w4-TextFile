package testFile;

import java.util.ArrayList;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {
//        ArrayList<String>  list1 = new ArrayList<>();
//        list1.add("Obama");
//        list1.add("Putin");
//        list1.add("Kim Jong Un");
//        String path = "E:/CONGVIEC/2021/MODEL2/WEEK4/TextFile/demo.text";
//
//        TextFile textFile1 = new TextFile();
//        textFile1.saveFile(list1, path);

//        System.out.println("Nhập đường link dẫn file");
//        String filePath = new Scanner(System.in).nextLine();
//        ReadFileExample readFileExample1 = new ReadFileExample();
//        readFileExample1.readFileText(filePath);

        String path = "E:/CONGVIEC/2021/MODEL2/WEEK4/TextFile/demo.text";
        TextFile texFile2= new TextFile();
        try {
            ArrayList<String> list3 = texFile2.readFile(path);
            for (String data :list3
                 ) {
                System.out.println(data);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
