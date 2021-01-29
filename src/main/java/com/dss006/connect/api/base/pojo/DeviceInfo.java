package com.dss006.connect.api.base.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 设备信息
 *
 * @author daishaoshu
 */
@Getter
@Setter
@Builder
@ToString
public class DeviceInfo {

    private Integer id;

    private String deviceCode;

    private Integer ownerId;

    private String deviceName;

    private Integer deviceType;
}