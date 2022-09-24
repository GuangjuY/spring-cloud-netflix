package com.mochen.common.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class UniqueIdUtils {

    // todo 后续进行真正的实践封装
    public static Long getUniqueLongId(){
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        return snowflake.nextId();
    }
}
