package com.sunchaser.shushan.serialize;

/**
 * 序列化器
 *
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2022/7/12
 */
public interface Serializer {

    /**
     * 将对象进行序列化
     *
     * @param obj 待序列化的对象
     * @param <T> 对象泛型类型
     * @return 序列化后的byte字节数组
     */
    <T> byte[] serialize(T obj);

    /**
     * 将二进制字节数组进行反序列化
     *
     * @param data  二进制字节数组
     * @param clazz 待反序列化的class类型
     * @param <T>   泛型类型
     * @return 反序列化后的对象
     */
    <T> T deserialize(byte[] data, Class<T> clazz);
}
