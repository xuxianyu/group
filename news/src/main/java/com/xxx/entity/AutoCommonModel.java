package com.xxx.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Created by xianyu on 17-1-2.
 *继承映射父类
 */
@MappedSuperclass
@Data
@NoArgsConstructor
public class AutoCommonModel {
    private String remark;
    private String createDatetime;
    private String createUser;
    private String updateLastDatetime;
    private String updateLastUser;
    @Version
    private Integer version;
    private Integer delFlag;
}
