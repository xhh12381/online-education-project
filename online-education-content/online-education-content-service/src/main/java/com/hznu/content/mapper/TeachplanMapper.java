package com.hznu.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hznu.content.model.dto.TeachplanDto;
import com.hznu.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author Haohao Xu
 */
public interface TeachplanMapper extends BaseMapper<Teachplan> {
    /**
     * 查询某课程的课程计划，组成树型结构
     * @param courseId 课程ID
     * @return 查询到的课程计划
     */
    List<TeachplanDto> selectTreeNodes(long courseId);
}
