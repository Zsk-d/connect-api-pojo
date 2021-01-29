package com.dss006.connect.api.base.pojo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.ValueFilter;
import lombok.*;

import java.util.*;

/**
 * api消息类
 *
 * @author daishaoshu
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiMsg {

    public static final String NAME_PARAMS = "params";

    /**
     * 设备号
     */
    private String deviceCode;

    /**
     * 参数列表
     */
    private Map<String, Object> params;

    public String getStringParam(String key) {
        return getStringParam(key, null);
    }

    public String getStringParam(String key, String defaultValue) {
        String value = (String) this.params.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public Integer getIntegerParam(String key) {
        return getIntegerParam(key, null);
    }

    public Long getLongParam(String key) {
        return getLongParam(key, null);
    }

    public Float getFloatParam(String key) {
        return getFloatParam(key, null);
    }

    public Double getDoubleParam(String key) {
        return getDoubleParam(key, null);
    }

    public Long getLongParam(String key, Long defaultValue) {
        Long value = (Long) this.params.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public Integer getIntegerParam(String key, Integer defaultValue) {
        Integer value = (Integer) this.params.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public Float getFloatParam(String key, Float defaultValue) {
        Float value = (Float) this.params.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public Double getDoubleParam(String key, Double defaultValue) {
        Double value = (Double) this.params.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public Boolean getBoolParam(String key, Boolean defaultValue) {
        Boolean value = (Boolean) this.params.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public <T> T getObjectParam(String key, Class<T> t) {
        String objStr = (String) this.params.get(key);
        return JSON.parseObject(objStr, t);
    }

    public JSONObject getJSONObjectParam(String key) {
        return (JSONObject) this.params.get(key);
    }

    public byte[] getBytesParam(String key) {
        Object o = this.params.get(key);
        if (o instanceof String) {
            return this.params.get(key).toString().getBytes();
        } else if (o instanceof byte[]) {
            return (byte[]) this.params.get(key);
        } else {
            return null;
        }
    }

    public Map<String, Object> getMapParam(String key) {
        Map<String, Object> res = null;
        Object value = this.params.get(key);
        if (value != null) {
            res = (Map<String, Object>) value;
        }
        return res;
    }

    public <T> List<T> getObjList(String key, Class<T> t) {
        JSONArray jsonArray = (JSONArray) this.params.get(key);
        return jsonArray == null ? null : jsonArray.toJavaList(t);
    }

    public String toJsonString() {
        class ByteValueFilter implements ValueFilter {

            @Override
            public Object process(Object object, String name, Object value) {
                if (name.equals(NAME_PARAMS)) {
                    try {
                        Map<String, Object> params = (Map<String, Object>) value;
                        Set<String> keys = params.keySet();
                        for (String key : keys) {
                            if (params.get(key).getClass() == byte[].class) {
                                params.put(key, new String((byte[]) params.get(key)));
                            }
                        }
                        return params;
                    } catch (Exception e) {
                    }
                }
                return value;
            }
        }
        ByteValueFilter byteValueFilter = new ByteValueFilter();
        return JSON.toJSONString(this, byteValueFilter);
    }

    public Object removeParam(String key) {
        return this.params.remove(key);
    }

    public Object removeParam(String key, Object value) {
        return this.params.remove(key, value);
    }

    public static class ApiMsgMaker {

        private Map<String, Object> params;
        private String deviceCode;

        public ApiMsgMaker() {
            this.params = new HashMap<>(5);
        }

        public ApiMsgMaker param(String key, Object value) {
            this.params.put(key, value);
            return this;
        }

        public ApiMsgMaker deviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }

        public ApiMsg toApiMsg() {
            return ApiMsg.builder().params(this.params).deviceCode(this.deviceCode).build();
        }

    }

    public static ApiMsgMaker apiMsgMaker() {
        return new ApiMsgMaker();
    }

}
