package com.mochen.spi.user.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Schema(description = "登录Response")
public class LoginResponse {

    @Schema(description = "用户", example = "1464947847161376769")
    private String userId;
    @Schema(description = "手机号", example = "178****1234")
    private String name;
    @Schema(description = "token", example = "xxxx")
    private String token;

}
