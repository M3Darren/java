package com.loy.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.awt.font.MultipleMaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileDownOrUpLoad {

    @RequestMapping("/downLoad")
    public ResponseEntity<byte[]> downLoad(HttpSession session) throws IOException {
//        获取ServletContext对象
        ServletContext context = session.getServletContext();
//        获取服务器文件路径
        String realPath = context.getRealPath("/static/upload/1.jpg");
//        创建输入流
        FileInputStream fileInputStream = new FileInputStream(realPath);
//        创建字节数组
        byte[] bytes = new byte[fileInputStream.available()];//available读满字节
//        将流读入字节数组
        fileInputStream.read(bytes);
//        创建HttpHeaders对象设置响应头信息
        MultiValueMap<String,String> httpHeaders = new HttpHeaders();
//        设置下载方式以及下载的文件名字
        httpHeaders.add("Content-Disposition","attachment;filename=1.jpg");
//        设置响应码
        HttpStatus httpStatus = HttpStatus.OK;
//        创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, httpHeaders, httpStatus);
//        关闭流
        fileInputStream.close();
        return responseEntity;
    }

//    文件上传
    @RequestMapping("/upLoad")
    public String upLoad(MultipartFile upLoadFile,HttpSession session) throws IOException {
        String name = upLoadFile.getName();//获取请求参数名
        String originalFilename = upLoadFile.getOriginalFilename();//获取上传文件名
//        防止文件重名
        String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        originalFilename=uuid+suffixName;
        ServletContext context = session.getServletContext();
        String realPath = context.getRealPath("/static/upload");

        String filePath=realPath+ File.separator+originalFilename;
        upLoadFile.transferTo(new File(filePath));//此时文件上传到的是tomcat服务器，不是项目下的文件夹，而是target下
        return "success";
    }
}
