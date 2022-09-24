package com.mochen.api.shop.auth.service;

import com.mochen.api.shop.auth.request.LoginByPasswordRequest;
import com.mochen.api.shop.auth.vo.LoginVO;
import com.mochen.common.model.Result;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 登录接口
 */
@Api(tags = "登录相关api")
@RequestMapping("/shop/login")
public interface LoginService {

    @ApiOperation(value = "账号密码登录", notes = "通过账号密码登录",
            extensions = {@Extension(name = "状态", properties = {@ExtensionProperty(name = "开发状态", value = "已定义")})})
    @ApiImplicitParam(name = "loginByPasswordRequest", value = "账号密码登录入参", dataType = "LoginByPasswordRequest", required = true, paramType = "body")
    @RequestMapping(value = "/loginByPassword", method = RequestMethod.POST)
    @ApiResponses({@ApiResponse(code = 200, message = "成功")})
    Result<LoginVO> loginByPassword(@RequestBody LoginByPasswordRequest loginByPasswordRequest);
}
