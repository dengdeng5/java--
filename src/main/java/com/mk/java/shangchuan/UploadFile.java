package com.mk.java.shangchuan;

import org.apache.catalina.connector.Request;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

/**
 * 1、首先有一个流文件，还要知道上传到哪里去（oss，七牛云等等）
 * @author Administrator
 * 上传文件
 */
public class UploadFile {

    public void uploadFile(Request request) throws Exception {

        //创建解析器工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建解析器
        ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
        //判断上传的是否是表单
        if (!ServletFileUpload.isMultipartContent(request)){
            return ;
        }
        //上传的是文件
        FileItemFactory fileItemFactory = servletFileUpload.getFileItemFactory();
        List<FileItem> fileItems = servletFileUpload.parseRequest(request);
        for (FileItem fileItem : fileItems) {
            if (!fileItem.isFormField()){
                String filename = fileItem.getFieldName();
                filename = filename.substring(filename.lastIndexOf("\\") + 1);
                InputStream inputStream = fileItem.getInputStream(); //得到上传数据流
                int len = 0;
                byte [] bytes = new byte[1024];
                FileOutputStream out = new FileOutputStream(filename);  //向upload目录中写入文件
                while((len=inputStream.read(bytes))>0){
                    out.write(bytes, 0, len);
                }
                inputStream.close();
                out.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("1564988769(1).png").getFile());
        int len = 0;
        byte [] bytes = new byte[1024];
        FileOutputStream out = new FileOutputStream("templates\\55.png");  //向upload目录中写入文件
        while((len=inputStream.read(bytes))>0){
            out.write(bytes, 0, len);
        }
        inputStream.close();
        out.close();

    }



}
