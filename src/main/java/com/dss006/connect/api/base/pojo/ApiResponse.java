package com.dss006.connect.api.base.pojo;

import com.alibaba.fastjson.JSON;
import lombok.*;

/**
 * @author daishaoshu
 */

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private Integer status = null;

    private Object data = null;

    public String toJsonString() {
        return JSON.toJSONString(this);
    }
}
