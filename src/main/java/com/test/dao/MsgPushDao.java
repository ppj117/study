package com.test.dao;

import com.test.model.MsgPushEntity;

public interface MsgPushDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(MsgPushEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(MsgPushEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    MsgPushEntity selectByPrimaryKey(String id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MsgPushEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MsgPushEntity record);
}