package com.peachyy.annotation;


import com.peachyy.jackson.support.JacksonJpaPageImport;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Xs.Tao
 * @Date 2018/7/12
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({JacksonJpaPageImport.class})
@Inherited
@Documented
public @interface EnableJacksonJpaPage {
}
