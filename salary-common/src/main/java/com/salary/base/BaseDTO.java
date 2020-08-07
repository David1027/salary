package com.salary.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 基础DTO
 *
 * @author lingjian
 * @date 2020/8/7 15:00
 */
@Data
public class BaseDTO implements Serializable {

    @ApiModelProperty(value = "创建人", hidden = true)
    private String createBy;

    @ApiModelProperty(value = "更新人", hidden = true)
    private String updateBy;

    @ApiModelProperty(value = "创建时间", hidden = true)
    private Timestamp createTime;
    
    @ApiModelProperty(value = "更新时间", hidden = true)
    private Timestamp updateTime;

}
