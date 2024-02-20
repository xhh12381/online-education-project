package com.hznu.content.test;

import com.hznu.base.model.PageParams;
import com.hznu.base.model.PageResult;
import com.hznu.content.model.dto.CourseCategoryTreeDto;
import com.hznu.content.model.dto.QueryCourseParamsDto;
import com.hznu.content.model.po.CourseBase;
import com.hznu.content.service.CourseBaseInfoService;
import com.hznu.content.service.CourseCategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CourseCategoryServiceTests {

    @Autowired
    CourseCategoryService courseCategoryService;

    @Test
    public void testCourseCategoryService() {
        List<CourseCategoryTreeDto> res =  courseCategoryService.queryTreeNodes("1");
        System.out.println(res);
    }
}
