package com.lyq.bootdemos.demo06.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 19:20
 */
public class DesensitizationUtils {

    public static String hiddenPhone(String phone){
        if (StringUtils.isBlank(phone)){
            return "";
        }
        return phone.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$1****$2");
    }

}
