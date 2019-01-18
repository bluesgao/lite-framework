package org.liteframework.beans.type;

import java.lang.annotation.Annotation;
import java.util.LinkedHashSet;
import java.util.Set;

public class StandardAnnotationMetadata extends StandardClassMetadata implements AnnotationMetadata {
    public StandardAnnotationMetadata(Class clazz) {
        super(clazz);
    }

    @Override
    public Set<String> getAnnotationTypes() {
        Set<String> types = new LinkedHashSet<String>();
        Annotation[] annotations = getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            types.add(annotation.annotationType().getName());
        }
        return types;
    }

    @Override
    public boolean hasAnnotation(String annotationType) {
        Annotation[] annotations = getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().getName().equals(annotationType)) {
                return true;
            }
        }
        return false;
    }
}
