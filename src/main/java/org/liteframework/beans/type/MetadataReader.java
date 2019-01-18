package org.liteframework.beans.type;

import org.liteframework.beans.resource.Resource;

public interface MetadataReader {
    Resource getResource();
    ClassMetadata getClassMetadata();
    AnnotationMetadata getAnnotationMetadata();
}
