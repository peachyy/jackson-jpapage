package com.peachyy.jackson.support;


import com.fasterxml.jackson.databind.module.SimpleModule;

import org.springframework.data.domain.Page;

/**
 * @Author Xs.Tao
 * @Date 2018/7/11
 */

public class JacksonJpaPageModuleSupport extends SimpleModule {
    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(Page.class, PageMixIn.class);
    }
}
