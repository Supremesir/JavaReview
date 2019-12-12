package com.supremesir.experiment3;

import java.io.*;
import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 10:07
 */

public class FileLearn {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要读取的路径");
        String readerPath = scanner.next();
        File readerFile = new File(readerPath);
        System.out.println("请输入要写入的路径");
        String writerPath = scanner.next();
        File writerFile = new File(writerPath);

        System.out.println("是不是文件夹：" + readerFile.isDirectory());
        System.out.println("是不是文件：" + readerFile.isFile());

        if (readerFile.isDirectory()) {
            //list方法获取dir里的文件名
            String[] fileList = readerFile.list();
            for (String s : fileList) {
                System.out.println(s);
            }
            //listFiles方法获取dir里文件的绝对路径
            File[] fileList1 = readerFile.listFiles();
            for (File s : fileList1) {
                System.out.println(s);
            }
        }


        FileReader fileReader = new FileReader(readerFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(writerFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //一行一行地读写
        String line = null;
        while ((line = bufferedReader.readLine())!=null) {
            bufferedWriter.write(line+"\n");

            //换行 或者 在line后加上\n
            //bufferedWriter.newLine();

            //强制将缓冲区里的内容写入
            bufferedWriter.flush();
        }
        //关闭buffer
        bufferedReader.close();
        bufferedWriter.close();

    }
}
