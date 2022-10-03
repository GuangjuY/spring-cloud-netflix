package com.mochen.spi.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(description = "登录VO")
public class LoginDTO {

    @ApiModelProperty(value = "用户", example = "1464947847161376769")
    private String userId;
    @ApiModelProperty(value = "手机号", example = "178****1234")
    private String name;
    @ApiModelProperty(value = "token", example = "xxxx")
    private String token;

}
