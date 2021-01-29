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
public class P2pGroup {

    private Integer id;

    private String code;

    private Timestamp createTime;
}
