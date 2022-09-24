package com.mochen.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.io.Serializable;

@Data
@AllArgsConstructor
public class Result <T>  implements Serializable {

    public static final Integer OK = 20000;
    public static final Integer ERROR = 40000;

    private static final long serialVersionUID = 1L;
    public Integer code;
    public String errorMessage;
    public T data;

    public static <T>Result<T> success(T data) {
        return new Result<>(OK, null, data);
    }

    public static <T>Result<T> success() {
        return new Result<>(OK, null, null);
    }

    public static <T>Result<T> error(String errorMessage) {
        return new Result<>(ERROR, errorMessage, null);
    }

    public static <T>Result<T> error(String errorMessage, T data) {
        return new Result<>(ERROR, errorMessage, data);
    }

}
