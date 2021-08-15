package com.lyq.bootdemos.demo04.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyq.bootdemos.demo04.domain.Student;
import com.lyq.bootdemos.demo04.mapper.StudentMapper;
import com.lyq.bootdemos.demo04.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/13 1:11
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Student> list = studentMapper.getAll();
        PageInfo<Student> info = new PageInfo<>(list);
        return info.getList();
    }

    @Override
    public Student get(Integer id) {
        return studentMapper.getById(id);
    }
}
