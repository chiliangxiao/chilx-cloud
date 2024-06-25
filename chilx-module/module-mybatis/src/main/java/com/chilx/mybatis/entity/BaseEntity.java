package com.chilx.mybatis.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * @author chilx
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseEntity {

    /**
     * 版本号
     */
    @Version
    @TableField(value = "version", fill = FieldFill.INSERT)
    private Integer version;

    /**
     * 是否删除
     */
    @TableField(value = "is_del", fill = FieldFill.INSERT)
    private Boolean del;
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    private Long createUser;
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(value = "update_user", fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /** the constant of field {@link BaseEntity#del} */
    public static final String DEL = "del";
    /** the constant of field {@link BaseEntity#createUser} */
    public static final String CREATE_USER = "createUser";
    /** the constant of field {@link BaseEntity#createTime} */
    public static final String CREATE_TIME = "createTime";
    /** the constant of field {@link BaseEntity#updateUser} */
    public static final String UPDATE_USER = "updateUser";
    /** the constant of field {@link BaseEntity#updateTime} */
    public static final String UPDATE_TIME = "updateTime";
    /** the constant of field {@link BaseEntity#version} */
    public static final String VERSION = "version";
}
