package com.mochen.api.front.auth.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(description = "账号密码登录请求")
public class LoginByPasswordRequest {

    @ApiModelProperty(value = "账号", required = true)
    private String account;

    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
