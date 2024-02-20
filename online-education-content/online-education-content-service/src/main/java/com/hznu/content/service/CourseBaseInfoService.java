package com.hznu.content.service;

import com.hznu.base.model.PageParams;
import com.hznu.base.model.PageResult;
import com.hznu.content.model.dto.AddCourseDto;
import com.hznu.content.model.dto.CourseBaseInfoDto;
import com.hznu.content.model.dto.EditCourseDto;
import com.hznu.content.model.dto.QueryCourseParamsDto;
import com.hznu.content.model.po.CourseBase;

/**
 * 课程信息管理接口
 */
public interface CourseBaseInfoService {

    // 课程分页查询
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程Service接口
     *
     * @param companyId    机构ID
     * @param addCourseDto 课程信息
     * @return 课程新增详细信息
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * 根据课程ID查询课程信息
     *
     * @param courseId 课程ID
     * @return 查询到的课程信息
     */
    CourseBaseInfoDto getCourseBaseInfo(long courseId);

    /**
     * 修改课程Service接口
     * @param companyId 公司ID
     * @param editCourseDto 修改课程的信息
     * @return 修改课程的详细信息
     */
    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto editCourseDto);

}
