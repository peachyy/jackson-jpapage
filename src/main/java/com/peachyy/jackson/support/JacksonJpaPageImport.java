package com.peachyy.jackson.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author Xs.Tao
 * @Date 2018/7/11
 */

public class JacksonJpaPageImport implements ImportBeanDefinitionRegistrar {
    private static final Logger LOGGER = LoggerFactory.getLogger(JacksonJpaPageImport.class);

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinition =
                BeanDefinitionBuilder.rootBeanDefinition(JacksonJpaPageModuleSupport.class);
        registry.registerBeanDefinition("jacksonJpaPage", beanDefinition.getBeanDefinition());
        LOGGER.debug("registry jacksonJpaPage uccessfuly");
    }
}
