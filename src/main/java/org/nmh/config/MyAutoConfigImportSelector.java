package org.nmh.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
            "org.nmh.config.autoconfig.TomcatWebServerConfig",
            "org.nmh.config.autoconfig.DispatcherServletConfig"
        };
    }
}
