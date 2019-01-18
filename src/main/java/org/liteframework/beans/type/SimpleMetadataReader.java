package org.liteframework.beans.type;

import org.liteframework.beans.resource.Resource;

import java.io.IOException;

public class SimpleMetadataReader implements MetadataReader {
    private Resource resource;
    private ClassMetadata classMetadata;
    private AnnotationMetadata annotationMetadata;

    SimpleMetadataReader(Resource resource, ClassLoader classLoader) throws IOException {

    }

    @Override
    public Resource getResource() {
        return null;
    }

    @Override
    public ClassMetadata getClassMetadata() {
        return null;
    }

    @Override
    public AnnotationMetadata getAnnotationMetadata() {
        return null;
    }
}
