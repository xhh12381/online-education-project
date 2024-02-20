package com.hznu.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hznu.content.model.dto.CourseCategoryTreeDto;
import com.hznu.content.model.po.CourseCategory;

import java.util.List;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author Haohao Xu
 */
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

    // 使用递归查询课程分类信息
    public List<CourseCategoryTreeDto> selectTreeNodes(String id);

}
