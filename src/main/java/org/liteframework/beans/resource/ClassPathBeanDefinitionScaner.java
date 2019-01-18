package org.liteframework.beans.resource;

import org.liteframework.beans.factory.BeanDefinition;
import org.liteframework.beans.factory.BeanDefinitionRegistry;
import org.liteframework.util.Assert;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassPathBeanDefinitionScaner {
    private BeanDefinitionRegistry beanDefinitionRegistry;

    public ClassPathBeanDefinitionScaner(BeanDefinitionRegistry beanDefinitionRegistry) {
        this.beanDefinitionRegistry = beanDefinitionRegistry;
    }

    public int scan(String... basePackages) {
        int beanCountAtScanStart = this.beanDefinitionRegistry.getBeanDefinitionCount();
        doScan(basePackages);
        return this.beanDefinitionRegistry.getBeanDefinitionCount() - beanCountAtScanStart;
    }

    private void doScan(String[] basePackages) {
        Assert.notEmpty(basePackages, "At least one base package must be specified");
        Set<BeanDefinition> beanDefinitionSet = new LinkedHashSet<BeanDefinition>();
        for (String basePackage : basePackages) {

        }
    }
}
