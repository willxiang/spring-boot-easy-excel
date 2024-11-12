package com.zhuzi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhuzi.entity.AttachmentFile;
import com.zhuzi.mapper.AttachmentFileMapper;
import com.zhuzi.service.AttachmentFileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AttachmentFileServiceImpl extends ServiceImpl<AttachmentFileMapper, AttachmentFile> implements AttachmentFileService {

    @Autowired
    private AttachmentFileMapper attachmentFileMapper;


    @Override
    public List<AttachmentFile> getList(int offset, int pageSize) {
        return attachmentFileMapper.pageList(offset, pageSize);
    }
}
