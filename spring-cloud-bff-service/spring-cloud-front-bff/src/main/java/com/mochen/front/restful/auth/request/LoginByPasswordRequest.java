package com.mochen.front.restful.auth.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(description = "账号密码登录请求")
public class LoginByPasswordRequest {

    @Schema(description = "账号")
    private String account;

    @Schema(description = "密码")
    private String password;
}
