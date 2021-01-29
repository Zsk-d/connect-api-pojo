package com.dss006.connect.api.base.pojo;

import lombok.*;

/**
 * @author daishaoshu
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class P2pMessage {

    public static final int ACTION_TYPE_REG = 0;
    public static final int ACTION_TYPE_ACTIVE = 1;
    public static final int ACTION_TYPE_GROUP_INFO = 2;
    public static final int ACTION_TYPE_GROUP_NEED_REG = 3;
    public static final int ACTION_TYPE_ACTIVE_OK = 4;
    public static final int ACTION_TYPE_ADD_USER = 5;
    public static final int ACTION_TYPE_BREAK_HOLE = 6;
    public static final int ACTION_TYPE_BREAK_HOLE_OK = 7;
    public static final int ACTION_TYPE_EXIT_GROUP = 8;
    public static final int ACTION_TYPE_NORMAL_MSG = 9;
    public static final int ACTION_TYPE_NORMAL_MSG_OK = 10;
    public static final int ACTION_TYPE_TRANSFER_MSG_OK = 11;
    public static final int ACTION_TYPE_HEARTBEAT_MSG = 12;

    public static final int ACTION_TYPE_TRANSFER_TO_USER = 13;
    public static final int ACTION_TYPE_TRANSFER_TO_GROUP = 14;

    public static final int ACTION_TYPE_FILE_MSG = 15;
    public static final int ACTION_TYPE_GET_FILE_MSG = 16;
    public static final int ACTION_TYPE_NO_FILE_MSG = 17;

    public static final String NAME_ACTION = "action";
    public static final String NAME_GROUP_CODE = "groupCode";
    public static final String NAME_MSG_ID = "msgId";
    public static final String NAME_USERS = "users";
    public static final String NAME_IP = "ip";
    public static final String NAME_PORT = "port";
    public static final String NAME_API_MSG = "apiMsg";
    public static final String NAME_USER = "user";
    public static final String NAME_NORMAL_MSG = "normalMsg";

    public static final String NAME_FILE_TYPE = "fileType";
    public static final String NAME_FILE_TYPE_IMG = "img";
    public static final String NAME_FILE_TYPE_AUDIO = "audio";
    public static final String NAME_FILE_TYPE_VIDEO = "video";
    public static final String NAME_FILE_MD5 = "fileCode";
    public static final String NAME_FILE_NAME = "fileName";
    public static final String NAME_FILE_LENGTH = "fileLength";
    public static final String NAME_FILE_GET_LENGTH = "fileGetLength";
    public static final String NAME_FILE_OFFSET = "offset";
    public static final String NAME_FILE_DATA = "data";

    private Integer action;
    private String groupCode;
    private String ip;
    private Integer port;
}
