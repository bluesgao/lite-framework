package org.liteframework.beans.type;

import org.liteframework.util.Assert;

import java.lang.reflect.Modifier;

public class StandardClassMetadata implements ClassMetadata {
    private Class clazz;

    public StandardClassMetadata(Class clazz) {
        Assert.notNull(clazz, "Class must not be null");
        this.clazz = clazz;
    }

    @Override
    public String getClassName() {
        return clazz.getName();
    }

    @Override
    public boolean isInterface() {
        return clazz.isInterface();
    }

    @Override
    public boolean isAbstract() {
        return Modifier.isAbstract(clazz.getModifiers());
    }

    @Override
    public boolean isConcrete() {
        if (isInterface() || isAbstract()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isFinal() {
        return Modifier.isFinal(clazz.getModifiers());
    }

    @Override
    public boolean hasSuperClass() {
        if (clazz.getSuperclass() == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getSuperClassName() {
        Class superClass = clazz.getSuperclass();
        if (superClass != null) {
            return superClass.getName();
        } else {
            return null;
        }
    }

    @Override
    public String[] getInterfaceNames() {
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces == null || interfaces.length == 0) {
            return null;
        }

        String[] interfaceNames = new String[interfaces.length];
        for (int i = 0; i < interfaces.length; i++) {
            interfaceNames[i] = interfaces[i].getName();
        }
        return interfaceNames;
    }
}
