package com.zhuzi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_attachment_file")
public class AttachmentFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 附件业务类型：0、合同|1、房源
     */
    private Integer businessType;

    /**
     * 业务id
     */
    private Long businessId;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件相对路径
     */
    private String filePath;

    /**
     * 附件大小
     */
    private String fileSize;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除：0、否|1、是
     */
    private Integer deleted;
}
