package com.lyq.bootdemos.demo06.pojo;

import com.lyq.bootdemos.demo06.annotation.Desensitization;
import com.lyq.bootdemos.demo06.utils.SensitiveTypeEnum;
import lombok.Data;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 21:03
 */
@Data
public class User {

    private Long id;

    private String name;

    @Desensitization(type= SensitiveTypeEnum.PHONE)
    private String phone;

    public User(Long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
