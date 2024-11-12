package com.zhuzi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuzi.entity.AttachmentFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttachmentFileMapper extends BaseMapper<AttachmentFile> {

    List<AttachmentFile> pageList(@Param("offset") int offset, @Param("pageSize") int pageSize);
}
