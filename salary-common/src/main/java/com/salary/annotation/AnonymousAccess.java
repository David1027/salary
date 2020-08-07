package com.salary.annotation;

import java.lang.annotation.*;

/**
 * 标记匿名访问方法：被此注解修饰的方法，访问时不需要权限验证
 *
 * @author lingjian
 * @date 2020/8/7 14:19
 */
@Inherited
@Documented
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnonymousAccess {
}
