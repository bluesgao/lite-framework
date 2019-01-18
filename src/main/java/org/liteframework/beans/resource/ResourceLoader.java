package org.liteframework.beans.resource;

public interface ResourceLoader {
    Resource getResource(String location);
    ClassLoader getClassLoader();
}
