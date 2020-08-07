package com.salary.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 *  用于判断是否过滤数据权限
 *      1、如果没有用到@OneToOne这种关系，只需要填写 [fieldName]
 *          @DataPermission(fieldName = "id")
 *      2、如果用到了@OneToOne这种关系，[fieldName] 和 [joinName] 都需要填写
 *          @DataPermission(fieldName = "id", joinName = "dept")
 * </p>
 *
 * @author lingjian
 * @date 2020/8/7 14:38
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataPermission {

    /**
     * Entity 中的字段名称
     */
    String fieldName() default "";

    /**
     * Entity 中与部门关联的字段名称
     */
    String joinName() default "";
}
