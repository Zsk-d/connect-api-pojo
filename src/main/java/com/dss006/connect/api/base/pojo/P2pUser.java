package com.dss006.connect.api.base.pojo;

import lombok.*;

import java.sql.Timestamp;

/**
 * @author daishaoshu
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class P2pUser {

    private Integer id;
    private String ip;
    private Integer port;
    private Timestamp updateTime;
}
