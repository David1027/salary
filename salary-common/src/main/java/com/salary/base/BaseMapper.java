package com.salary.base;

import java.util.List;

/**
 * mapStruct基础转换接口
 *
 * @author lingjian
 * @date 2020/8/7 15:07
 */
public interface BaseMapper<D, E> {
    /**
     * DTO转Entity
     *
     * @param dto /
     * @return /
     */
    E toEntity(D dto);

    /**
     * Entity转DTO
     *
     * @param entity /
     * @return /
     */
    D toDto(E entity);

    /**
     * DTO集合转Entity集合
     *
     * @param dtoList /
     * @return /
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * Entity集合转DTO集合
     *
     * @param entityList /
     * @return /
     */
    List<D> toDto(List<E> entityList);
}