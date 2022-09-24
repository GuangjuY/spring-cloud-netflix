//package com.mochen.common.utils;
//
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.JavaType;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.util.List;
//
//
//public class JsonUtils {
//
//    public static final ObjectMapper MAPPER = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//    /**
//     * 将对象转换成JSON格式字符串
//     *
//     * @param data POJO
//     * @return string
//     */
//    public static String objectToJson(Object data) {
//        try {
//            return MAPPER.writeValueAsString(data);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     * 将JSON格式字符串转对象
//     *
//     * @param jsonData JSON格式字符串
//     * @param beanType POJO对象
//     * @return POJO
//     */
//    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
//        try {
//            return MAPPER.readValue(jsonData, beanType);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    /**
//     * 将json数据转换成pojo对象list
//     *
//     * @param jsonData JSON格式数据
//     * @param beanType POJO
//     */
//    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
//        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
//        try {
//            return MAPPER.readValue(jsonData, javaType);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//
//}
