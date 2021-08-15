package com.lyq.bootdemos.demo04.service;

import com.lyq.bootdemos.demo04.domain.Student;

import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/13 1:09
 */
public interface StudentService {
    List<Student> getAll(Integer pageNum, Integer pageSize);

    Student get(Integer id);
}
