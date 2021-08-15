package com.lyq.bootdemos.demo04.mapper;

import com.lyq.bootdemos.demo04.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/13 0:57
 */

@Component
public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> getAll();

    @Select("SELECT * FROM student where id=#{id}")
    Student getById(@Param("id") int id);
}
