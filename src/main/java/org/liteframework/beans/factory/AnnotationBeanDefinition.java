package org.liteframework.beans.factory;

import org.liteframework.beans.type.AnnotationMetadata;
import org.liteframework.beans.type.StandardAnnotationMetadata;

public class AnnotationBeanDefinition extends AbstractBeanDefinition {

    private final AnnotationMetadata annotationMetadata;

    protected AnnotationBeanDefinition(String name, Class type) {
        super(name, type);
        annotationMetadata = new StandardAnnotationMetadata(type);
    }

    protected AnnotationBeanDefinition(Class type) {
        this(type.getSimpleName(), type);
    }

    public AnnotationMetadata getAnnotationMetadata() {
        return annotationMetadata;
    }
}
