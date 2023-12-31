package com.sky.service;

import com.sky.dto.DishDTO;
import org.apache.ibatis.annotations.Mapper;


public interface DishService {

    /**
     *新增菜品和对应口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
