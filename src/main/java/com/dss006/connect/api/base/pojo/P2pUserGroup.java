package com.dss006.connect.api.base.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * @author daishaoshu
 */
@Getter
@Setter
@Builder
public class P2pUserGroup {

    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Timestamp createTime;

}
