package com.ws.demo.util;

/**
 * Created by pansiheng on 2020/10/16.
 */

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class JsonUtils {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);
    /**
     * 设置一些通用的属性
     */
    static {
        //开启反序列化时忽略未知属性
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 如果json中有新增的字段并且是实体类类中不存在的，不报错
        // mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        // 如果存在未知属性，则忽略不报错
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许key没有双引号
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 允许key有单引号
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 允许整数以0开头
        mapper.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        // 允许字符串中存在回车换行控制符
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
    }
  

    public static String toJsonStr(Object data) {
        try {
            String result = mapper.writeValueAsString(data);
            return result;
        } catch (JsonProcessingException e) {
            logger.error("对象转json字符串出现异常,data:{}", data.toString(), e);
        }
        return null;
    }

    public static <T> T jsonToObj(String jsonData, Class<T> beanType) {
        if (StringUtils.isBlank(jsonData)){
            return null;
        }
        try {
            T result = mapper.readValue(jsonData, beanType);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, beanType);

        try {
            List<T> resultList = mapper.readValue(jsonData, javaType);
            return resultList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <K, V> Map<K, V> jsonToMap(String jsonData, Class<K> keyType, Class<V> valueType) {
        JavaType javaType = mapper.getTypeFactory().constructMapType(Map.class, keyType, valueType);

        try {
            Map<K, V> resultMap = mapper.readValue(jsonData, javaType);
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Map<String, Object> jsonToMap(String jsonData) {
        JavaType javaType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class);

        try {
            Map<String, Object> resultMap = mapper.readValue(jsonData, javaType);
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String tryGetJsonLog(Object object) {
        try {
            String result = mapper.writeValueAsString(object);
            return result;
        } catch (Exception e) {
            logger.error("尝试日志获取json格式出现异常", e);
            return object.toString();
        }
    }


    public static String getString(Map map, String key) {
        Object value = map.get(key);
        return value == null ? null : value.toString();
    }

   

    public static String toJSONString(Object obj) {
        return obj != null ? toJSONString(obj, () -> "", false) : "";
    }

    public static String toFormatJSONString(Object obj) {
        return obj != null ? toJSONString(obj, () -> "", true) : "";
    }

    public static JsonNode toJsonNode(String json) {
        try {
            JsonNode jsonNode = mapper.readTree(json);
            return jsonNode;
        } catch (Exception e) {
            logger.error("json解析为对象错误 json:{}", json, e);
        }

        return null;
    }


    public static String toJSONString(Object obj, Supplier<String> defaultSupplier, boolean format) {
        try {
            if (obj == null) {
                return defaultSupplier.get();
            }
            if (obj instanceof String) {
                return obj.toString();
            }
            if (obj instanceof Number) {
                return obj.toString();
            }
            if (format) {
                return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            }
            return mapper.writeValueAsString(obj);
        } catch (Throwable e) {
            logger.error(String.format("toJSONString %s", obj != null ? obj.toString() : "null"), e);
        }
        return defaultSupplier.get();
    }

    public static <T> T toJavaObject(String value, Class<T> tClass) {
        return StringUtils.isNotBlank(value) ? toJavaObject(value, tClass, () -> null) : null;
    }

    public static <T> T toJavaObject(Object obj, Class<T> tClass) {
        return obj != null ? toJavaObject(toJSONString(obj), tClass, () -> null) : null;
    }

    public static <T> T toJavaObject(String value, Class<T> tClass, Supplier<T> defaultSupplier) {
        try {
            if (StringUtils.isBlank(value)) {
                return defaultSupplier.get();
            }
            return mapper.readValue(value, tClass);
        } catch (Throwable e) {
            logger.error(String.format("toJavaObject exception: \n %s\n %s", value, tClass), e);
        }
        return defaultSupplier.get();
    }

    public static <T> List<T> toJavaObjectList(String value, Class<T> tClass) {
        return StringUtils.isNotBlank(value) ? toJavaObjectList(value, tClass, () -> null) : null;
    }

    public static List<HashMap> toJavaMapList(String value) {
        return StringUtils.isNotBlank(value) ? toJavaMapList(value, () -> null) : null;
    }

    public static <T> List<T> toJavaObjectList(Object obj, Class<T> tClass) {
        return obj != null ? toJavaObjectList(toJSONString(obj), tClass, () -> null) : null;
    }

    public static <T> List<T> toJavaObjectList(String value, Class<T> tClass, Supplier<List<T>> defaultSupplier) {
        try {
            if (StringUtils.isBlank(value)) {
                return defaultSupplier.get();
            }
            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, tClass);
//            TypeReference<List<T>> typeReference = new TypeReference<List<T>>() {};
            return (List<T>) mapper.readValue(value, javaType);
        } catch (Throwable e) {
            logger.error(String.format("toJavaObjectList exception \n%s\n%s", value, tClass), e);
        }
        return defaultSupplier.get();
    }

    public static List<HashMap> toJavaMapList(String value, Supplier<List<HashMap>> defaultSupplier) {
        try {
            if (StringUtils.isBlank(value)) {
                return defaultSupplier.get();
            }
            TypeReference<List<HashMap>> typeReference = new TypeReference<List<HashMap>>() {
            };
            return (List<HashMap>) mapper.readValue(value, typeReference);
        } catch (Throwable e) {
            logger.error(String.format("toJavaObjectList exception \n%s", value), e);
        }
        return defaultSupplier.get();
    }

    // 简单地直接用json复制或者转换(Cloneable)
    public static <T> T jsonCopy(Object obj, Class<T> tClass) {
        return obj != null ? toJavaObject(toJSONString(obj), tClass) : null;
    }

    public static Map<String, Object> toMap(String value) {
        return StringUtils.isNotBlank(value) ? toMap(value, () -> null) : null;
    }

    public static Map<String, Object> toMap(Object value) {
        return value != null ? toMap(value, () -> null) : null;
    }

    public static Map<String, Object> toMap(Object value, Supplier<Map<String, Object>> defaultSupplier) {
        if (value == null) {
            return defaultSupplier.get();
        }
        try {
            if (value instanceof Map) {
                return (Map<String, Object>) value;
            }
        } catch (Exception e) {
            logger.info("fail to convert" + toJSONString(value), e);
        }
        return toMap(toJSONString(value), defaultSupplier);
    }

    public static Map<String, Object> toMap(String value, Supplier<Map<String, Object>> defaultSupplier) {
        if (StringUtils.isBlank(value)) {
            return defaultSupplier.get();
        }
        try {
            return toJavaObject(value, LinkedHashMap.class);
        } catch (Exception e) {
            logger.error(String.format("toMap exception\n%s", value), e);
        }
        return defaultSupplier.get();
    }


    public static List<Object> toList(String value) {
        return StringUtils.isNotBlank(value) ? toList(value, () -> null) : null;
    }

    public static List<Object> toList(Object value) {
        return value != null ? toList(value, () -> null) : null;
    }

    public static List<Object> toList(String value, Supplier<List<Object>> defaultSuppler) {
        if (StringUtils.isBlank(value)) {
            return defaultSuppler.get();
        }
        try {
            return toJavaObject(value, List.class);
        } catch (Exception e) {
            logger.error("toList exception\n" + value, e);
        }
        return defaultSuppler.get();
    }

    public static List<Object> toList(Object value, Supplier<List<Object>> defaultSuppler) {
        if (value == null) {
            return defaultSuppler.get();
        }
        if (value instanceof List) {
            return (List<Object>) value;
        }
        return toList(toJSONString(value), defaultSuppler);
    }

    public static void main(String[] args) throws Exception {
    }

}