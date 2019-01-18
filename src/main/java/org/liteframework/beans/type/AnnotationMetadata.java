package org.liteframework.beans.type;

import java.util.Set;

public interface AnnotationMetadata extends ClassMetadata{
    Set<String> getAnnotationTypes();
    boolean hasAnnotation(String annotationType);

}
