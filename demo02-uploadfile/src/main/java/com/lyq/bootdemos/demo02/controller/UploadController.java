package com.lyq.bootdemos.demo02.controller;

import com.lyq.bootdemos.demo02.domain.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadController {

    @Value("${uploadFolder}")
    private String fileDir;

    @RequestMapping("/picUpload")
    public String picUpload(){
        return "picUpload";
    }

    @ResponseBody
    @PostMapping("/upload")
    public Object upload(MultipartFile fileUpload){
        String filename = fileUpload.getOriginalFilename();
        String suffixName = filename.substring(filename.lastIndexOf("."));
        filename = UUID.randomUUID()+suffixName;

        try{
            System.out.println("------>>" + fileDir);
            File dir = new File(fileDir);
            if (!dir.exists()){
                dir.mkdirs();
            }
            File upload_file = new File(fileDir + filename);
            fileUpload.transferTo(upload_file);
            return new Message(0, "success to upload");
        } catch (IOException e) {
            return new Message(-1, "fail to upload");
        }
    }

    @RequestMapping("/multiUpload")
    public String multiUpload(){
        return "multiUpload";
    }

    @RequestMapping(value="/uploadMultifile", method= RequestMethod.POST)
    @ResponseBody
    public Object uploadMultiFile(@RequestParam("attachment") MultipartFile[] fileupload){
        try{
            for(int i=0; i<fileupload.length; i++){
                String fileName = fileupload[i].getOriginalFilename();
                File dir = new File(fileDir);
                if (!dir.exists()){
                    dir.mkdirs();
                }
                if (fileupload[i]!=null){
                    File upload_file = new File(fileDir + fileName);
                    fileupload[i].transferTo(upload_file);
                }
            }
            return new Message(0, "上传多图片成功");
        } catch (IOException e) {
            e.printStackTrace();
            return new Message(-1, "上传多图片失败");
        }
    }
}
