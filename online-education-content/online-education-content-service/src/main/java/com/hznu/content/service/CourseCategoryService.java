package com.hznu.content.service;

import com.hznu.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

public interface CourseCategoryService {
    /**
     * 课程分类树形结构查询
     */
    List<CourseCategoryTreeDto> queryTreeNodes(String id);

}
