package com.chilx.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "u_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名称
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 版本号
     */
    @TableField(value = "version")
    private Integer version;

    /**
     * 是否删除
     */
    @TableField(value = "is_del")
    private Byte isDel;

    @TableField(value = "create_user")
    private Long createUser;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_user")
    private Long updateUser;

    @TableField(value = "update_time")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_AGE = "age";

    public static final String COL_GENDER = "gender";

    public static final String COL_VERSION = "version";

    public static final String COL_IS_DEL = "is_del";

    public static final String COL_CREATE_USER = "create_user";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_USER = "update_user";

    public static final String COL_UPDATE_TIME = "update_time";
}