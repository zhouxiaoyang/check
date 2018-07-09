package com.checkpoint.check.util;

import com.checkpoint.check.exception.MyException;
import com.checkpoint.check.form.NoteForm;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件操作util
 */
public class FileUtil {

    //private final static String FILE_PATH="/root/webapp/lawfile" ;
    private final static String FILE_PATH="/usr/local/webapp/lawfile" ;
    //private final static String FILE_PATH="D://LAW" ;



    /**
     * 将字符串写入指定文件名的文件中
     *
     * @param fileName
     * @param str
     */
    public static void writeToFile(String fileName, String str) {
        try {

            String fullPath = FILE_PATH + File.separator + fileName + ".txt";
            System.out.print("路径==" + fullPath);

            File file = new File(FILE_PATH, fileName + ".txt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            PrintWriter pfp = new PrintWriter(file, "UTF-8");
            //str=  new String(str.getBytes("ISO-8859-1"), "utf-8");
            pfp.print(str);
            pfp.close();
            //throw new Exception("test!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.print("写入文件失败!!");
            throw new MyException(1, "生成笔录失败!!");
        }

    }

    /**
     * 获取文件夹下所有文件名
     *
     * @return
     */
    public static String[] fileNames(String folderPath) {
        String[] fileName = null;
        if (StringUtils.isEmpty(folderPath) || "".equals(folderPath)) folderPath = FILE_PATH;
        File file = new File(folderPath);
        //文件夹存在  去找该文件夹下所有文件
        if (file.getParentFile().exists()) {
            fileName = file.list();
        }
        return fileName;
    }

    /**
     * 将文件夹下的文件读取封装成一个list  分页功能待实现
     *
     * @param fileNames 文件名数组
     * @return
     */
    public static List getFileInfoList(String[] fileNames) {
        List list = new ArrayList();
       // Gson gson = new Gson();
        if (null != fileNames && fileNames.length > 0) {
            for (String fileName : fileNames) {
                String str = readToString(fileName);
                //  str=str.replaceAll(" ", "").replaceAll("\\","");

                NoteForm s = JsonUtil.fromJson(str, NoteForm.class);
                list.add(s);
            }
        }
        return list;
    }

    /**
     * 读取文件
     *
     * @param fileName
     * @return
     */
    public static String readToString(String fileName) {
        System.out.println(FILE_PATH);
        String encoding = "UTF-8";
        File file = new File(FILE_PATH + File.separator + fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new MyException(2, "笔录文件不存在!");
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(1, "读取笔录文件失败!!");
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            //System.err.println("The OS does not support " + encoding);
          // System.out.println();
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 修改文件/ 删除文件后再写入一份
     * status 0:成功  1:文件不存在  2:修改失败
     */
    public static void updateFileInfo(String fileName, String info) {
        //  int status=0;
        File file = new File(FILE_PATH + File.separator + fileName + ".txt");
        //文件不存在
        if (!file.exists()) {
            throw new MyException(1, "文件不存在! ");
            //  return 1;
        }
        try {
            writeToFile(fileName, info);


        } catch (Exception e) {
            e.printStackTrace();
            //  status=2;
            throw new MyException(2, "修改失败!");
        }

        // return status;
    }

}
