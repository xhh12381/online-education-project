package com.hznu.content.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hznu.base.model.PageParams;
import com.hznu.base.model.PageResult;
import com.hznu.content.mapper.CourseBaseMapper;
import com.hznu.content.mapper.CourseCategoryMapper;
import com.hznu.content.model.dto.CourseCategoryTreeDto;
import com.hznu.content.model.dto.QueryCourseParamsDto;
import com.hznu.content.model.po.CourseBase;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CourseCategoryMapperTests {

    @Autowired
    CourseCategoryMapper courseCategoryMapper;

    @Test
    public void testCourseCategoryMapper() {
        List<CourseCategoryTreeDto> res = courseCategoryMapper.selectTreeNodes("1");
        System.out.println(res);
    }
}
