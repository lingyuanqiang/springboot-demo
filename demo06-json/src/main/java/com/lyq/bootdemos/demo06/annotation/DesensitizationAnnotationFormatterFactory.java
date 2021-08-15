package com.lyq.bootdemos.demo06.annotation;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 19:47
 */
public class DesensitizationAnnotationFormatterFactory implements AnnotationFormatterFactory<Desensitization> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        Set<Class<?>> hashSet = new HashSet<>();
        hashSet.add(String.class);
        return hashSet;
    }

    @Override
    public Printer<?> getPrinter(Desensitization desensitization, Class<?> aClass) {
        return getFormatter(desensitization);
    }

    @Override
    public Parser<?> getParser(Desensitization desensitization, Class<?> aClass) {
        return getFormatter(desensitization);
    }

    private DesensitizationFormatter getFormatter(Desensitization desensitization) {
        DesensitizationFormatter formatter = new DesensitizationFormatter();
        formatter.setTypeEnum(desensitization.type());
        return formatter;
    }
}
