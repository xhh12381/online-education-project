package com.hznu.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 分页查询条件参数封装类
 */
@Data
@ToString
public class PageParams {
    //当前页码
    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;
    //每页记录数
    @ApiModelProperty("每页默认显示记录数")
    private Long pageSize = 10L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
