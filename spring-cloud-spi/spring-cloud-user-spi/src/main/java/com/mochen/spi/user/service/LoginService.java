package com.mochen.spi.user.service;

import com.mochen.common.model.Result;
import com.mochen.spi.user.request.LoginRequest;
import com.mochen.spi.user.model.LoginDTO;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 登录接口
 */
@Api(tags = "登录相关api")
@RequestMapping("/login")
public interface LoginService {

    @ApiOperation(value = "登录", notes = "登录",
            extensions = {@Extension(name = "状态", properties = {@ExtensionProperty(name = "开发状态", value = "已定义")})})
    @ApiImplicitParam(name = "loginRequest", value = "登录入参", dataType = "LoginRequest", required = true, paramType = "body")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiResponses({@ApiResponse(code = 200, message = "成功")})
    LoginDTO login(@RequestBody LoginRequest loginRequest);
}
