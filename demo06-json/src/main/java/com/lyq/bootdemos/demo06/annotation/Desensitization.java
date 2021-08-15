package com.lyq.bootdemos.demo06.annotation;

import com.lyq.bootdemos.demo06.utils.SensitiveTypeEnum;

import java.lang.annotation.*;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 19:35
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface Desensitization {
    SensitiveTypeEnum type();
}
