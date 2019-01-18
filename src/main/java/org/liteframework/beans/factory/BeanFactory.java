package org.liteframework.beans.factory;

import org.liteframework.beans.exception.BeanException;
import org.liteframework.beans.exception.NoSuchBeanDefinitionException;

public interface BeanFactory {
    <T> T getBean(String name, Class<T> type) throws BeanException;
    <T> T getBean(Class<T> type) throws BeanException;
    Object getBean(String name, Object... args) throws BeanException;
    boolean containsBean(String beanName);
    Class getType(String beanName) throws NoSuchBeanDefinitionException;

}
