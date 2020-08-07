package com.salary.enums;

/**
 * 自定义的查询方法
 *
 * @author lingjian
 * @date 2020/8/7 14:48
 */
public enum QueryType {
    /**
     * 相等
     */
    EQUAL,
    /**
     * 大于等于
     */
    GREATER_THAN,
    /**
     * 小于等于
     */
    LESS_THAN,
    /**
     * 中模糊查询
     */
    INNER_LIKE,
    /**
     * 左模糊查询
     */
    LEFT_LIKE,
    /**
     * 右模糊查询
     */
    RIGHT_LIKE,
    /**
     * 小于
     */
    LESS_THAN_NQ,
    /**
     * 包含
     */
    IN,
    /**
     * 不等于
     */
    NOT_EQUAL,
    /**
     * between,在两者之间
     */
    BETWEEN,
    /**
     * 不为空
     */
    NOT_NULL,
    /**
     * 为空
     */
    IS_NULL
}
