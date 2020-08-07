package com.salary.annotation;

import com.salary.enums.JoinType;
import com.salary.enums.QueryType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JPA的基础查询接口
 *
 * @author lingjian
 * @date 2020/8/7 14:44
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Query {

    /**
     * 基础对象的属性名
     */
    String propName() default "";

    /**
     * 基础查询方法：默认相等
     */
    QueryType type() default QueryType.EQUAL;

    /**
     * 连接查询的属性名，如User类中的dept
     */
    String joinName() default "";

    /**
     * 连接方法：默认左连接
     */
    JoinType join() default JoinType.LEFT;

    /**
     * 多字段模糊查询，仅支持String类型字段，多个用逗号隔开
     * 如@Query(blurry = "email,username")
     */
    String blurry() default "";

}
