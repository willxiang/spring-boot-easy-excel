package com.zhuzi.controller;

import com.zhuzi.base.ServerResponse;
import com.zhuzi.entity.AttachmentFile;
import com.zhuzi.service.AttachmentFileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 熊猫接口
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private AttachmentFileService attachmentFileService;

    @GetMapping("/getList")
    public ServerResponse<List<AttachmentFile>> getList(@RequestParam("offset") Integer offset, @RequestParam("pageSize") Integer pageSize) {
        return ServerResponse.success(attachmentFileService.getList(offset, pageSize));
    }

}
