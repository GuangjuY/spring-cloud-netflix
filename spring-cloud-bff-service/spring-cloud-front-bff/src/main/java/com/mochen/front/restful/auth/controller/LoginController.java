package com.mochen.front.restful.auth.controller;


import com.mochen.common.model.Result;
import com.mochen.front.facade.user.LoginFacade;
import com.mochen.front.infrastructure.mapstruct.auth.LoginMapStruct;
import com.mochen.front.restful.auth.request.LoginByPasswordRequest;
import com.mochen.front.restful.auth.response.LoginByPasswordResponse;
import com.mochen.spi.user.request.LoginRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录接口
 */
@Tag(name = "登录认证API", description = "提供用户登录和身份认证相关功能")
@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final LoginFacade loginFacade;
    private final LoginMapStruct loginMapStruct;

    @Operation(
            summary = "账号密码登录",
            description = "用户通过提供账号和密码进行身份认证，成功后返回包含Token的登录信息。",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "包含用户账号和密码的登录请求参数。",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = LoginByPasswordRequest.class)
                    )
            ),
            extensions = { // Extensions are still supported
                    @Extension(name = "X-Custom-Status", properties = {
                            @ExtensionProperty(name = "development-status", value = "已定义")
                    })
            }
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "登录成功",
                    content = @Content(
                            mediaType = "application/json",
                            // Describe the response schema, including generics if possible
                            schema = @Schema(implementation = Result.class) // For a more detailed schema, you would document Result<LoginVO> in your DTOs
                    )
            ),
            @ApiResponse(responseCode = "401", description = "认证失败，账号或密码无效"),
            @ApiResponse(responseCode = "500", description = "服务器内部错误")
    })
    @PostMapping("/loginByPassword")
    public Result<LoginByPasswordResponse> loginByPassword(@RequestBody LoginByPasswordRequest loginByPasswordRequest) {
        LoginRequest loginRequest = new LoginRequest().setPhone("121").setPhoneCode("123456");
        com.mochen.spi.user.response.LoginResponse loginDTO = loginFacade.login(loginRequest);
        return Result.success(loginMapStruct.ToVO(loginDTO));
    }
}
