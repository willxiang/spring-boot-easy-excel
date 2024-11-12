package com.zhuzi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuzi.entity.AttachmentFile;

import java.util.List;

public interface AttachmentFileService extends IService<AttachmentFile> {

    List<AttachmentFile> getList(int offset, int pageSize);
}
