package org.liteframework.beans.exception;

public class NoSuchBeanDefinitionException extends BeanException {
    private String beanName;
    private Class beanClass;

    public NoSuchBeanDefinitionException(String name) {
        super("No bean named '" + name + "' is defined");
        this.beanName = name;
    }

    public NoSuchBeanDefinitionException(Class<?> type) {
        super("No unique bean of type [" + type.getName() + "] is defined");
        this.beanClass = type;
    }
}
