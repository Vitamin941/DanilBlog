package ru.isu.math.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MVCConfig.class};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterFilter filter = new CharacterFilter();
        return new Filter[] {filter};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
