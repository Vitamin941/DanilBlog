package ru.isu.math.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class CharacterFilter implements Filter {

    private static final String encoding = "UTF-8";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encoding);
        servletResponse.setContentType(String.format("text/html; charset=%s", encoding));
        servletResponse.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest, servletResponse);
    }


}
