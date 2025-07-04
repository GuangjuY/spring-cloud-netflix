package com.mochen.front.restful.auth;

import com.mochen.api.front.auth.response.LoginByPasswordResponse;
import com.mochen.api.front.auth.service.LoginService;
import com.mochen.api.front.auth.request.LoginByPasswordRequest;
import com.mochen.common.model.Result;
import com.mochen.front.facade.user.LoginFacade;
import com.mochen.front.infrastructure.mapstruct.auth.LoginMapStruct;
import com.mochen.spi.user.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginServiceImpl implements LoginService {

    private final LoginFacade loginFacade;
    private final LoginMapStruct loginMapStruct;

    @Override
    public Result<LoginByPasswordResponse> loginByPassword(@RequestBody LoginByPasswordRequest loginByPasswordRequest) {
        LoginRequest loginRequest = new LoginRequest().setPhone("121").setPhoneCode("123456");
        com.mochen.spi.user.response.LoginResponse loginDTO = loginFacade.login(loginRequest);
        return Result.success(loginMapStruct.ToVO(loginDTO));
    }
}
