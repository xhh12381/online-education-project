package com.hznu.media.service;

import com.hznu.base.model.PageParams;
import com.hznu.base.model.PageResult;
import com.hznu.media.model.dto.QueryMediaParamsDto;
import com.hznu.media.model.po.MediaFiles;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 媒资文件管理业务类
 */
public interface MediaFileService {

 /**
  * @description 媒资文件查询方法
  * @param pageParams 分页参数
  * @param queryMediaParamsDto 查询条件
  * @return com.hznu.base.model.PageResult<com.hznu.media.model.po.MediaFiles>
  * @author Mr.M
  * @date 2022/9/10 8:57
 */
 public PageResult<MediaFiles> queryMediaFiels(Long companyId,PageParams pageParams, QueryMediaParamsDto queryMediaParamsDto);


}
