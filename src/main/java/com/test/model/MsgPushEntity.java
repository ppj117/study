package com.test.model;

import java.util.Date;

public class MsgPushEntity {
    /**
     * <pre>
     * id
     * 表字段 : tb_msg_push.id_
     * </pre>
     */
    private String id;

    /**
     * <pre>
     * 商场编码
     * 表字段 : tb_msg_push.mall_code_
     * </pre>
     */
    private String mallCode;

    /**
     * <pre>
     * 发送标题
     * 表字段 : tb_msg_push.push_title_
     * </pre>
     */
    private String pushTitle;

    /**
     * <pre>
     * 发送内容
     * 表字段 : tb_msg_push.push_content_
     * </pre>
     */
    private String pushContent;

    /**
     * <pre>
     * 发送时间
     * 表字段 : tb_msg_push.push_time_
     * </pre>
     */
    private String pushTime;

    /**
     * <pre>
     * 接收人手机号码,全部时为0
     * 表字段 : tb_msg_push.acc_mobile_
     * </pre>
     */
    private String accMobile;

    /**
     * <pre>
     * 发送类别:1积分通知，2会员活动，3礼品兑换，4系统通知
     * 表字段 : tb_msg_push.msg_type_
     * </pre>
     */
    private Integer msgType;

    /**
     * <pre>
     * 发送状态 0:未发送,1:成功 2:失败
     * 表字段 : tb_msg_push.push_status_
     * </pre>
     */
    private Integer pushStatus;

    /**
     * <pre>
     * 发送渠道 1:通知中心 2:消息盒子
     * 表字段 : tb_msg_push.to_channel_
     * </pre>
     */
    private String toChannel;

    /**
     * <pre>
     * 绑定事件的相关参数
     * 表字段 : tb_msg_push.push_agrs
     * </pre>
     */
    private String pushAgrs;

    /**
     * <pre>
     * 创建人ID
     * 表字段 : tb_msg_push.create_by_
     * </pre>
     */
    private String createBy;

    /**
     * <pre>
     * 创建人名称
     * 表字段 : tb_msg_push.create_by_name_
     * </pre>
     */
    private String createByName;

    /**
     * <pre>
     * 创建时间
     * 表字段 : tb_msg_push.create_time_
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 获取：id
     * 表字段：tb_msg_push.id_
     * </pre>
     *
     * @return tb_msg_push.id_：id
     */
    public String getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：id
     * 表字段：tb_msg_push.id_
     * </pre>
     *
     * @param id
     *            tb_msg_push.id_：id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * <pre>
     * 获取：商场编码
     * 表字段：tb_msg_push.mall_code_
     * </pre>
     *
     * @return tb_msg_push.mall_code_：商场编码
     */
    public String getMallCode() {
        return mallCode;
    }

    /**
     * <pre>
     * 设置：商场编码
     * 表字段：tb_msg_push.mall_code_
     * </pre>
     *
     * @param mallCode
     *            tb_msg_push.mall_code_：商场编码
     */
    public void setMallCode(String mallCode) {
        this.mallCode = mallCode == null ? null : mallCode.trim();
    }

    /**
     * <pre>
     * 获取：发送标题
     * 表字段：tb_msg_push.push_title_
     * </pre>
     *
     * @return tb_msg_push.push_title_：发送标题
     */
    public String getPushTitle() {
        return pushTitle;
    }

    /**
     * <pre>
     * 设置：发送标题
     * 表字段：tb_msg_push.push_title_
     * </pre>
     *
     * @param pushTitle
     *            tb_msg_push.push_title_：发送标题
     */
    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle == null ? null : pushTitle.trim();
    }

    /**
     * <pre>
     * 获取：发送内容
     * 表字段：tb_msg_push.push_content_
     * </pre>
     *
     * @return tb_msg_push.push_content_：发送内容
     */
    public String getPushContent() {
        return pushContent;
    }

    /**
     * <pre>
     * 设置：发送内容
     * 表字段：tb_msg_push.push_content_
     * </pre>
     *
     * @param pushContent
     *            tb_msg_push.push_content_：发送内容
     */
    public void setPushContent(String pushContent) {
        this.pushContent = pushContent == null ? null : pushContent.trim();
    }

    /**
     * <pre>
     * 获取：发送时间
     * 表字段：tb_msg_push.push_time_
     * </pre>
     *
     * @return tb_msg_push.push_time_：发送时间
     */
    public String getPushTime() {
        return pushTime;
    }

    /**
     * <pre>
     * 设置：发送时间
     * 表字段：tb_msg_push.push_time_
     * </pre>
     *
     * @param pushTime
     *            tb_msg_push.push_time_：发送时间
     */
    public void setPushTime(String pushTime) {
        this.pushTime = pushTime == null ? null : pushTime.trim();
    }

    /**
     * <pre>
     * 获取：接收人手机号码,全部时为0
     * 表字段：tb_msg_push.acc_mobile_
     * </pre>
     *
     * @return tb_msg_push.acc_mobile_：接收人手机号码,全部时为0
     */
    public String getAccMobile() {
        return accMobile;
    }

    /**
     * <pre>
     * 设置：接收人手机号码,全部时为0
     * 表字段：tb_msg_push.acc_mobile_
     * </pre>
     *
     * @param accMobile
     *            tb_msg_push.acc_mobile_：接收人手机号码,全部时为0
     */
    public void setAccMobile(String accMobile) {
        this.accMobile = accMobile == null ? null : accMobile.trim();
    }

    /**
     * <pre>
     * 获取：发送类别:1积分通知，2会员活动，3礼品兑换，4系统通知
     * 表字段：tb_msg_push.msg_type_
     * </pre>
     *
     * @return tb_msg_push.msg_type_：发送类别:1积分通知，2会员活动，3礼品兑换，4系统通知
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * <pre>
     * 设置：发送类别:1积分通知，2会员活动，3礼品兑换，4系统通知
     * 表字段：tb_msg_push.msg_type_
     * </pre>
     *
     * @param msgType
     *            tb_msg_push.msg_type_：发送类别:1积分通知，2会员活动，3礼品兑换，4系统通知
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * <pre>
     * 获取：发送状态 0:未发送,1:成功 2:失败
     * 表字段：tb_msg_push.push_status_
     * </pre>
     *
     * @return tb_msg_push.push_status_：发送状态 0:未发送,1:成功 2:失败
     */
    public Integer getPushStatus() {
        return pushStatus;
    }

    /**
     * <pre>
     * 设置：发送状态 0:未发送,1:成功 2:失败
     * 表字段：tb_msg_push.push_status_
     * </pre>
     *
     * @param pushStatus
     *            tb_msg_push.push_status_：发送状态 0:未发送,1:成功 2:失败
     */
    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
    }

    /**
     * <pre>
     * 获取：发送渠道 1:通知中心 2:消息盒子
     * 表字段：tb_msg_push.to_channel_
     * </pre>
     *
     * @return tb_msg_push.to_channel_：发送渠道 1:通知中心 2:消息盒子
     */
    public String getToChannel() {
        return toChannel;
    }

    /**
     * <pre>
     * 设置：发送渠道 1:通知中心 2:消息盒子
     * 表字段：tb_msg_push.to_channel_
     * </pre>
     *
     * @param toChannel
     *            tb_msg_push.to_channel_：发送渠道 1:通知中心 2:消息盒子
     */
    public void setToChannel(String toChannel) {
        this.toChannel = toChannel == null ? null : toChannel.trim();
    }

    /**
     * <pre>
     * 获取：绑定事件的相关参数
     * 表字段：tb_msg_push.push_agrs
     * </pre>
     *
     * @return tb_msg_push.push_agrs：绑定事件的相关参数
     */
    public String getPushAgrs() {
        return pushAgrs;
    }

    /**
     * <pre>
     * 设置：绑定事件的相关参数
     * 表字段：tb_msg_push.push_agrs
     * </pre>
     *
     * @param pushAgrs
     *            tb_msg_push.push_agrs：绑定事件的相关参数
     */
    public void setPushAgrs(String pushAgrs) {
        this.pushAgrs = pushAgrs == null ? null : pushAgrs.trim();
    }

    /**
     * <pre>
     * 获取：创建人ID
     * 表字段：tb_msg_push.create_by_
     * </pre>
     *
     * @return tb_msg_push.create_by_：创建人ID
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * <pre>
     * 设置：创建人ID
     * 表字段：tb_msg_push.create_by_
     * </pre>
     *
     * @param createBy
     *            tb_msg_push.create_by_：创建人ID
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * <pre>
     * 获取：创建人名称
     * 表字段：tb_msg_push.create_by_name_
     * </pre>
     *
     * @return tb_msg_push.create_by_name_：创建人名称
     */
    public String getCreateByName() {
        return createByName;
    }

    /**
     * <pre>
     * 设置：创建人名称
     * 表字段：tb_msg_push.create_by_name_
     * </pre>
     *
     * @param createByName
     *            tb_msg_push.create_by_name_：创建人名称
     */
    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：tb_msg_push.create_time_
     * </pre>
     *
     * @return tb_msg_push.create_time_：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：tb_msg_push.create_time_
     * </pre>
     *
     * @param createTime
     *            tb_msg_push.create_time_：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}