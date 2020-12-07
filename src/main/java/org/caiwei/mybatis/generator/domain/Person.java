package org.caiwei.mybatis.generator.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

/**
 * 相关人员表 Do
 * @date 2020-12-07
 */
@Data
@Builder
public class Person {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 流水号
     */
    private String serialNo;

    /**
     * 创建人id
     */
    private String tellerNo;

    /**
     * 创建人姓名
     */
    private String tellerName;

    /**
     * 任务类型
     */
    private String taskType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 任务创建时间
     */
    private LocalDate createTime;

    /**
     * 任务结束时间
     */
    private LocalDateTime updateTime;
}