package com.lyq.bootdemos.demo03.controller;

import com.lyq.bootdemos.demo03.domain.Student;
import com.lyq.bootdemos.demo03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/13 1:33
 */
@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Student> find(@RequestParam(name="pageNum", required = false, defaultValue = "1") Integer pageNum,
                              @RequestParam(name="pageSize", required = false, defaultValue = "20") Integer pageSize){
        return studentService.getAll(pageNum, pageSize);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable(name = "id") Integer id){
        return studentService.get(id);
    }
}
