package org.liteframework.beans.factory;

public abstract class AbstractBeanDefinition implements BeanDefinition {
    private String name;
    private Class type;


    public AbstractBeanDefinition(String name, Class type) {
        this.name = name;
        this.type = type;
    }

    public AbstractBeanDefinition(Class type) {
        this(type.getSimpleName(), type);
    }

    @Override
    public void setType(Class type) {
        this.type = type;
    }

    @Override
    public Class getType() {
        return type;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
