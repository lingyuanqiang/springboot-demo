package com.lyq.bootdemos.demo06.annotation;

import com.lyq.bootdemos.demo06.utils.DesensitizationUtils;
import com.lyq.bootdemos.demo06.utils.SensitiveTypeEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 19:39
 */
public class DesensitizationFormatter implements Formatter<String> {

    private SensitiveTypeEnum typeEnum;

    public SensitiveTypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(SensitiveTypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    @Override
    public String parse(String s, Locale locale) throws ParseException {
        if (StringUtils.isNotBlank(s)){
            switch (typeEnum){
                case PHONE:
                    s = DesensitizationUtils.hiddenPhone(s);
                    break;
                default:
            }
        }
        return s;
    }

    @Override
    public String print(String s, Locale locale) {
        return null;
    }
}
