package com.hznu.content.service;

import com.hznu.content.model.dto.SaveTeachplanDto;
import com.hznu.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * 课程基本信息管理业务接口
 */
public interface TeachplanService {

    /**
     * 查询课程计划树型结构
     *
     * @param courseId 课程id
     * @return TeachplanDto列表
     */
    List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * 保存课程计划
     *
     * @param teachplanDto 课程计划信息
     */
    void saveTeachplan(SaveTeachplanDto teachplanDto);

}

