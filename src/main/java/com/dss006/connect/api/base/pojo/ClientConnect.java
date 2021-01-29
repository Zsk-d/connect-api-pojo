package com.dss006.connect.api.base.pojo;

/**
 * 通用连接接口
 *
 * @author daishaoshu
 */
public interface ClientConnect {

    /**
     * 向设备连接发送异步消息
     *
     * @param msg 消息对象
     * @return 响应结果
     */
    void sendMsg(ApiMsg msg);

    /**
     * 客户端连接关闭
     */
    void close();
}
