package com.lyq.bootdemos.demo08.resolver;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/15 19:47
 */
public class HtmlViewResolver implements View {
    @Override
    public String getContentType() {
        return MediaType.TEXT_HTML_VALUE;
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().write("<html><body style='color:green'>This is [HTML] view?</body></html>");
    }
}
