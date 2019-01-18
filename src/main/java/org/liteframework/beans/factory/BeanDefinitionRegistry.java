package org.liteframework.beans.factory;

import org.liteframework.beans.exception.BeanDefinitionRegistryException;
import org.liteframework.beans.exception.NoSuchBeanDefinitionException;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionRegistryException;
    void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;
    BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;
    boolean containsBeanDefinition(String beanName);
    int getBeanDefinitionCount();
    String[] getBeanDefinitaionNames();
}
