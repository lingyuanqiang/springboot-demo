package com.lyq.bootdemos.demo03.mapper;

import com.lyq.bootdemos.demo03.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/13 0:57
 */
@Component
public interface StudentMapper {
    List<Student> getAll();
    Student getById(@Param("id") int id);
}
