package com.haha;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
        file.createNewFile();
        File file1=new File("3.19_file\\abc.txt");
        file1.createNewFile();
        File file2=new File("文件夹");
        file2.mkdir();
    }
}
