package com.lyq.bootdemos.demo06.filter;

import com.alibaba.fastjson.serializer.ValueFilter;
import com.github.pagehelper.Page;
import com.lyq.bootdemos.demo06.annotation.Desensitization;
import com.lyq.bootdemos.demo06.utils.DesensitizationUtils;
import com.lyq.bootdemos.demo06.utils.SensitiveTypeEnum;

import java.lang.reflect.Field;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 21:32
 */
public class ValueDesensitizeFilter implements ValueFilter {

    @Override
    public Object process(Object o, String s, Object o1) {
        System.out.println(s);
        if (Page.class == o1.getClass()){
            return o1;
        }
        if (o1 instanceof Long){
            return o1 + "";
        }
        if (null == o1 || !(o1 instanceof String) || ((String) o1).length() == 0){
            return o1;
        }
        try {
            Field field = o.getClass().getDeclaredField(s);
            Desensitization desensitization = null;
            if (String.class != field.getType() || (desensitization = field.getAnnotation(Desensitization.class)) == null){
                System.out.println("12345");
                return o1;
            }
            String valueStr = (String) o1;
            SensitiveTypeEnum type = desensitization.type();
            System.out.println(111111);
            if (type == SensitiveTypeEnum.PHONE){
                System.out.println(2222222);
                return DesensitizationUtils.hiddenPhone(valueStr);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return o1;
        }
        return o1;
    }
}
