package com.chilx.mybatis.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.chilx.mybatis.entity.BaseEntity;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author chilx
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        setFieldValByName(BaseEntity.VERSION, 1, metaObject);
        setFieldValByName(BaseEntity.CREATE_TIME, now, metaObject);
        setFieldValByName(BaseEntity.CREATE_USER, 9464L, metaObject);
        setFieldValByName(BaseEntity.UPDATE_TIME, now, metaObject);
        setFieldValByName(BaseEntity.UPDATE_USER, 9464L, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        setFieldValByName(BaseEntity.UPDATE_TIME, now, metaObject);
        setFieldValByName(BaseEntity.UPDATE_USER, 94641L, metaObject);
    }
}
